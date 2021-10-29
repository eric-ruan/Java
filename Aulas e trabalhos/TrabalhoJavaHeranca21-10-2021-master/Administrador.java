public class Administrador extends Empregado{
    private double ajudaCusto;
    //get e set


    @Override
    public double calculaSalario(){
        return super.calculaSalario()+ajudaCusto;
    }
}
