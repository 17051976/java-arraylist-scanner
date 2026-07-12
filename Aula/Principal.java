package Aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void exibirMenu() {
		System.out.println("Opções:");
		System.out.println("1 - Adicionar nomes");
		System.out.println("2 - Mostrar lista");
		System.out.println("0 - Sair");
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
				
		ArrayList<String> listaNomes = new ArrayList<String>();
		String nome;
		
		exibirMenu();

		int opcao = teclado.nextInt();

		while (opcao != 0) {

			if (opcao == 1) {
				System.out.println("Digite um nome:");
				nome = teclado.next();
				listaNomes.add(nome);
			}
			else if (opcao == 2) {
				System.out.println("Lista de nomes:");
				for(int i = 0; i < listaNomes.size(); i++) {
				    System.out.println(listaNomes.get(i));
				}
			}
			else {
				System.out.println("Opção invalida. Tente novamente!");
			}
			exibirMenu();
			
			opcao = teclado.nextInt();
		}
		System.out.println("Encerrando programa...");
		teclado.close();
	}

}
