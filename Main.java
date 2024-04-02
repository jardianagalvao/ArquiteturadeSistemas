package cadastrolivro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicialização das factories para criar os cadastros de livros e setores
        CadastroLivroFactory livroFactory = new BibliotecaCadastroLivroFactory();
        CadastroSetorFactory setorFactory = new BibliotecaCadastroSetorFactory();

        // Criação dos cadastros de livros e setores
        CadastroLivro cadastroLivro = livroFactory.criarCadastroLivro();
        CadastroSetor cadastroSetor = setorFactory.criarCadastroSetor();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            // Exibição do menu de opções para o usuário
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Excluir Livro");
            System.out.println("5. Cadastrar Setor");
            System.out.println("6. Listar Setores");
            System.out.println("7. Atualizar Setor");
            System.out.println("8. Excluir Setor");
            System.out.println("9. Listar Livros e Setores");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            // Switch case para tratar as opções escolhidas pelo usuário
            switch (opcao) {
                case 1:
                    // Cadastro de um novo livro
                    System.out.print("Digite o titulo do livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autorLivro = scanner.nextLine();
                    System.out.print("Digite o ano de publicacao do livro: ");
                    int anoLivro = scanner.nextInt();
                    cadastroLivro.cadastrar(tituloLivro, autorLivro, anoLivro);
                    break;
                case 2:
                    // Listagem de todos os livros
                    cadastroLivro.listarTodos();
                    break;
                case 3:
                    // Atualização de um livro existente
                    System.out.print("Digite o titulo do livro que deseja atualizar: ");
                    String tituloAtualizarLivro = scanner.nextLine();
                    System.out.print("Digite o novo titulo do livro: ");
                    String novoTituloLivro = scanner.nextLine();
                    System.out.print("Digite o novo autor do livro: ");
                    String novoAutorLivro = scanner.nextLine();
                    System.out.print("Digite o novo ano de publicacao do livro: ");
                    int novoAnoLivro = scanner.nextInt();
                    cadastroLivro.atualizar(tituloAtualizarLivro, novoTituloLivro, novoAutorLivro, novoAnoLivro);
                    break;
                case 4:
                    // Exclusão de um livro existente
                    System.out.print("Digite o titulo do livro que deseja excluir: ");
                    String tituloExcluirLivro = scanner.nextLine();
                    cadastroLivro.excluir(tituloExcluirLivro);
                    break;
                case 5:
                    // Cadastro de um novo setor
                    System.out.print("Digite o nome do setor: ");
                    String nomeSetor = scanner.nextLine();
                    System.out.print("Digite o codigo do setor: ");
                    String codigoSetor = scanner.nextLine();
                    System.out.print("Digite a cor do setor: ");
                    String corSetor = scanner.nextLine();
                    cadastroSetor.cadastrar(nomeSetor, codigoSetor, corSetor);
                    break;
                case 6:
                    // Listagem de todos os setores
                    cadastroSetor.listarTodos();
                    break;
                case 7:
                    // Atualização de um setor existente
                    System.out.print("Digite o codigo do setor que deseja atualizar: ");
                    String codigoAtualizarSetor = scanner.nextLine();
                    System.out.print("Digite o novo nome do setor: ");
                    String novoNomeSetor = scanner.nextLine();
                    System.out.print("Digite a nova cor do setor: ");
                    String novaCorSetor = scanner.nextLine();
                    cadastroSetor.atualizar(codigoAtualizarSetor, novoNomeSetor, novaCorSetor);
                    break;
                case 8:
                    // Exclusão de um setor existente
                    System.out.print("Digite o codigo do setor que deseja excluir: ");
                    String codigoExcluirSetor = scanner.nextLine();
                    cadastroSetor.excluir(codigoExcluirSetor);
                    break;
                case 9:
                    // Listagem de todos os livros e setores
                    System.out.println("\nLISTANDO TODOS OS LIVROS E SETORES:");
                    System.out.println("===========================================");
                    cadastroLivro.listarTodos();
                    cadastroSetor.listarTodos();
                    break;
                case 10:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 10);

        scanner.close();
    }
}
