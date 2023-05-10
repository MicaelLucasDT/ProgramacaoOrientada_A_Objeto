package POO.DisciplinaV2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Disciplina disciplina = new Disciplina();	
		
		System.out.println("Qual o nome do aluno? "); //faculdade, nome idade
		aluno.setNome(sc.next());
		System.out.println("Qual a faculdade do aluno? ");
		aluno.setFaculdade(sc.next());
		System.out.println("Qual a idade do aluno? ");
		aluno.setIdade(sc.nextInt());
		System.out.println("Quantas disciplinas irá informar? ");
		int qtdDisciplinas = sc.nextInt();
		
		for(int i = 1; i <= qtdDisciplinas; i++) {
			
			System.out.println("Infome a disciplina: " + i + " : ");
			String disc = sc.next();
			System.out.println("Informe a Nota: " + i + " : ");
			double nota = sc.nextDouble();
		    
			disciplina.setDisciplina(disc);
			disciplina.setNota(nota);
			aluno.getDisciplina().add(disciplina);
		}
		
		System.out.println(aluno);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
