public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }public int getCodigoSetor(){
        return this.codigoSetor;
    }

    public void setSalarioBase(double salarioBase){
        
    }

    public double calculaSalario(){
        double salarioLiquido = 0;
        salarioLiquido=this.salarioBase-this.imposto;
        return salarioLiquido;
    }
}
