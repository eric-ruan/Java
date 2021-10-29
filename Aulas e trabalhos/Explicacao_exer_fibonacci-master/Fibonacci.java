public class Fibonacci{

    //Criação de um objeto
    public void fibo(int h){

        //iniciações das variaveis
        int num1 = 0;
        int num2 = 1;
        int seq = 0;
        int fibo = 0;

        //Print dos primeiros números
        System.out.print(num1 + " -> ");
        System.out.print(num2 + " -> ");

        //enquanto seq que é igual a 0 for menor que h que foi determinado que é 8:
        while(seq < h){
            //fibo que é 0 vai receber a soma de num1 e num2 que é 0+1=1
            //fibo que é 1 vai recerber a soma de num1 e num2 que é 1+1=2
            //fibo que é 2 vai recerber a soma de num1 e num2 que é 1+2=3
            //fibo que é 3 vai reber a soma de num1 e num2 que é 2+3=5
            //fibo que é 3 vai receber a soma de num1 e num2 que é 3+5=8
            //fibo que é 8 vai receber a soma de num1 e num2 que é 5+8=13
            //fibo que é 8 vai receber a soma de num1 e num2 que é 8+13=21
            //fibo que é 8 vai receber a soma de num1 e num2 que é 13+21=34
            /*-----------------FIM-----------------*/
            fibo = num1 + num2;

            //num1 vai deixar de ser 0 para ser 1
            //num1 vai deixar de ser 1 para ser 1
            //num1 vai deixar de ser 1 para ser 2
            //num1 vai deixar de ser 2 para ser 3
            //num1 vai deixar de ser 3 para ser 5
            //num1 vai deixar de ser 5 para ser 8
            //num1 vai deixar de ser 8 para ser 13
            //num1 vai deixar de ser 13 para ser 21
            /*-----------------FIM-----------------*/
            num1 = num2;

            //num2 vai deixar de ser 1 para receber a soma de num1+num2=1
            //num2 vai deixar de ser 1 para receber a soma de num1+num2=2
            //num2 vai deixar de ser 2 para receber a soma de num1+num2=3
            //num2 vai deixar de ser 3 para receber a soma de num1+num2=5
            //num2 vai deixar de ser 5 para receber a soma de num1+num2=8
            //num2 vai deixar de ser 8 para receber a soma de num1+num2=13
            //num2 vai deixar de ser 8 para receber a soma de num1+num2=21
            //num2 vai deixar de ser 21 para receber a soma de num1+num2=34
            /*-----------------FIM-----------------*/
            num2 = fibo;

            //print em fileiras
            System.out.print(fibo + " -> ");
            //vai acrescentando até 8
            seq++;
        }
        //print do final da sequencia
        System.out.println("End");
    }
}
