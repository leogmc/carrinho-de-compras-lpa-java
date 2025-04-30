package main;

public class Catalogo {
	
	// Atributos
	
	private Item[][] itens;

	
	// Getters e Setters
	
	public Item[][] getItens() {
		return itens;
	}

	public void setItens(Item[][] itens) {
		this.itens = itens;
	}
	
	// Métodos
	
	public void ExibeCatalogo() {
		
		Item item1 = new Item("Arroz",10,4.99);
		Item item2 = new Item("Feijão",10,7.49);
		Item item3 = new Item("Macarrão",10,3.59);
		Item item4 = new Item("Açucar",10,3.99);
		
		String[][] catalogoPredefinido = {{item1.getDescricao(),Double.toString(item1.getValor())}};
		
		System.out.println(catalogoPredefinido);
		
	}

}
