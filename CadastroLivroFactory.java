package cadastrolivro;

public interface CadastroLivroFactory {
    CadastroLivro criarCadastroLivro();
}

// Princípios GRASP:

// Creator: A interface CadastroLivroFactory segue o princípio Creator, que diz
// que as classes devem ser
// responsáveis por criar instâncias de outras classes, evitando assim a
// dependência direta entre classes concretas.
// Alta Coesão: A interface possui alta coesão, pois tem apenas uma
// responsabilidade bem definida, que é criar
// instâncias de CadastroLivro.