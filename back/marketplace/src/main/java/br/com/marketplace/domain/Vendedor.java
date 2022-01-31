package br.com.marketplace.domain;


import javax.persistence.*;

@Entity(name = "vendedor")
public class Vendedor {


    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVendedor;

    @Column
    private String nomeLoja;

    @Column
    private String cnpj;


    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor +
                ", nomeLoja='" + nomeLoja + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
