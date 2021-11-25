package POOGeneration;

public class Preguiça extends Animal{ 

	public  String subirArvore;
	
	
	public Preguiça (String nome, int idade, String som, String subirArvore)
	{
		
		super(nome, idade, som, subirArvore);
		this.subirArvore = subirArvore;
		
	}
	
	public void imprimirInfo() {
		
		System.out.println("\nNome do Animal: " +getNome() + "\n Idade do Animal: "+ getIdade() + "\n Som do Animal: " + getSom() + "\n Animal corre ?" +subirArvore);	
		
		
		

	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	
}
	