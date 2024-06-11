package main;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		Stack<String> livrosPilha = new Stack<>();

		int op;
		String nomeLivro;

		do {
			System.out.println("Menu:");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Finalizar o programa");
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				nomeLivro = sc.next();
				
				livrosPilha.push(nomeLivro); // empurrando o livro dentro da pilha
				
				System.out.println("Livro \"" + nomeLivro + "\" adicionado à pilha.");
				break;
			case 2:
				if (livrosPilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha:");
					for (String book : livrosPilha) {
						System.out.println(book);
					}
				}
				break;
			case 3:
				if (livrosPilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					String livro = livrosPilha.pop(); // removendo o ultimo item da Pilha
					System.out.println("Livro \"" + livro + "\" foi retirado da pilha.");
				}
				break;
			case 0:
				System.out.println("Finalizando o programa...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (op != 0);

		sc.close();
	}

}
