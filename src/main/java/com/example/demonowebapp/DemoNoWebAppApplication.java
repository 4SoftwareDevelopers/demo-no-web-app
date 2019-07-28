package com.example.demonowebapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demonowebapp.model.Persona;
import com.example.demonowebapp.repository.PersonaRepository;

@SpringBootApplication
public class DemoNoWebAppApplication implements CommandLineRunner{
	
	@Autowired
	private PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoNoWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("INICIANDO EJECUCIÓN...");
		List<Persona> personas = new ArrayList<Persona>();
		for (int i = 0; i < 10; i++) {
			Persona persona = new Persona();
			persona.setNombre("Jordy "+i);
			persona.setApellido("Rodríguez "+i);
			persona.setDireccion("Cra 1000");
			persona.setTelefono("212121212");
			personas.add(persona);
		}
		
		System.out.println("INSERTANDO REGISTROS...");
		personaRepository.saveAll(personas);
		
		personaRepository.findAll().forEach(persona -> System.out.println(persona));
	}
	
	

}
