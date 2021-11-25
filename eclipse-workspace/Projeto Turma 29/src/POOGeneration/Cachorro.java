package POOGeneration;

public class Cachorro extends Animal{ 

	public Cachorro (String nome, int idade, String som, String correr)
	{
		
		super(nome, idade, som, correr);
		
	}
	
	public void imprimirInfo() {
		
		System.out.println("\nNome do Animal: " +getNome() + "\n Idade do Animal: "+ getIdade() + "\n Som do Animal: " + getSom() + "\n Animal corre ?" + getCorrer());	
		
		
		
	}
	
	
	
	
}
