package Views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import Controllers.CarrinhoController;
import Models.Carrinho;
import Models.Produto;

public class TesteCarrinho {

	public static void main (String args[]) throws ParseException{
		cadastroItemCarrinho();
	}
	
	public static void cadastroItemCarrinho() {
		
		Carrinho carrinho = new Carrinho();
		carrinho.getCliente().getName();
		
		
		CarrinhoController controleCarrinho = new CarrinhoController();
		Double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de produto que será adiconada:"));
		Double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitario:"));
		
		controleCarrinho.addItem(carrinho, produto, quantidade, valorUnitario);
		
		System.out.println(controleCarrinho);
	}
}