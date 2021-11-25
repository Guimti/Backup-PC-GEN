package turma29;



public class Empregado {

	//cria��o dos atributos
	private double salario;
	private String nome;
	
	//cria��o do m�todo especial Construtor
	public Empregado(String n,double s)
	{
		this.setNome(n); // chama o m�todo setNome para inserir o parametro no atributo
		this.setSalario(s);
	}

	
	//cria��o dos m�todos da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimir()
	{
		System.out.println(nome+ "\t\t"+"Sal�rio: ");
	}
	
}



