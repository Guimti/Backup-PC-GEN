package turma29;
import java.util.Scanner;
public class RepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabuada, x=1, resultado;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\n Entre com o valor da tabuada");
		tabuada = leia.nextInt();
		
		
		do
		{
			resultado = tabuada * x;
			System.out.println("\n"+tabuada+"X"+x+"="+resultado);
			x++;
		}
		while(x<=10);
		
		
		

	}

}
