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
			
			
				if (novoCarrinho.length < 20) {
					
					//Copiando itens do array anterior para o novo array
					for (int i = 0; i < carrinhoAnterior.length; i++) {
						novoCarrinho[i] = carrinhoAnterior[i];
						
					}
					
								
					//Adiciona o item na nova posição;
					novoCarrinho[carrinhoAnterior.length] = item;
					
					setItens(novoCarrinho);
			        carrinhoAnterior = novoCarrinho; // Agora o carrinho anterior é o novo carrinho
					
					
					
				} else {
					System.out.println("O carrinho só pode ter até no máximo 20 itens!");
				}
			
			System.out.println("Deseja adicionar outro item? \n [1] - Sim \n [0] - Não");
			int decisao = leia.nextInt();
			
				if(decisao == 0) {
					sair = true;
				}
			}
		
			System.out.println("Item adicionado ao carrinho com sucesso!");
			System.out.println(" ");
		
		
	}

	public void exibeCarrinho() {

		Item[] carrinho = getItens();
			
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("|            	         SEU CARRINHO DE COMPRAS      		           |");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Item			Quantidade	   Preço (R$)	  Total (R$)");
		System.out.println("----------------------------------------------------------------------------");
		
		for(int i = 0; i < carrinho.length; i++) {
			if(carrinho[i] != null)
				System.out.println(i +" - " + carrinho[i].getDescricao() + "			" + carrinho[i].getQuantidade() + "	        " + carrinho[i].getValor() + "		" + carrinho[i].getValorTotal());
		}
		
		System.out.println(" ");
		
	}
	
	public void removeItemCarrinho() {
		
		Scanner leia = new Scanner(System.in);
		
		Item[] carrinhoAnterior = getItens();
		Item[] carrinhoNovo = new Item[carrinhoAnterior.length -1];
		int indice;
		
		exibeCarrinho();
		
		System.out.println("Informe qual item você deseja remover: ");
		indice = leia.nextInt();
		
		for (int i = 0; i < indice; i++) {
			carrinhoNovo[i] = carrinhoAnterior[i];
		}
		
		for (int i = indice; indice < carrinhoAnterior.length; i++) {
			carrinhoNovo[i - 1] = carrinhoAnterior[i];	
		}
		
		setItens(carrinhoNovo);
		
		System.out.println("Item removido com sucesso!");
		
	}
	
	public void finalizaCompra() {
		Item[] carrinho = getItens();
		int valorTotalCarrinho = 0;
		
		for(int i = 0; i < carrinho.length; i++) {
			
			System.out.println(carrinho[i]);
			if(carrinho[i] != null) {
			valorTotalCarrinho += carrinho[i].getValorTotal();
			}
		}
		
		System.out.println("Compra finalizada. Valor total do carrinho: R$" + valorTotalCarrinho);
	}
}
