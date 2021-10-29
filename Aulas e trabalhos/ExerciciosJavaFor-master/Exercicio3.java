//3. Imprima todos os múltiplos de 3, entre 1 e 100.
public class Exercicio3{
    public void Exer3(){
        for(int x = 0; x <= 100; x++){
            if(x % 3 == 0){
                System.out.println(x);
            }
        }
    }
}