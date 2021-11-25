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
		System.out.println("\n Digite o número do elogio que quer mandar");
		System.out.println("\n 1- Você é brabo mlk");
		System.out.println("\n 2- Tu é um merda parceiro");
		System.out.println("\n 3- O cara é embaçado");
		System.out.println("\n 4- MLK é ensaboado");
		op = leia.nextInt();
		
		switch(op)
		{
			case 1:
				System.out.println("\n"  +nome+ "\nVocê é brabo mlk");
				break;
			case 2:
				System.out.println("\n" +nome+ "\n Tu é um merda parceiro");
				break;
			case 3:
				System.out.println("\n" +nome+ "\n  Você é embaçado parceiro");
				break;
			case 4:
				System.out.println("\n" +nome+ "\n Você é ensaboado MLK ");
				break;
				default: 
					System.out.println("\n Opção inválida lek !!!");
				
		}
		
		
		
		
	}
	
	

}
