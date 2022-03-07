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
            if (clienteIterator.next().getName().equals(nomeAntigo)) {
                clienteIterator.next().setNome(nomeNovo);
                break;
            }
        }
    }

    public void excluirCliente(String cpf){
        for (int i = 0; i < this.clientes.size(); i++) {
            if(this.clientes.get(i).getCpf() == cpf){
                this.clientes.remove(i);
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

    public void removerConta(int numero) {
        Iterator<Conta> contaIterator = this.contas.iterator();

        while (contaIterator.hasNext()) {
            Conta c = contaIterator.next();

            if (c.getNumero() == numero) {
                contas.remove(c);
            }
        }
    }
}
