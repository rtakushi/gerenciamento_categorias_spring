package com.rt.gerenciamento_categorias.services;

import com.rt.gerenciamento_categorias.models.Categoria;
import com.rt.gerenciamento_categorias.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //cria serviços do CRUD
public class CategoriaServices implements UserDetailsService {

    @Autowired //
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

    public Categoria update(Categoria categoria, Long id){
        Categoria response = repository.findById(id).get();
        response.setDescricao(categoria.getDescricao());
        response.setNome(categoria.getNome());

        return repository.save(response);
    }


    public void deletar(Long id){
        repository.deleteById(id);
    }

    @Override //sobrescreve uma funçao
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return  repository.findByLogin(username);
    }


}
