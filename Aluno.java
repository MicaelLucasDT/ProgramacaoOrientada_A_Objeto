package POO.DisciplinaV2;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String faculdade;

	List<Disciplina> disciplina = new ArrayList<Disciplina>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Aluno: " + nome + "| Média: " + media() + "| Situação: " + situacaoAluno();
	}

	public double media() {

		double someNotas = 0.0;
		for (Disciplina disciplina : disciplina) {
			someNotas += disciplina.getNota();

		}
		return someNotas / disciplina.size();
	}

	public String situacaoAluno() {

		String situacao;
		if (media() < 70) {

			situacao = "aprovado";

		} else {

			situacao = "Reprovado";
		}
		return situacao;
	}

}
