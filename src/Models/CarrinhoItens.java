package Models;

public class CarrinhoItens {

	private Carrinho carrinhoItem;
	private Produto produto;
	private double quantidade;
	private double valorUnitario;
	
	public Carrinho getCarrinhoItem() {
		return carrinhoItem;
	}
	public void setCarrinhoItem(Carrinho carrinhoItem) {
		this.carrinhoItem = carrinhoItem;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	@Override
	public String toString() {
		return "Produto" + produto.getNome()
		+ "Carrinho:" + carrinhoItem.getCliente() 
		+ "Quantidade:" + getQuantidade() 
		+ "Valor Unitario:" + getValorUnitario()
		+ "Produto:" + getProduto();
	}
	
	
	
	
	
}