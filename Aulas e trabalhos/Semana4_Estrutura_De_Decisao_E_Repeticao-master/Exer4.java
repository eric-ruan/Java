//4. Imprima os fatoriais de 1 a 10.
public class Exer4{
    public void Exercicio4(){
        int fat = 1; 
        for(int n = 1; n <= 10; n++){
            fat = n * fat;
            System.out.println("O fatorial de " + n + "! é igual a " + fat);
        }
    }
}
