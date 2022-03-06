import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<Conta>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public void adicionarCliente(String nome){
        Cliente cliente = new Cliente(nome);
        this.clientes.add(cliente);
    }

    public void atualizarCliente(String nomeAntigo,String nomeNovo){
        Iterator<Cliente> clienteIterator = this.clientes.iterator();
        while(clienteIterator.hasNext()){
            Cliente c = clienteIterator.next();
            if(c.getName().equals(nomeAntigo)){
                c.setNome(nomeNovo);
                break;
            }
        }
    }

}
