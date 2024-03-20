package br.com.fiap.epicar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.epicar.model.Categoria;

public interface RepositoryCategoria extends JpaRepository<Categoria, Long> {

}
