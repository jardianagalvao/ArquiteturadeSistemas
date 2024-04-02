package cadastrolivro;

import java.util.List;

public class CadastroBiblioteca implements CadastroLivro {
    private List<Livro> livros;

    public CadastroBiblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public void cadastrar(String titulo, String autor, int anoPublicacao) {
        Livro novoLivro = new Livro(titulo, autor, anoPublicacao);
        livros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    @Override
    public void listarTodos() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Listando todos os livros:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    @Override
    public void atualizar(String titulo, String novoTitulo, String novoAutor, int novoAnoPublicacao) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setAnoPublicacao(novoAnoPublicacao);
                System.out.println("Livro atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado para atualização.");
    }

    @Override
    public void excluir(String titulo) {
        Livro livroParaExcluir = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livroParaExcluir = livro;
                break;
            }
        }
        if (livroParaExcluir != null) {
            livros.remove(livroParaExcluir);
            System.out.println("Livro excluído com sucesso!");
        } else {
            System.out.println("Livro não encontrado para exclusão.");
        }
    }
}

// A classe CadastroBiblioteca implementa as funcionalidades CRUD (Create, Read,
// Update, Delete) para a entidade "Livro"