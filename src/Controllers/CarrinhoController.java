package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Models.Carrinho;
import Models.CarrinhoItens;
import Models.Cliente;
import Models.Produto;

public class CarrinhoController {
	private List<CarrinhoItens> ItensCarrinho = new ArrayList<CarrinhoItens>();
	
	
	
	public  void addItem(Carrinho carrinho,Produto produto, Double quantidade, Double valorUnitario ) {
		
		CarrinhoItens itens = new CarrinhoItens();
		itens.setCarrinhoItem(carrinho);
		itens.setProduto(produto);
		itens.setQuantidade(quantidade);
		itens.setValorUnitario(valorUnitario);
		ItensCarrinho.add(itens);
		
	}
		
	public String ItemCarrinho(){
		int i;
		String data = "";
		for(i=0; i < ItensCarrinho.size() ; i++) {
			data = "Produto: \n" + ItensCarrinho.get(i).getProduto().getNome()
			+ "\nQuantidade: \n" + ItensCarrinho.get(i).getQuantidade()
			+ "\nValor Unitario: \n" + ItensCarrinho.get(i).getValorUnitario()
			+ " \nUsuario: \n" + ItensCarrinho.get(i).getCarrinhoItem().getCliente().getNome();
		} return data;
	}

	@Override
	public String toString() {
		return ItemCarrinho();
				
	}
	
}