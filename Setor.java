package cadastrolivro;

public class Setor {
    private String nome;
    private String codigo;
    private String cor;

    public Setor(String nome, String codigo, String cor) {
        this.nome = nome;
        this.codigo = codigo;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Setor{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
