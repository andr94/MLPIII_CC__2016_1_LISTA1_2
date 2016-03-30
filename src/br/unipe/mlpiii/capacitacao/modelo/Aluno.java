package br.unipe.mlpiii.capacitacao.modelo;

public class Aluno extends Pessoa implements Comparable<Aluno>{
	
	protected double media;
	protected int faltas;
	
	public Aluno (String nome, int matricula, double media, int faltas){
		super(nome, matricula);
		this.media = media;
		this.faltas = faltas;
	}
	
	public int compareTo(Aluno aluno){
		if (this.nome.compareTo(aluno.nome) > 1)
			return 1;
		if (this.nome.compareTo(aluno.nome) < 0)
			return -1;
		return 0;
	}
	
	public String toString(){
		return this.nome;
	}
	
	public int getFaltas(){
		return faltas;
	}
	
	public void setFaltas(int faltas){
		this.faltas = faltas;
	}
	
	public double getMedia(){
		return media;
	}
	
	public void setMedia(double media){
		this.media = media;
	}

}
