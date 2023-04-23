package com.varunreddy95.springboot.learnjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.varunreddy95.springboot.learnjpahibernate.teams.Teams;
import com.varunreddy95.springboot.learnjpahibernate.teams.JPA.TeamsJPARepository;
import com.varunreddy95.springboot.learnjpahibernate.teams.springdatajpa.TeamsSpringDataJPARepository;

@Component
public class TeamsJPACommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private TeamsJPARepository repository;
	
	@Autowired
	private TeamsSpringDataJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Teams(1, "Scuderia Ferrari", "Charles Leclerc"));
		repository.save(new Teams(2, "Merecedes Petronas Amg", "Lewis Hamilton"));
		repository.save(new Teams(3, "RedBull Racing", "Max Verstappen"));
		repository.save(new Teams(4, "Alpine F1", "Pierre Gasly"));
		repository.save(new Teams(5, "Aston Martin F1", "Fernando Alonso"));
		repository.save(new Teams(6, "Haas F1", "Nico Hulkenberg"));
		repository.save(new Teams(7, "Mclaren F1", "Lando Norris"));
		repository.save(new Teams(8, "Williams", "Alex Albon"));
		repository.save(new Teams(9, "Alfa Romeo", "Valteri Bottas"));
		repository.save(new Teams(10, "AlphaTauri", "Yuki Tsunoda"));
		
		repository.deleteById(10);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		
		repository.save(new Teams(10, "AlphaTauri", "Yuki Tsunoda"));
	}
	
}
