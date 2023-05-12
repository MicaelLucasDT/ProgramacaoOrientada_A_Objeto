package POO.ContaBancaria;

public class Conta {

	
	private String nome;
	private String sobreNome;
	private int idade;
	private int numero;
	private double saldo;
	
	
	
																																					
	@Override
	public String toString() {
		return "Nome do titular: " + nome + " " + sobreNome + "| Idade: " + idade 	+ " anos| Número da conta: " + numero + " | Saldo: R$" + saldo;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double deposito() {
		
		double saldoUP = saldo;
		
		
		
		
		return saldoUP;
	}
	
	public double saque() {
		
		double saldoUP = saldo;
		
		return saldoUP;
	}
	
}
