package main;

public class Item {
	
	// Atributos 
	
	private String descricao;
	private int quantidade;
	private double valor;
	private double valorTotal;
	
	// Getters e Setters
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	// Construtores
	
	@Override
	public String toString() {
		return "Item [descricao=" + descricao + ", quantidade=" + quantidade + ", valor=" + valor + ", valorTotal="
				+ valorTotal + "]";
	}
	
	public Item(String descricao, int quantidade, double valor, double valorTotal) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
		this.valorTotal = valorTotal;
	}
	
	public Item(String descricao, int quantidade, double valor) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	

}
