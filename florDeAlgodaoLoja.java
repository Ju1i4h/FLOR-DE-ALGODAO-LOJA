package trabalhoCriativo;

import java.util.ArrayList;
import java.util.Scanner;

public class florDeAlgodaoLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        System.out.println("BEM-VINDO À FLOR DE ALGODÃO");
        System.out.println("Transformando o velho em novo com amor e consciência!\n");
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar produto reciclável");
            System.out.println("2 - Exibir produtos cadastrados");
            System.out.println("3 - Mostrar mensagem sobre sustentabilidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto reciclável: ");
                    String produto = sc.nextLine();
                    produtos.add(produto);
                    System.out.println("Produto adicionado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\nProdutos cadastrados:");
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto adicionado ainda.\n");
                    } else {
                        for (String p : produtos) {
                            System.out.println("- " + p);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nNa Flor de Algodão, acreditamos que cada retalho tem um novo começo.\n");
                    break;
                case 0:
                    System.out.println("\nEncerrando o aplicativo... Obrigado por cuidar do planeta!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.\n");
            }
        } while (opcao != 0);
        sc.close();
    }
}

