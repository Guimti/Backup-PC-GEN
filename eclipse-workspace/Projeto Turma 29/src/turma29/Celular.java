package turma29;

public class Celular extends Telefone {
	
	
	public Celular ()
	{
		super("Telefone elular");
	}
	
	@Override //Sobrescreve
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("tandantandan");
			break;
		case 2:
			System.out.println("Tururutuutuutuu");
			break;
			default:
				System.out.println("tandantttttaaaaatatttttt.......pá");
		}
	}
	
	@Override //Sobrescreve
	public void  disca(String numero)
	
	{
		System.out.println("\n O número"+numero+"é um celular");
	}
	
	

}
