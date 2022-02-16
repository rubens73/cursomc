package com.rpl.cursomc.services;

import com.rpl.cursomc.domain.Categoria;
import com.rpl.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id){
        return repository.getById(id);
    }

    public List<Categoria> buscarTodos(){
        return repository.findAll();
    }

    public void salvar(Categoria categoria){
        repository.save(categoria);
    }

    public void alterar(Categoria categoria){
        Categoria categoriaAlterado = buscar(categoria.getId());
        categoriaAlterado.setNome(categoria.getNome());
        repository.save(categoriaAlterado);
    }

    public void apagar(Categoria categoria){
        repository.delete(categoria);
    }
}
