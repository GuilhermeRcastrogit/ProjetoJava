package br.com.fiap.epicar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.epicar.model.Categoria;

@RestController
@RequestMapping("categoriaCarros")
public class CategoriaController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<Categoria> repository = new ArrayList<>();
    
    @GetMapping
    public List<Categoria> index(){
        return repository;
    }

    @PostMapping
    public ResponseEntity<Categoria> create(@RequestBody Categoria categoria){
        log.info("Categoria sendo cadastrada {}", categoria);
        repository.add(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoria);
    }

    @GetMapping("{id}")
    public ResponseEntity<Categoria> show(@PathVariable Long id){
        log.info("buscando categoria por id {}", id);

        for(Categoria categoria: repository){
            if (categoria.id().equals(id))
                return ResponseEntity.status(HttpStatus.OK).body(categoria);
        }

        //TODO refatorar com stream

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        log.info("Excluindo usuário com id {}", id);
 
        Optional<Categoria> categoriaOpt = repository.stream()
                .filter(categoria -> categoria.id().equals(id))
                .findFirst();
 
        if (categoriaOpt.isPresent()) {
            repository.remove(categoriaOpt.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

        @PutMapping("/{id}")
    public ResponseEntity<Categoria> update(@PathVariable Long id, @RequestBody Categoria categoriaAtualizada){
        log.info("Atualizando a categoria por id {}", id);
 
        for (int i = 0; i < repository.size(); i++) {
            Categoria categoria = repository.get(i);
            if (categoria.id().equals(id)) {
                repository.set(i, categoriaAtualizada);
                return ResponseEntity.status(HttpStatus.OK).body(categoriaAtualizada);
            }
        }
 
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
