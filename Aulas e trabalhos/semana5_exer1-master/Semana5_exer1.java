/*1.Aumente a quantidade de números que terão os fatoriais impressos,
até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, 
vai começar a mostrar respostas completamente erradas. Por quê? 
Mude de int para long para ver alguma mudança no caso do fatorial de 20? e de 30 e 40?*/

public class Semana5_exer1{
    public static void main(String[] args) {
        //fazer fatorial, testar 20, 30, 40.
        long fatorial = 1;
        for(int f = 20; f >= 1; f--){
            fatorial=f*fatorial;
        }
        System.out.println("n!"+fatorial);
    }
    //Fatorial de 20 da erro com int, mas suporta com long
    //Fatorial de 30 e 40 da erro mesmo com o long, pois é muito grande, número "big"
}