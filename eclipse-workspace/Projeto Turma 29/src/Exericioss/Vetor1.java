package Exericioss;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int [] arrayUm = { 12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321} ;
		int [] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		
		float [] nota = new float[5];
		
		//tamanho do array 
		if (arrayDois.length >8)
		{
			System.out.println("\n Tamanho do array dois é maior que 8 !");
		}
		
		else 
		{
			System.out.println("\n Tamanho do array dois é menor que 8 !");
		}
		
		System.out.println("\n Tamanho do arrayUm = "+arrayUm.length);
		
			//Utilização do 	FOR-EACH
		
		String[] cars = {"Ferrari", "Lamborghini", "Tesla"};
		
		for (String i : cars)
		{
			System.out.println(i);
		}
		
 			// Populando um Array
		
		for(int i=0; i<5; i++)
		{
			System.out.println("\n Entre com uma nota");
			nota[i] = entrada.nextFloat(); 
		}
		
				// Apresentando um array
		
		for(int i=0; i<5; i++)
		{
			System.out.println(" Nota"+i+1+"="+nota[i]);
		}
		
		
		
		
		
	}

}
