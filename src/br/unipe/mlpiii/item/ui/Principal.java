package br.unipe.mlpiii.item.ui;

import br.unipe.mlpiii.item.modelo.Inventario;
import br.unipe.mlpiii.item.modelo.Item;

public class Principal {

	public static void main(String[] args) {
		
		Inventario inventario = new Inventario();
		
		if (inventario.getItens().isEmpty()){
			System.out.println("A coleção está vazia");
		}
		
		Item item = new Item(3, "Parafuso");
		inventario.setItens(item);
		Item item2 = new Item(1, "Prego");
		inventario.setItens(item2);
		Item item3 = new Item(2, "Martelo");
		inventario.setItens(item3);
		Item item4 = new Item(4, "Alicate");
		
		if (!inventario.getItens().contains(item4)){
			System.out.println("O item " + item4.toString() + " não pertence a coleção");
		}
		
		System.out.println(inventario.getItens());
		
	}

}
