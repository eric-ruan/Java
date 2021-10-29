public class Gerente extends Funcionario{//inicio da classe extendida
    //criando as variaveis privadas
    private String login;
    private String senha;

    //criação dos métodos, consultas e alteração dos valores

    public String getLogin(){//inicio
		return login;
	}//fim

	public void setLogin(String login){//inicio
		this.login = login;
	}//fim

	public String getSenha(){//inicio
		return senha;
	}//fim
	public void setSenha(String senha){//inicio
		this.senha = senha;
	}//fim

    //inicio de um novo método que retorna o valor de salário *0.15
    public double bonifica(){//inicio
		return this.salario * 0.15;
	}//fim

    //método de autenticação, se login e senha estiverem corretos, 'acesso permitido', se estiverem errados 'acesso negado'
    public void autentica(String login, String senha){//inicio
		if((this.login == login) && (this.senha == senha)){
			System.out.println("Acesso Permitido!");
		}else{
			System.out.println("Acesso Negado!");
		}
    }//fim
}
