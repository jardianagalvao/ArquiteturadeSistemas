package cadastrolivro;

public interface CadastroSetor {
    void cadastrar(String nome, String codigo, String cor);

    void listarTodos();

    void atualizar(String codigo, String novoNome, String novaCor);

    void excluir(String codigo);
}
