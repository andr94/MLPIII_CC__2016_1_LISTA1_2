package br.unipe.mlpiii.capacitacao.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CursoCapacitacao {
	
	protected Professor professor;
	protected List<Aluno> alunos;
	protected String nome;
	protected int numeroIdentificacao;
	
	public CursoCapacitacao(Professor professor, String nome, int numeroIdentificacao){
		this.professor = professor;
		this.nome = nome;
		this.numeroIdentificacao = numeroIdentificacao;
		this.alunos = new ArrayList<>();
	}
	
	public Aluno buscaAluno(int matricula){
		for (Aluno a : alunos){
			if (a.getMatricula() == matricula)
				return a;
		}
		return null;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
		Collections.sort(alunos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

}
