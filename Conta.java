public class Conta {
    private int numero;
    private Cliente cliente;
    private int saldo;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getSaldo() {
        return this.saldo;
    }

}
