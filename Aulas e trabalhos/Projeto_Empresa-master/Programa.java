public class Programa{//inicio da classe
    public static void main(String[] args){//inicio do método main
        
        Vendedor v = new Vendedor();//declaração da classe
        v.setDataDeEntrada("29/12/2018");//definição dos valores
		v.setDepartamento("Vendas");//definição dos valores
		v.setEstaNaEmpresa(true);//definição dos valores
		v.setNome("Eduardo");//definição dos valores
		v.setRg("45");//definição dos valores
        
        Gerente g1 = new Gerente();//declaração da classe
        g1.departamento = "Vendas";//definição dos valores
		g1.dataDeEntrada = "03/02/1990";//definição dos valores
		g1.estaNaEmpresa = true;//definição dos valores
		g1.nome = "Eric";//definição dos valores	
		g1.rg = "48";//definição dos valores
		g1.salario = 3500.0;//definição dos valores

        //definição do acesso
        g1.setLogin("eric");
        g1.setSenha("1234");

        Supervisor supervisor = new Supervisor();//declaração da classe
		supervisor.salario = 5000.0;//definição do valor

        ControleDeBonificacao controle = new ControleDeBonificacao();//declaração da classe
		controle.calculaTotalDeBonus(v);//definindo o valor
		controle.calculaTotalDeBonus(g1);//definindo o vaor
		controle.calculaTotalDeBonus(supervisor);//defindo o valor

        //prints
        System.out.println(v.getDataDeEntrada());
		System.out.println(v.getDepartamento());
		System.out.println(v.getNome());
		System.out.println(v.getRg());
		System.out.println(v.getSalario());
		System.out.println(v.isEstaNaEmpresa());
		System.out.println(v.bonifica());

        

    }//fim do metodo
}
