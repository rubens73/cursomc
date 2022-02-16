package com.rpl.cursomc.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class CategoriaTest {

    @Autowired
    private static Categoria categoria = new Categoria();

    @BeforeAll
    static void beforeAll() {
        categoria.setId(1);
        categoria.setNome("Teste");
    }

    @Test
    void criarObjeto() {
        Assert.notNull(categoria);
    }
}
