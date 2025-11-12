package trabalhoCriativo;

import java.util.ArrayList;
import java.util.Scanner;

public class codigoExemploLoja {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> roupasDoacao = new ArrayList<>();
    static ArrayList<String> produtosReciclados = new ArrayList<>();
    public static void main(String[] args) {
        int opcao;
        produtosReciclados.add("Bolsa feita de jeans velho");
        produtosReciclados.add("Almofada com retalhos coloridos");
        produtosReciclados.add("Estojo feito com camiseta reciclada");
        do {
            System.out.println("\n FLOR DE ALGODAO - Moda que Renasce");
            System.out.println("1. Cadastrar roupa para doação");
            System.out.println("2. Ver roupas cadastradas");
            System.out.println("3. Ver produtos reciclados");
            System.out.println("4. Saber mais sobre sustentabilidade");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarRoupa();
                    break;
                case 2:
                    listarRoupas();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    mostrarInfo();
                    break;
                case 0:
                    System.out.println("Obrigada por apoiar a moda sustentável! ");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
    public static void cadastrarRoupa() {
        System.out.print("Digite o tipo de roupa que deseja doar (ex: calça jeans, camiseta, jaqueta): ");
        String roupa = sc.nextLine();
        roupasDoacao.add(roupa);
        System.out.println(" Obrigado! A roupa \"" + roupa + "\" foi cadastrada para doação!");
    }
    public static void listarRoupas() {
        System.out.println("\n Roupas Cadastradas para Doação:");
        if (roupasDoacao.isEmpty()) {
            System.out.println("Nenhuma roupa cadastrada ainda.");
        } else {
            for (int i = 0; i < roupasDoacao.size(); i++) {
                System.out.println((i + 1) + ". " + roupasDoacao.get(i));
            }
        }
    }
    public static void listarProdutos() {
        System.out.println("\n Produtos Reciclados Disponíveis:");
        for (int i = 0; i < produtosReciclados.size(); i++) {
            System.out.println((i + 1) + ". " + produtosReciclados.get(i));
        }
    }
    public static void mostrarInfo() {
        System.out.println("\n DICA DE SUSTENTABILIDADE");
        System.out.println("A moda é a segunda indústria que mais polui no mundo!");
        System.out.println("Com pequenas atitudes, como doar e reciclar roupas, você ajuda o planeta.");
        System.out.println("O ReVeste transforma tecidos velhos em produtos novos e criativos.");
        System.out.println("Nada se perde, tudo se transforma!");
    }
}
