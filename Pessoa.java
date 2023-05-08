package POO.Pessoa;

public class Pessoa {


	public String nome;
	public String sobrenome;
	public int AnoDeNascimento;
	
	public String JuntaNome() {
		
		return this.nome + " " + this.sobrenome;
	}
	
	public int idade() {
		
		int idade = 2023 - AnoDeNascimento;
		
		return idade;
	}
	
}

	

