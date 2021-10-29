public class Programa {//inicio da classe Programa
    public static void main(String[] args) {//inicio do método main
        Filme f = new Filme();//declaração da classe
        f.setCodigo(29122018);//definição dos valores
        f.setNome("Simplesmente Acontece");//definição dos valores
        f.setValor(9.99);//definição dos valores
        f.devolver();//exe. da classe

        f.mostra();//exe. da classe

        f.retirar();//exe. da classe

        f.mostra();//exe. da classe

        
        //os comandos try e catch servem para tratamento de exceções 
        try{
            f.retirar();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }// fim do método main
}// fim da classe programa
