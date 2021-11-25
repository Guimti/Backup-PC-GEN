package turma29;

import java.util.Scanner;

public class LacoDeisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3, media ;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com n1: ");
		n1 = leia.nextFloat();
		
		System.out.println("\n Entre com n2: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n Entre com n3: ");
		n3 = leia.nextFloat();
		
		
		media = (n1 + n2 + n3) /3 ;
		System.out.printf("\n Média: %2.2f", media);
		
		if(media>=7 && media<=10) {
			
			System.out.println("\n Aluno Aprovado ");
		}
		
		else if (media>=5 && media<7) {
			
			System.out.println("\n Aluno de exame");
		}
		
		else if (media>=0 && media<5) {
			
			System.out.println("\n Aluno Reprovado");
		}
		
		else {
			
			System.out.println("\n Média Fora do intervalo de notas");
			
		}
	}

}
