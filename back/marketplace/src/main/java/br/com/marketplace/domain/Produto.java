package br.com.marketplace.domain;


import javax.persistence.*;

@Entity(name = "produto")
public class Produto {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproduto;

    @Column
    private String nomeProduto;

    @Column
    private Double precoProduto;

    @Column
    private String descricaoProduto;

    @Column
    private int fkloja;

    public int getFkloja() {
        return fkloja;
    }

    public void setFkloja(int fkloja) {
        this.fkloja = fkloja;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "id=" + idproduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                '}';
    }
}
