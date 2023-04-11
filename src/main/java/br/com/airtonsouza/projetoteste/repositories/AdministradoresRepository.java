package br.com.airtonsouza.projetoteste.repositories;

import org.springframework.data.repository.CrudRepository;
import br.com.airtonsouza.models.Administrador;

public interface AdministradoresRepository extends CrudRepository<Administrador, Integer>{ 
    
}
