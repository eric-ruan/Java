public abstract class Funcionario {//definição de uma classe abstrata, ou seja, pode ser usada em outras classes
    //definição das váriaveis do tipo protected, que as torna acessiveis as classes do mesmo pacote ou atráves da herança.

    protected String nome;
    protected String departamento;
    protected double salario;
    protected String dataDeEntrada;
    protected String rg;
    protected boolean estaNaEmpresa;

    public String getNome(){
        return nome;
    }//consultando a váriavel e retornando o valor.

    public void setNome(String nome){
        this.nome = nome;
    }//modificando o conteudo da variavel

    public String getDepartamento(){
		return departamento;
	}//consultando a váriavel e retornando o valor.

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}//modificando o conteudo da variavel

	public double getSalario(){
		return salario;
	}//consultando a váriavel e retornando o valor.

	public void setSalario(double salario){
		this.salario = salario;
	}//modificando o conteudo da variavel

	public String getDataDeEntrada(){
		return dataDeEntrada;
	}//consultando a váriavel e retornando o valor.

	public void setDataDeEntrada(String dataDeEntrada){
		this.dataDeEntrada = dataDeEntrada;
	}//modificando o conteudo da variavel

	public String getRg(){
		return rg;
	}//consultando a váriavel e retornando o valor.

	public void setRg(String rg){
		this.rg = rg;
	}//modificando o conteudo da variavel

	public boolean isEstaNaEmpresa(){
		return estaNaEmpresa;
	}//em váriaveis do tipo boolean usa-se o is, é igual ao get. - consultando o valor da váriavel.

	public void setEstaNaEmpresa(boolean estaNaEmpresa){
		this.estaNaEmpresa = estaNaEmpresa;
	}//modificando o conteudo da variavel
	
	public void calculaSalario(double valor){//inicio de um método
		this.salario = valor - (valor * 0.06);//conta armazenada
	}//fim do método

	public void calculaSalario(double valor, double horaExtra){//inicio do método
		double valorHorasExtra = (valor/30) / 8 * horaExtra;//conta armazenada em uma variavel
		this.salario = valor - (valor*0.06) + valorHorasExtra;//conta armazenada
	}//fim do método

	public double  calculaSalario(){//inicio do metodo
		return this.salario = this.salario - (this.salario * 0.06);//retorno de salario = a ele mesmo - ele mesmo * 0.06
	}//fim do metodo

	public double bonifica(){//inicio do metodo
		return this.salario * 0.10;//retorno do salario*0.10
	}//fim do metodo
	
	public void demite(){//inicio do metodo
		estaNaEmpresa = false;//a variavel esta recebendo o valor falso
	}//fim do metodo

	public double calculaGanhoAnual(){//inicio do metodo
		return salario * 12;//retorno do salario *12
	}//fim do metodo
}
