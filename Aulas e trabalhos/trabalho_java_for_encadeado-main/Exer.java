import java.util.Scanner;
public class Exer {
    public static void main(String[] args) {
        int numb;
        System.out.println("Digite um número de 1 à 9...");
        Scanner input = new Scanner(System.in);
        numb = input.nextInt();
        
        for (int a = 0; a <= numb; a++){
            for (int b = 1; b <= a; b++){
                System.out.print((a * b) + " ");
            }
            System.out.println(" ");
        }
    }
}

/*COMO JAVA NÃO VEM COM COMANDO DE ENTRADA PADRÃO, PRECISAMOS IMPORTA-LO
import java.util.Scanner;

public class Exer{
    public static void main(String[] args) {
        DEFINIMOS A VARIAVEL NA QUAL IREMOS UTILIZAR PARA COLETAR O NÚMERO
        int numb;

        MENSAGEM PARA O USUARIO
        System.out.println("Digite um número de 1 à 9...");
        
        FAZEMOS O INPUT AQUI
        Scanner input = new Scanner(System.in);
        
        COLETA DO NÚMERO DIGITADO PELO USUARIO
        numb = input.nextInt();
        
        ESSE "FOR" EXTERNO FAZ A CONTAGEM DE 1 ATÉ O NÚMERO DIGITADO PELO USUARIO
        for (int a = 0; a <= numb; a++){
            
            O "FOR" INTERNO IMPRIME OS NÚMEROS EM FILEIRAS, PARANDO NO NUMERO RECORRENTE A CADA FILEIRA
            EXEMPLO: FILEIRA 1 TERÁ 1 NÚEMRO, A 2 2 NÚMEROS, A 3 3 NÚMEROS, ETC, ATÉ O NÚERO
            DIGITADO PELO USUARIO
            for (int b = 1; b <= a; b++){
                
                ESSE PRINT IMPRIME A MULTIPLICAÇÃO ENTRE A "CORRIDA" DO PRIMEIRO FOR COM A DO SEGUNDO
                System.out.print((a * b) + " ");
            }
            ESSE SERVE PARA PULAR LINHA
            System.out.println(" ");
        }
    }
}*/
