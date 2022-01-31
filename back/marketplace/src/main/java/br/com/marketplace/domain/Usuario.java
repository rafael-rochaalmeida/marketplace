package br.com.marketplace.domain;


import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity(name = "usuario")
public class Usuario {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduto;

    @Column
    private String nomeUsuario;

    @Column
    private String loginUsuario;

    @Column
    private String senhaUsuario;

    @Column
    private Byte fotoPerfil;

    @Column
    private String cpf;

    @Column
    private String celular;

    @Column
    private Boolean possuiLoja;


    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Byte getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(Byte fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getPossuiLoja() {
        return possuiLoja;
    }

    public void setPossuiLoja(Boolean possuiLoja) {
        this.possuiLoja = possuiLoja;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "idProduto=" + idProduto +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", loginUsuario='" + loginUsuario + '\'' +
                ", senhaUsuario='" + senhaUsuario + '\'' +
                ", fotoPerfil=" + fotoPerfil +
                ", cpf='" + cpf + '\'' +
                ", celular='" + celular + '\'' +
                ", possuiLoja=" + possuiLoja +
                '}';
    }
}
