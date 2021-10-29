import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
     char caracter = 'A'; //código relacionado a ela   
     String caracteres="A";

     Scanner ler=new Scanner(System.in);
    System.out.println("Digite uma letra");

    //c = sc.next().charAt(0);
    caracter=ler.next().charAt(0);

        switch(caracter){
            case 'A':
            System.out.println("Você digitou o caracter A");
            break;

            case 'E':
            System.out.println("Você digitou o caracter E");
            break;

            case 'I':
            System.out.println("Você digitou o caracter I");
            break;

            case 'O':
            System.out.println("Você digitou o caractere O");
            break;

            case 'U':
            System.out.println("Você digitou o caractere U");
            break;

        }

    }

}