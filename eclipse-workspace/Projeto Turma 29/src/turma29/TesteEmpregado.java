package turma29;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Diego Silva",10000);
		lista[1] = new Empregado("Juliana",9000);
		lista[2] = new Empregado("Mayara Luzia",20000);
		
		for(Empregado roda:lista)
		{
			roda.imprimir();
		}
		
		
		
	}

}


