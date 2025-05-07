package main;

import java.util.Scanner;

public class Carrinho {
	
	// Atributos
	
	private Item[] itens = new Item[10];

	
	// Getters e Setters
	
	public Item[] getItens() {
		return itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}
	
	// Métodos
	
	public void adicionaItemNoCarrinho() {
		
		Scanner leia = new Scanner(System.in);
		boolean sair = false;
		Item[] carrinho = getItens();
		
		while(sair == false) {
		
		Item[][] catalogo = Catalogo.exibeCatalogo();
		
		System.out.println("Informe qual item você deseja: ");
		int indiceDoItem = leia.nextInt();
		
		System.out.println("Informe a quantidade: ");
		int quantidade = leia.nextInt();
		
		Item itemEscolhido = catalogo[indiceDoItem-1][0];
		
		Item item = new Item(itemEscolhido.getDescricao(), quantidade ,itemEscolhido.getValor());
		carrinho[carrinho.length -1] = item;
		
		System.out.println("Deseja adicionar outro item? \n [1] - Sim \n [0] - Não");
		int decisao = leia.nextInt();
		
			if(decisao == 0) {
				sair = true;
			}
		}
		
		System.out.println("\\---------- CARRINHO ----------//");
		
		for(int i = 0; i < carrinho.length; i++) {
			System.out.println(carrinho[i]);
		}
		
	}

}
