package com.rpl.cursomc.resources;

import com.rpl.cursomc.domain.Categoria;
import com.rpl.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResources {

    @Autowired
    CategoriaService service;

    @GetMapping()
    public ResponseEntity<?> findAll(){
        List<Categoria> listaCategoria = service.buscarTodos();
        return ResponseEntity.ok().body(listaCategoria);
    }
}
