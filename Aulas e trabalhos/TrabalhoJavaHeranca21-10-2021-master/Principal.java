public class Principal {
    public static void main(String[] args) {
        //criando o obeto empregado

        Empregado empregado = new Empregado();

        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(1000);
        empregado.setImposto(100);
        empregado.setNome("Rosa - Éric - Samuel - Gabriela - Felipe");
        empregado.setEndereco("Pompeia - Quintana - Marilia - Tupã");
        empregado.setTelefone("Todos com o ddd 14");

        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.calculaSalario());
    }
}
