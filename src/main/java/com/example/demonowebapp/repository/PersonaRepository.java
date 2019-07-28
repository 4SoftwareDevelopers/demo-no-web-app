package com.example.demonowebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demonowebapp.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long>{

}
