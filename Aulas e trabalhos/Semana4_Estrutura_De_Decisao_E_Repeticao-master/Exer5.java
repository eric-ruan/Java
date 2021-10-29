/* 5. (opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x */

import java.util.Scanner;
public class Exer5{
    public void Exercicio5(){
        int x;
        System.out.println("Digite um número ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        
        if (x % 2 == 0){
            x = x / 2;
            System.out.println("Valor de x: " + x);
        }else{
            x = 3 * x + 1;
            System.out.println("Valor de x: " + x);
        }
    }
}
