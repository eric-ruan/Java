public class Principal {
    public static void main(String[] args) {
        Funcionario f=new Funcionario();

        f.setNome("Éric Ruan");
        f.setCpf("111.222.333-44");
        f.setDepartamento("Programador Junior");
        f.setSalario(2600);

        System.out.println("O funiconário de nome " + f.getNome());
        System.out.println("Com o CPF " + f.getCpf());
        System.out.println("Exerce a função de " + f.getDepartamento());
        System.out.println("Por isso recebe o salário no valor de R$" + f.getSalario());
        System.out.println("O salário com a comissão fica R$" + f.bonificacao());

    }
}
