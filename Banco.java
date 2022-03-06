import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<Conta>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void adicionarCliente(String cpf, String nome) {
        Cliente cliente = new Cliente(cpf, nome);
        this.clientes.add(cliente);
    }

    public void atualizarCliente(String nomeAntigo, String nomeNovo) {
        Iterator<Cliente> clienteIterator = this.clientes.iterator();
        while (clienteIterator.hasNext()) {
            Cliente c = clienteIterator.next();
            if (c.getName().equals(nomeAntigo)) {
                c.setNome(nomeNovo);
                break;
            }
        }
    }

    public void criarConta(int numero, String cpf) {
        Conta novaConta;
        Iterator<Cliente> clienteIterator = this.clientes.iterator();

        while (clienteIterator.hasNext()) {
            Cliente c = clienteIterator.next();

            if (c.getCpf().equals(cpf)) {
                novaConta = new Conta(numero, c);
                contas.add(novaConta);
            }
        }
    }
}
