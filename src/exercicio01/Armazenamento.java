package exercicio01;

public class Armazenamento<T> {
    private T dado;

    public Armazenamento(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }


    @Override
    public String toString() {
        return "{" +
            " dado='" + getDado() + "'" +
            "}";
    }    
}
