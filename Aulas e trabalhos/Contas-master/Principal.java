import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta minhaConta = new Conta();

        System.out.println("Digite seu nome...");
        minhaConta.titular = ler.nextLine();

        System.out.println("Digite o número da sua conta...");
        minhaConta.numero = ler.nextInt();

        System.out.println("Digite seu saldo...");
        minhaConta.saldo = ler.nextDouble();

        System.out.println("A conta no nome de " + minhaConta.titular + " possui um saldo de " + minhaConta.saldo);
        System.out.println("O número da conta é " + minhaConta.numero);

    }
}
