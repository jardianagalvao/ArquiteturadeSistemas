package cadastrolivro;

public interface CadastroSetorFactory {
    CadastroSetor criarCadastroSetor();
}

// Padrão GoF - Factory Method
// O método criarCadastroSetor representa o Factory Method, pois define uma
// operação para criar
// um objeto CadastroSetor, permitindo que as subclasses decidam qual classe
// concreta instanciar.