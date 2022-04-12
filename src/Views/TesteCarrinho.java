package Views;

import Controllers.CarrinhoController;
import Models.Carrinho;
import Models.Cliente;
import Models.Produto;

public class TesteCarrinho {
	
	public static void main (String args[]) {
		Cliente client = new Cliente();
		client.setCpf("99999999999");
		client.setName("Gustavo");
		
		Produto product = new Produto();
		product.setName("Teclado");
		product.setPrice(100.99);
		product.setStorage(10);
		
		Carrinho cart = new Carrinho();
		cart.setClient(client);
		
		CarrinhoController cartController = new CarrinhoController();
		cartController.addItem(cart, product, 33.99, 2);
		
		System.out.println(cartController);
	}

}
