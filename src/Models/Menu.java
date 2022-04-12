package Models;

import java.io.*;
import java.util.Scanner;

public class Menu {
	

	public static void main (String[] args) {
		
	
	int opcao = 0; 

	do
	{
		System.out.println("\n\nSistema de loja virtual");
		System.out.println("\n =========================");
		System.out.println(" |     1 - Cliente       |");
		System.out.println(" |     2 - Produto       |");
		System.out.println(" |     3 - Carrinho      |");
		System.out.println(" |     0 - Sair          |");
		System.out.println(" =========================\n");

		
		System.out.print("\n");
		switch (opcao) {
		case 1:
			cliente();
			break;
		case 2:
			produto();
			break;
		case 3:
			carrinho();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao != 0);
}

	private static void carrinho() {
		// TODO Auto-generated method stub
		
	}

	private static void produto() {
		// TODO Auto-generated method stub
		
	}

	private static void cliente() {
		// TODO Auto-generated method stub
		
	}

}
