package turma29;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, media, mediaGeral, somaMedia=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=5;x++) {
			 
			System.out.println("\n Digite a primeira nota: ");
			n1 = leia.nextFloat();
			
			System.out.println("\n Digite a segunda nota: ");
			n2 = leia.nextFloat();
			
			System.out.println("\n Digite a terceira nota: ");
			n3 = leia.nextFloat();
			
			
			media = (n1 + n2 + n3) / 3 ;
			System.out.printf("\n Média: %2.2f", media);
			
			if(media>=7 && media<=10)
			{
				System.out.printf("\n Aluno aprovado !!!");
			}
			else if(media>=5 && media<7)
			{
				System.out.printf("\n Aluno de recuperação !!!");
			}
			else
			{
				System.out.printf("\n Aluno reprovado ");
			}
			
			somaMedia = somaMedia + media ;
			 
		}
			mediaGeral = somaMedia / 5;
			
			System.out.printf("\n Média geral: %2.2f", mediaGeral);

			
		}

	}


