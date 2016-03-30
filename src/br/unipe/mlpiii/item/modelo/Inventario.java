package br.unipe.mlpiii.item.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {
	
	private List<Item> itens = new ArrayList<>();
	
	public List getItens(){
		return itens;
	}
	
	public void setItens(Item item){
		itens.add(item);
		Collections.sort(itens);
	}

}
