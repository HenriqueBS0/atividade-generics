package exercicio03;

public class Produto {
    private int codigo;
    private float valor;
    private String nome;

    public Produto(int codigo, float valor, String nome) {
        this.codigo = codigo;
        this.valor = valor;
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", valor='" + getValor() + "'" +
            ", nome='" + getNome() + "'" +
            "}";
    }    
}
