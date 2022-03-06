public class Conta {
    private Cliente cliente;
    private int saldo;
    
    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    
    public int getSaldo(){
        return this.saldo;
    }

}
