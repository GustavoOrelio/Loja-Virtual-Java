package Models;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcao = 5;
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();

		do {
			menu.exibirMenu();

			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				menu.cadastrarCliente();
				break;
			case 2:
				menu.cadastrarProduto();
				break;
			case 3:
				menu.carrinho();
				break;
			case 4:
				menu.cadastrarCompra();
				break;
			case 5:
				menu.imprimirCliente();
				break;
			case 6:
				menu.extratoCompra();
				break;
			case 7:
				menu.removerCliente();
				break;
			case 10:
				menu.exibirMenu();
				break;
			default:
				menu.exibirMenu();
			}
		} while (opcao != 10);
	}

}
