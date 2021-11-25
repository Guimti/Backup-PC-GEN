package ProjetoJava;
import java.text.NumberFormat;
import java.util.Scanner;

public class ClasseCliente {
	
	private String nome;
	private String  CPF;
	private String bairro;
	private boolean recorrente;
	private int idade;
	
	
	//SCANNER
	Scanner leia = new Scanner (System.in);
	
	//VARIÁVEIS
	int frequencia;
	int somaIdade, mediaIdade;
	int entrada;
	int contadorIdade;
	
	//GET E SET
	
	
		public String getNome() {
			return nome;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCPF() {
			return CPF;
		}
		public void setCPF(String cPF) {
			CPF = cPF;
		}
		public boolean isRecorrente() {
			return recorrente;
		}
		public void setRecorrente(boolean recorrente) {
			this.recorrente = recorrente;
		}
	
	// MÉTODOS PROCESSAMENTO
	
	public int  infoCliente() {
		
		do {
		System.out.println("Por favor, digite 1 para começar");
		entrada = leia.nextInt();
		}
		while (entrada != 1);
		
		while (entrada ==1) 
		{
		System.out.println("Entre com seu nome");
		this.nome = leia.next();
		
			do {
			
			System.out.println("Insira seu cpf:");
			this.CPF = leia.next();	
			}
			while (getCPF().length() != 2);
			
			System.out.println("Entre com sua idade");
			this.idade = leia.nextInt();
			
			contadorIdade++;
			
			somaIdade += idade;
			
			mediaIdade = somaIdade / contadorIdade;
		
			
		System.out.println("Digite seu Bairro:");
		this.bairro = leia.next();
		System.out.println("Quantas vezes você frequentou nossa comunidade?");
		frequencia = leia.nextInt();
		
		if( frequencia >= 5) {
			recorrente = true;
		}
		else{
			recorrente = false;
		}
		
		
		
		System.out.println("Por favor, digite 1 para começar");
		entrada = leia.nextInt(); ///Saída do laço
		}
		return contadorIdade;
		
		
	}
	
	
	
}