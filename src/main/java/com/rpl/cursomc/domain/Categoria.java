package com.rpl.cursomc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @ManyToMany(mappedBy="categorias")
    private List<Produto> produtos = new ArrayList<>();

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
