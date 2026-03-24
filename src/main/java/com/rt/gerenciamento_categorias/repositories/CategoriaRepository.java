package com.rt.gerenciamento_categorias.repositories;

import com.rt.gerenciamento_categorias.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
