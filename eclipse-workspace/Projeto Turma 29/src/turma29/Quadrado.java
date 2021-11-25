package turma29;

public class Quadrado extends BaseFigura implements Figuras {

	Quadrado(double lado1, double lado2,String nome)
	{
		super(lado1,lado2,nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal()
	{
		return Math.sqrt(2)*lado1;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	
	
	
	
}
