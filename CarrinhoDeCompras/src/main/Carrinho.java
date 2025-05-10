package main;

import java.util.Scanner;

public class Carrinho {
	
	// Atributos
	
	private Item[] itens = new Item[1];

	
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
		Item[] carrinhoAnterior = getItens();
		
		while(sair == false) {
		
		Item[][] catalogo = Catalogo.exibeCatalogo();
		
		System.out.println("Informe qual item você deseja: ");
		int indiceDoItem = leia.nextInt();
		
		System.out.println("Informe a quantidade: ");
		int quantidade = leia.nextInt();
		
		Item itemEscolhido = catalogo[indiceDoItem-1][0];
		
		double totalItem = quantidade * itemEscolhido.getValor();
		
		itemEscolhido.setValorTotal(totalItem);
		
		Item item = new Item(itemEscolhido.getDescricao(), quantidade ,itemEscolhido.getValor(), itemEscolhido.getValorTotal());
		
		Item[] novoCarrinho = new Item[carrinhoAnterior.length + 1];
		
		setItens(novoCarrinho);
		

			if (novoCarrinho.length <= 5) {
				
				//Copiando itens do array anterior para o novo array
				for (int i = 0; i <= carrinhoAnterior.length; i++) {
					novoCarrinho[i] = carrinhoAnterior[i];
					
				}
				
				//Adiciona o item na nova posição;
				novoCarrinho[carrinhoAnterior.length + 1] = item;
				
				
			} else {
				System.out.println("Ultrapassou o limite!");
			}
		
		System.out.println("Deseja adicionar outro item? \n [1] - Sim \n [0] - Não");
		int decisao = leia.nextInt();
		
			if(decisao == 0) {
				sair = true;
			}
		}
		
		System.out.println("Item adicionado ao carrinho com sucesso!");
		
		
	}

	public void exibeCarrinho() {
		
		Item[] carrinho = getItens();
			
		System.out.println("--------------- CARRINHO ----------------");
		
		for(int i = 0; i < carrinho.length; i++) {
			if(carrinho[i] != null)
			System.out.println(carrinho[i]);
		}
		
	}
}
