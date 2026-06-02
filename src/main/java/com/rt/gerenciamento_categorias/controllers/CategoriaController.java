package com.rt.gerenciamento_categorias.controllers;

import com.rt.gerenciamento_categorias.models.Categoria;
import com.rt.gerenciamento_categorias.services.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController //
@RequestMapping("/categorias") //define o caminho para acessar a api
public class CategoriaController {

    @Autowired
    private CategoriaServices services;

    @PostMapping //criar entidade
    public Categoria criar(@RequestBody /*pega todos os dados da variável*/ Categoria categoria){
        return services.create(categoria);
    }

    @GetMapping //consultar entidade
    public List<Categoria> listar(){
        return services.listar();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> buscar(@PathVariable /* pega o caminho da variável*/ Long id){
        return services.bucarPorId(id);
    }

    @PutMapping("/{id}") //editar entidade
    public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id){
        return services.update(categoria, id);
    }

    @DeleteMapping("/{id}") //deletar entidade
    public void deletar(@PathVariable Long id){
        services.deletar(id);
    }

}
