package com.rt.gerenciamento_categorias.models;

import com.rt.gerenciamento_categorias.enums.CategoriaEnum;
import jakarta.persistence.*;

@Entity //entidade
@Table(name = "tb_categoria") //nome alternativo da tabela no banco de dados
public class Categoria {

    @Id //tag para identificar
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerar valor automaticamente
    private Long id;

    @Column(name = "nome_categoria") // nome alternativo da coluna no banco de dados
    private String nome;

    @Column(name = "descricao_categoria") // nome alternativo da coluna no banco de dados
    private String descricao;

    private CategoriaEnum login;

    private String password;

    public Categoria(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaEnum getLogin() {
        return login;
    }

    public void setLogin(CategoriaEnum login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
