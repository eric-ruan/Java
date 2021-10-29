import java.util.Scanner;

public class ExerciciosJava {
    public static void main(String[] args) {
        //Chamada das classes
        Exercicio1 e1 = new Exercicio1();
        Exercicio2 e2 = new Exercicio2();
        Exercicio3 e3 = new Exercicio3();
        Exercicio4 e4 = new Exercicio4();
        Exercicio5 e5 = new Exercicio5();

        //Input
        int opcao;
            System.out.println("1. Imprima todos os números de 150 a 300.");
            System.out.println("2. Imprima a soma de 1 até 1000.");
            System.out.println("3. Imprima todos os múltiplos de 3, entre 1 e 100.");
            System.out.println("4. Imprima os fatoriais de 1 a 10.");
            System.out.println("5. Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra. ");

            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
            
            //Escolha das opções pelo usuario com resultado das classes.

            if (opcao == 1){
                System.out.println("Exercicio 1");
                e1.Exer1();
            }else if (opcao == 2){
                System.out.println("Exercicio 2");
                e2.Exer2();
            }else if (opcao == 3){
                System.out.println("Exercicio 3");
                e3.Exer3();
            }else if (opcao == 4){
                System.out.println("Exercicio 4");
                e4.Exer4();
            }else if (opcao == 5){
                System.out.println("Exercicio 5");
                e5.Exer5();
            }
    }
}
