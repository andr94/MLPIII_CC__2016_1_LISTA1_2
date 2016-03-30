package br.unipe.mlpiii.item.modelo;

public class Item implements Comparable<Item> {
	
	private int codigo;
	private String descricao;
	
	public Item(int codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int compareTo(Item item){
		if (this.codigo > item.codigo)
			return 1 ;
		if (this.codigo < item.codigo)
			return -1;
		return 0;
	}
	
	public String toString(){
		return this.descricao;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCogido(int codigo){
		this.codigo = codigo;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

}
