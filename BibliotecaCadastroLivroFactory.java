package cadastrolivro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaCadastroLivroFactory implements CadastroLivroFactory {

    @Override
    public CadastroLivro criarCadastroLivro() {

        List<Livro> livros = new ArrayList<>();
        return new CadastroBiblioteca(livros);
    }

}

// Padrao GOF - Factory Method:
// define uma interface para criar um objeto, mas permite que as subclasses
// alterem o tipo de objetos que serão criados.
