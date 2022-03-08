public class Transacoes {
    private String valor;
    private String cliente1;
    private String cliente2;


    public Transacoes(String cliente1, String cliente2, Integer valor) {
        this.valor = valor;
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
    }
    public Update(String cliente1, String cliente2, Integer valor) {
       this.valor = valor;
        this.cliente1 = cliente1;
        this.cliente2 = cliente2
            }
   
    public Create(String cliente1, String cliente2, Integer valor) {
       this.valor = valor;
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
     }
    public  excluirCliente(String cliente1, String cliente2){
        this.valor = 0;
        this.cliente1 = '';
        this.cliente2 = '';
    }}