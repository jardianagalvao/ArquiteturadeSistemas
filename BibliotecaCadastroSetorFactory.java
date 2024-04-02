package cadastrolivro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaCadastroSetorFactory implements CadastroSetorFactory {

    @Override
    public CadastroSetor criarCadastroSetor() {

        List<Setor> setores = new ArrayList<>();
        return new CadastroBibliotecaSetor(setores);
    }
}

// Padrão GOF Factory Method:
// Define uma interface para criar um objeto, mas permite que as subclasses
// alterem o tipo de objetos que serão criados.
// Neste caso, a classe BibliotecaCadastroSetorFactory implementa o método
// criarCadastroSetor da interface CadastroSetorFactory
// para criar e retornar uma instância de CadastroBibliotecaSetor, que
// implementa a interface CadastroSetor.
// Isso permite que outras implementações de CadastroSetor possam ser
// adicionadas no futuro sem alterar esta fábrica.
