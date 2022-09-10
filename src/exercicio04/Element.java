package exercicio04;

public class Element<T> {
    private String chave;
    private T dado;

    public Element(String chave, T dado) {
        this.chave = chave;
        this.dado = dado;
    }

    public String getChave() {
        return this.chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public T getDado() {
        return this.dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    @Override
    public String toString() {
        return "{" +
            " chave='" + getChave() + "'" +
            ", dado='" + getDado() + "'" +
            "}";
    }
}
