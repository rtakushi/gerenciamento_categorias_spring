package com.rt.gerenciamento_categorias.repositories;

import com.rt.gerenciamento_categorias.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    UserDetails findByLogin(String login);

}
