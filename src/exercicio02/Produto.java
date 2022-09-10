package exercicio02;

import java.util.Date;

public class Produto<T> {
    private T id;
    private double valor;
    private Date dataFabricacao;
    private Date dataVencimento;

    public Produto(T id, double valor, Date dataFabricacao, Date dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }


    public T getId() {
        return this.id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataFabricacao() {
        return this.dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", valor='" + getValor() + "'" +
            ", dataFabricacao='" + getDataFabricacao() + "'" +
            ", dataVencimento='" + getDataVencimento() + "'" +
            "}";
    }

}
