package cadastrolivro;

import java.util.List;

public class CadastroBibliotecaSetor implements CadastroSetor {
    private List<Setor> setores;

    public CadastroBibliotecaSetor(List<Setor> setores) {
        this.setores = setores;
    }

    @Override
    public void cadastrar(String nome, String codigo, String cor) {
        Setor novoSetor = new Setor(nome, codigo, cor);
        setores.add(novoSetor);
        System.out.println("Setor cadastrado com sucesso!");
    }

    @Override
    public void listarTodos() {
        if (setores.isEmpty()) {
            System.out.println("Nenhum setor cadastrado.");
        } else {
            System.out.println("Listando todos os setores:");
            for (Setor setor : setores) {
                System.out.println(setor);
            }
        }
    }

    @Override
    public void atualizar(String codigo, String novoNome, String novaCor) {
        for (Setor setor : setores) {
            if (setor.getCodigo().equals(codigo)) {
                setor.setNome(novoNome);
                setor.setCor(novaCor);
                System.out.println("Setor atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Setor não encontrado para atualização.");
    }

    @Override
    public void excluir(String codigo) {
        Setor setorParaExcluir = null;
        for (Setor setor : setores) {
            if (setor.getCodigo().equals(codigo)) {
                setorParaExcluir = setor;
                break;
            }
        }
        if (setorParaExcluir != null) {
            setores.remove(setorParaExcluir);
            System.out.println("Setor excluído com sucesso!");
        } else {
            System.out.println("Setor não encontrado para exclusão.");
        }
    }
}

// GRASP- apresenta alta coesão, pois todas as operações relacionadas ao
// cadastro, listagem,
// atualização e exclusão de setores estão agrupadas em uma única classe. Além
// disso, a classe possui baixo acoplamento, pois não depende diretamente de
// outras classes
// além das fornecidas pelos parâmetros dos métodos