package turma29;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int td, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o total de dias vivido");
		td = leia.nextInt();
				
				
		anos = td/365 ;
		meses = (td%365) /30 ;
		dias = (td %365) % 30 ;
		
System.out.println("\n Voce viveu:  "+ anos +"ano(s) e"+meses+ "mes(es) e "+ dias+"dia(s) de vida..." );
		
		
	}

}
