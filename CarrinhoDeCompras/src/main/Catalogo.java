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
	
	public static Item[][] exibeCatalogo() {
		
		Item item1 = new Item("Arroz", 10, 5.0);
		Item item2 = new Item("Feijão", 10, 8.0);
		Item item3 = new Item("Macarrão", 10, 4.50);
		Item item4 = new Item("Açucar", 10, 3.80);
		
//		String[][] catalogoPredefinido = new String[4][1];
//		
//		catalogoPredefinido[0][0] = item1.getDescricao() + ": R$ " +  Double.toString(item1.getValor());
//		catalogoPredefinido[1][0] = item2.getDescricao() + ": R$ " +  Double.toString(item2.getValor());
//		catalogoPredefinido[2][0] = item3.getDescricao() + ": R$ " +  Double.toString(item3.getValor());
//		catalogoPredefinido[3][0] = item4.getDescricao() + ": R$ " +  Double.toString(item4.getValor());
		
		
		Item[][] catalogoPredefinido = new Item[4][1];
		
		catalogoPredefinido[0][0] = item1;
		catalogoPredefinido[1][0] = item2;
		catalogoPredefinido[2][0] = item3;
		catalogoPredefinido[3][0] = item4;
		
		
		
		for(int i = 0; i < catalogoPredefinido.length; i++) {
			
			System.out.println(i+1 +" - " + catalogoPredefinido[i][0]);
			
		}
		
		return catalogoPredefinido;
		
		
		
	}

}
