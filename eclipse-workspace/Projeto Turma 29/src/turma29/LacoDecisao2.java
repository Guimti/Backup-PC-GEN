package turma29;

import java.util.Scanner;

public class LacoDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		String nome;
		Scanner leia =new Scanner(System.in);
		
		System.out.println("\n Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n\t\t Menu de elogios");
		System.out.println("\n Digite o n?mero do elogio que quer mandar");
		System.out.println("\n 1- Voc? ? brabo mlk");
		System.out.println("\n 2- Tu ? um merda parceiro");
		System.out.println("\n 3- O cara ? emba?ado");
		System.out.println("\n 4- MLK ? ensaboado");
		op = leia.nextInt();
		
		switch(op)
		{
			case 1:
				System.out.println("\n"  +nome+ "\nVoc? ? brabo mlk");
				break;
			case 2:
				System.out.println("\n" +nome+ "\n Tu ? um merda parceiro");
				break;
			case 3:
				System.out.println("\n" +nome+ "\n  Voc? ? emba?ado parceiro");
				break;
			case 4:
				System.out.println("\n" +nome+ "\n Voc? ? ensaboado MLK ");
				break;
				default: 
					System.out.println("\n Op??o inv?lida lek !!!");
				
		}
		
		
		
		
	}
	
	

}
