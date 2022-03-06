import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<Conta>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public void adicionarCliente(String nome){
        Cliente cliente = new Cliente(nome);
        clientes.add(cliente);
    }

}
