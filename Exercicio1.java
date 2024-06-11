package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);

		Queue<String> clientQueue = new LinkedList<>();

		int op;
		String novoCliente;

		do {
			System.out.println("Menu:");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar (retirar) uma pessoa da fila");
			System.out.println("0: Finalizar o programa");
			System.out.print("Escolha uma opção: ");
			op = sc.nextInt();

			switch (op) {
			case 1:
				// PESQUISAR METODO PARA JOGAR DIRETO NA LISTA
				System.out.print("Digite o nome do cliente: ");
				// nextLine não le o nome
				novoCliente = sc.next();
				clientQueue.add(novoCliente);
				System.out.println("Cliente " + novoCliente + " adicionado à fila.");
				break;
			case 2:
				if (clientQueue.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					// le a lista como um vetor - item a item
					for (String cliente : clientQueue) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				// verificando se está vazia para não tentar remover algo caso esteja vazia
				if (clientQueue.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					// o primeiro a ser posto é o que está sendo apagado
					String cliente = clientQueue.poll();
					System.out.println("Cliente " + cliente + " foi chamado.");
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
