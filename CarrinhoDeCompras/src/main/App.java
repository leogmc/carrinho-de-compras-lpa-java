package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Carrinho carrinho = new Carrinho();
		
		int opcao;
		 
		do {
			
			System.out.println(" ====================================");
			System.out.println("||    	 ATAKADÃO ATAKAREJO        ||");
			System.out.println(" ====================================");
			System.out.println("");
			System.out.println("Seja bem-vindo! O que deseja fazer?\n");
			System.out.println("[1] - Visualizar catálogo");
			System.out.println("[2] - Adicionar itens ao carrinho");
			System.out.println("[3] - Exibir carrinho de compras");
			System.out.println("[4] - Finalizar compra e exibir o total geral");
			System.out.println("[5] - Remover item do carrinho");			
			System.out.println("[0] - Sair");
			System.out.println("Escolha uma opção: ");
			opcao = leia.nextInt();
			
			
			switch (opcao) {
			
				case 1:
					Catalogo.exibeCatalogo();
					break;
					
					
				case 2:
					carrinho.adicionaItemNoCarrinho();
					break;
					
					
				case 3:
					carrinho.exibeCarrinho();
					break;
					
				case 4:
					carrinho.finalizaCompra();
					break;
					
				case 5:
					carrinho.removeItemCarrinho();
					
				case 0:
					System.out.println("Programa finalizado.");
					return;
					
			default:
				System.out.println("Opção inválida. Por favor, informe uma opção existente.");
			}
		
		} while (opcao!=0);
		
		leia.close();
		return;
	}

}
