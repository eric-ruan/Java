//definição da classe Filme
public class Filme { // inicio da classe
    //definição das váriaveis
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;

    public int getCodigo(){
        return codigo;
    }//consultando a variavel 'código' e retornando o valor.

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }//modificando o conteúdo da váriavel 'codigo'.

    public String getNome(){
        return nome;
    }//consultando a váriavel 'nome' e retornando o valor.

    public void setNome(String nome){
        this.nome = nome;
    }//modificando o conteúdo da váriiavel 'nome'.

    public double getValor(){
        return valor;
    }//consultando a váriavel 'valor' e retornando o valor.'

    public void setValor(double valor){
        this.valor = valor;
    }//modificando o conteúdo da váriavel 'valor'.

    public boolean isDisponivel(){
        return disponivel;
    }// em váriaveis o tipo boolean usa-se o is, é igual ao get. - consultando o valor da váriavel 'disponivel'.

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }//modificando o valor da váriavel 'disponivel'.

    public void retirar(){//inicio do método
        if(disponivel == true){//se o filme estiver disponivel
            disponivel = false;//ele vai passar a estar indisponivel
        }else{//se não
            throw new RuntimeException("Este filme não está disponivel para locação!");
        }//fim do método
    }

    public void devolver(){//inicio do método
        disponivel = true;//o filme que estava indisponível vai passsar a estar disponivel após a devolução
    }//fim do método

    public void mostra(){//inicio do método
        System.out.println("Código do filme:" + this.codigo);//print codigo do filme
        System.out.println("Nome do filme:" + this.nome);//print nome do filme
        System.out.println("Valor: R$" + this.valor);//print valor do filme
        System.out.println("Disponível:" + this.disponivel);//print disponibilidade do filme
    }//fim do método

}//fechamento da classe