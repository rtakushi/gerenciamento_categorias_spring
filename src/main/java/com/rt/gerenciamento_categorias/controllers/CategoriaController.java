package com.rt.gerenciamento_categorias.controllers;

import com.rt.gerenciamento_categorias.models.Categoria;
import com.rt.gerenciamento_categorias.services.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaServices services;

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria){
        return services.create(categoria);
    }

    @GetMapping
    public List<Categoria> listar(){
        return services.listar();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> buscar(@PathVariable Long id){
        return services.bucarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        services.deletar(id);
    }

}
