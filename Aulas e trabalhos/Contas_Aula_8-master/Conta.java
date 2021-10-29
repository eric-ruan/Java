public class Conta {
    
    private int numero = 45;
    private String titular;
    double saldo;

    public int getNumero(){
        return this.numero;
    } //get faz a consulta.

    public void setNumero(int numero){
        this.numero = numero;
    } //set faz a alteração.
}
