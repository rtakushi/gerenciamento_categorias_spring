package com.rt.gerenciamento_categorias.services;

import com.rt.gerenciamento_categorias.models.Categoria;
import com.rt.gerenciamento_categorias.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServices {

    @Autowired
    private CategoriaRepository repository;

    public Categoria create(Categoria categoria){
        return repository.save(categoria);
    }

    public List<Categoria> listar(){
        return repository.findAll();
    }

    public Optional<Categoria> bucarPorId(Long id){
        return repository.findById(id);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
