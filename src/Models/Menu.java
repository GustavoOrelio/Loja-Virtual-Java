package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	List<Cliente> clientes = new ArrayList<>();
	List<Produto> produtos = new ArrayList<>();
	Carrinho carrinho = new Carrinho();
	Produto produto = new Produto();
	CarrinhoItens carrinhoItens = new CarrinhoItens();

	public void exibirMenu() {
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|        Menu de Opções                     |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 01 - Cadastrar Cliente                    |");
		System.out.println("| 02 - Cadastrar Produto                    |");
		System.out.println("| 03 - Adicionar Carrinho                   |");
		System.out.println("| 04 - Cadastrar Compra                     |");
		System.out.println("| 05 - Imprimir relatrio de clientes        |");
		System.out.println("| 06 - Imprimir extrato de compra           |");
		System.out.println("| 07 - Remover cliente                      |");
		System.out.println("| 10 - Sair                                 |");
		System.out.println("+-------------------------------------------+");
	}

	public void carrinho() {
		Scanner leitor = new Scanner(System.in);
		Cliente cli = new Cliente();

		carrinho.setDataCompra(new java.util.Date());

		//carrinho.setId(GeradorId.getProximoId());

		for (int i = 0; i < clientes.size(); i++) {
			cli = clientes.get(i);
		}
	}

	public void cadastrarCliente() {
		Scanner leitor = new Scanner(System.in);
		Cliente cliente = new Cliente();

		cliente.setId(GeradorId.getProximoId());

		System.out.print("Nome do cliente: ");
		cliente.setNome(leitor.next());

		System.out.print("Data de nascimento do cliente: ");
		cliente.setDt_nasc(leitor.next());

		System.out.print("CPF do cliente: ");
		cliente.setCpf(leitor.next());

		System.out.print("Telefone do cliente: ");
		cliente.setTelefone(leitor.next());

		System.out.print("Endereo do cliente: ");
		cliente.setEndereco(leitor.next());

		clientes.add(cliente);

	}

	public void imprimirCliente() {
		for (Cliente cliente : clientes) {
			System.out.println("\nId: " + cliente.getId());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Data de nascimento: " + cliente.getDt_nasc());
			System.out.println("Endereo: " + cliente.getEndereco());
			System.out.println("Telefone: " + cliente.getTelefone());
			System.out.println("\n\n");
		}

	}

	public void cadastrarProduto() {
		Scanner leitor = new Scanner(System.in);

		produto.setId(GeradorId.getProximoId());

		System.out.println("Nome do produto: ");
		produto.setNome(leitor.next());

		System.out.println("Preo do produto: ");
		produto.setPreco(leitor.nextDouble());

		System.out.println("Estoque do produto: ");
		produto.setEstoque(leitor.nextInt());

		produtos.add(produto);
	}

}
