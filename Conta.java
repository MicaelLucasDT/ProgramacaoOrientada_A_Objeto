package POO.ContaBancaria;

public class Conta {

	
	private String nome;
	private int idade;
	private int numero;
	private double saldo = 0.00;
	
	
																																					
	



	public Conta(String nome, int numero, int idade) {

		this.nome = nome;
		this.numero = numero;
		this.numero = idade;
	}







	public Conta(String nome, int numero, double depositoInicial) {
		this.nome = nome;
		this.numero = numero;
		deposito(depositoInicial);
	}







	@Override
	public String toString() {
		return "Nome do titular: " + nome + " " + "| Idade: " + idade 	+ " anos| Número da conta: " + numero + " | Saldo: R$" + saldo;
	}
	
	



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	public void deposito(double valor) {
		saldo += valor;
		
		
		
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
		
		
		
	}
	
	
	
}
