/* 5. (opcional) Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x */

public class Exercicio5{
    public void Exer5(){
        int x = 58;
        if (x % 2 == 0){
            x = x / 2;
            System.out.println("Valor de x: " + x);
        }else{
            x = 3 * x + 1;
            System.out.println("Valor de x: " + x);
        }
    }
}