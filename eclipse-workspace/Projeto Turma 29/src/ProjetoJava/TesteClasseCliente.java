package ProjetoJava;



public class TesteClasseCliente {

	public static void main(String[] args) {
		int x=0;
		ClasseCliente cliente = new ClasseCliente ();
		
		x=cliente.infoCliente();
		ClasseCliente [] lista = new ClasseCliente [3];
		lista[0] = new ClasseCliente ();
		lista[1] = new ClasseCliente ();
		lista[2] = new ClasseCliente ();
		
		for(ClasseCliente roda:lista)
		{
			roda.infoCliente();
			System.out.println("*************************************");
			System.out.println("Nome:" + cliente.getNome());
		}
		
		
		
		
		
		
		
	/*	cliente.infoCliente();
		System.out.println("Nome:" + cliente.getNome());
		System.out.println("Idade:" + cliente.getIdade());
		System.out.println("Cpf:" + cliente.getCPF());
		System.out.println("Bairro:" + cliente.getBairro());
		System.out.println("Recorrência:" +cliente.isRecorrente());*/
	}

}

