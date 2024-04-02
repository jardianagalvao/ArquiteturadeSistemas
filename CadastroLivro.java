package cadastrolivro;

public interface CadastroLivro {
    void cadastrar(String titulo, String autor, int anoPublicacao);

    void listarTodos();

    void atualizar(String titulo, String novoTitulo, String novoAutor, int novoAnoPublicacao);

    void excluir(String titulo);
}

// Princípios GRASP:

// Controller: A interface CadastroLivro está associada ao princípio Controller,
// que sugere
// que uma classe deve ser responsável por gerenciar a interação entre o usuário
// (ou outro sistema)
// e o sistema em si.

// A interface CadastroLivro está diretamente associada às operações CRUD
// (Create, Read, Update, Delete) em livros