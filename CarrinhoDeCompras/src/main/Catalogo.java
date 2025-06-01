package main;

public class Catalogo {
	
	// Atributos
	private static Item[][] itens;

	// Getters e Setters
	public Item[][] getItens() {
		return itens;
	}

	public void setItens(Item[][] itens) {
		Catalogo.itens = itens;
	}

	// Métodos
	
	public static Item[][] exibeCatalogo() {
		
		// Inicializa o catálogo apenas uma vez
		if (itens == null) {
			Item item1 = new Item("Arroz", 10, 5.0);
			Item item2 = new Item("Feijão", 10, 8.0);
			Item item3 = new Item("Macarrão", 10, 2.50);
			Item item4 = new Item("Açúcar", 10, 4.0);

			itens = new Item[4][1];
			itens[0][0] = item1;
			itens[1][0] = item2;
			itens[2][0] = item3;
			itens[3][0] = item4;
		}

		System.out.println("--------------------------------------------------------");
		System.out.println("|            CATÁLOGO DE ITENS DO MERCADO      		|");
		System.out.println("--------------------------------------------------------");
		System.out.println("Item\t\tQuantidade\tPreço (R$)");
		System.out.println("--------------------------------------------------------");

		for (int i = 0; i < itens.length; i++) {
			Item item = itens[i][0];
			System.out.println((i + 1) + " - " + item.getDescricao() + "\t\t" + item.getQuantidade() + "\t\t" + item.getValor());
		}

		System.out.println(" ");
		return itens;
	}
}
