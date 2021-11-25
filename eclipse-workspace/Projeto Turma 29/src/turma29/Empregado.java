package turma29;



public class Empregado {

	//criação dos atributos
	private double salario;
	private String nome;
	
	//criação do método especial Construtor
	public Empregado(String n,double s)
	{
		this.setNome(n); // chama o método setNome para inserir o parametro no atributo
		this.setSalario(s);
	}

	
	//criação dos métodos da classe
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
		System.out.println(nome+ "\t\t"+"Salário: ");
	}
	
}



