package turma29;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com a primeira nota: ");
		nota1= leia.nextFloat();
		System.out.println("\n Entre com a segunda nota: ");
		nota2= leia.nextFloat();
		System.out.println("\n Entre com a terceira nota: ");
		nota3= leia.nextFloat();
		
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\n M�dia: "+media);
		System.out.printf("\n M�dia arredondada: %2.2f",media);
		
		nota1 = Math.sqrt(nota2);
		nota2 = Math.pow(nota3, 3);
		nota3= nota1 % nota2 ;
		
	}

}
