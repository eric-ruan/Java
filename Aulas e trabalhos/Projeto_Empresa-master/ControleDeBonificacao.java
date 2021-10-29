public class ControleDeBonificacao {//inicio da classe
    private double totalDebonus;//declaração da váriavel do tipo double e privada

    public double getTotalDeBonus(){//consultando a variavel 'TotalDeBonus'
        return this.totalDebonus;//retornando a variavel 'TotalDeBonus'
    }

    public double calculaTotalDeBonus(Funcionario f){

     return this.totalDebonus + f.bonifica();//declarando uma nova variavel com uma conta de adição
    }
    public void calculaTotalDeBonus(Vendedor v) {
    }

    public void calculaTotalDeBonus(Gerente g1) {
    }
}//fim da classse
