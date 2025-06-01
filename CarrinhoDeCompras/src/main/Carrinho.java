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
	        
		    while (!sair) {
		    		    	
		        Item[][] catalogo = Catalogo.exibeCatalogo();
	
		        System.out.println("Informe o número do item desejado: ");
		        int indiceDoItem = leia.nextInt();
	
		        if (indiceDoItem <= 0 || indiceDoItem > catalogo.length) {
		            System.out.println("Item inválido.");
		        }
	
		        Item itemEscolhido = catalogo[indiceDoItem - 1][0];
	
		        System.out.println("Informe a quantidade: ");
		        int quantidade = leia.nextInt();
	
		        // Verifica se há estoque suficiente
		        if (quantidade > itemEscolhido.getQuantidade()) {
		            System.out.println("Quantidade maior que o estoque disponível.\n");
		        }
	
		        double totalItem = quantidade * itemEscolhido.getValor();
	
		        // Atualiza o estoque no catálogo
		        itemEscolhido.setQuantidade(itemEscolhido.getQuantidade() - quantidade);
	
		        itemEscolhido.setValorTotal(totalItem);
	
		        // Cria um novo item para o carrinho
		        Item novoItem = new Item(itemEscolhido.getDescricao(), quantidade, itemEscolhido.getValor(), totalItem);
	
		        if (carrinhoAnterior.length >= 20) {
		            System.out.println("O carrinho só pode ter até no máximo 20 itens!");
		            return;
		        }
	
		        Item[] novoCarrinho = new Item[carrinhoAnterior.length + 1];
		        
		        // Fazendo cópia da lista anterior para a lista nova
		        for (int i = 0; i < carrinhoAnterior.length; i++) {
		            novoCarrinho[i] = carrinhoAnterior[i];
		        }
		        
		        novoCarrinho[carrinhoAnterior.length] = novoItem;
	
		        setItens(novoCarrinho);
		        carrinhoAnterior = novoCarrinho;
	
		        System.out.println("Item adicionado ao carrinho com sucesso!\n");
	
		        System.out.println("Deseja adicionar outro item? \n[1] - Sim \n[0] - Não");
		        int decisao = leia.nextInt();
		        sair = (decisao == 0);
		        
		    }

	    System.out.println("\nFinalizando adição de itens ao carrinho.\n");
	      
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
	    
	    exibeCarrinho();
	    
	    System.out.println("Informe o índice do item que deseja remover: ");
	    int indice = leia.nextInt();

	    if (indice < 0 || indice >= carrinhoAnterior.length) {
	        System.out.println("Índice inválido!");
	        return;
	    }

	    // Cria um novo array com um item a menos
	    Item[] carrinhoNovo = new Item[carrinhoAnterior.length - 1];

	    // Copia os itens antes do índice
	    for (int i = 0; i < indice; i++) {
	        carrinhoNovo[i] = carrinhoAnterior[i];
	    }

	    // Copia os itens após o índice
	    for (int i = indice + 1; i < carrinhoAnterior.length; i++) {
	        carrinhoNovo[i - 1] = carrinhoAnterior[i];
	    }

	    setItens(carrinhoNovo);

	    
	    System.out.println("Item removido com sucesso!");
	    
	}

	public void finalizaCompra() {
		Scanner leia = new Scanner(System.in);
		Item[] carrinho = getItens();
		double valorTotalCarrinho = 0;

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("|            	         SEU CARRINHO DE COMPRAS      		           |");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Item			Quantidade	   Preço (R$)	  Total (R$)");
		System.out.println("----------------------------------------------------------------------------");
		
		for(int i = 0; i < carrinho.length; i++) {
			if(carrinho[i] != null) {
				System.out.println(i +" - " + carrinho[i].getDescricao() + "			" + carrinho[i].getQuantidade() + "	        " + carrinho[i].getValor() + "		" + carrinho[i].getValorTotal());
				valorTotalCarrinho += carrinho[i].getValorTotal();
			}
		}
		
		// Pergunta ao usuário se deseja inserir o cupom
	    System.out.println("\nDeseja inserir um cupom de desconto? [1] - Sim | [0] - Não");
	    int usarCupom = leia.nextInt();
	    leia.nextLine(); 

	    double desconto = 0.0;

	    if (usarCupom == 1) {
	        System.out.println("Digite o cupom: ");
	        String cupom = leia.nextLine().trim().toUpperCase();

	        switch (cupom) {
	            case "CUPOM10":
	                desconto = 0.10;
	                break;
	            case "CUPOM20":
	                desconto = 0.20;
	                break;
	            default:
	                System.out.println("Cupom inválido! Nenhum desconto será aplicado.");
	                break;
	        }
	    }

	    double valorComDesconto = valorTotalCarrinho - (valorTotalCarrinho * desconto);

	    System.out.println(" ");
	    
	    if (desconto > 0) {
	        System.out.printf("Desconto aplicado: %.0f%%\n", desconto * 100);
	        System.out.printf("TOTAL COM DESCONTO: R$%.2f\n", valorComDesconto);
	    } else {
	        System.out.printf("TOTAL: R$%.2f\n", valorTotalCarrinho);
	    }
	    System.out.println("Compra finalizada. Obrigado por comprar conosco!\n");

	}
	
}
