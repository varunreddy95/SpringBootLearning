package com.varunreddy95.springboot.learnjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.varunreddy95.springboot.learnjpahibernate.teams.Teams;
import com.varunreddy95.springboot.learnjpahibernate.teams.jdbc.TeamsJDBCRepository;

//@Component
public class TeamsJDBCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private TeamsJDBCRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Teams(1, "Scuderia Ferrari", "Charles Leclerc"));
		repository.insert(new Teams(2, "Merecedes Petronas Amg", "Lewis Hamilton"));
		repository.insert(new Teams(3, "RedBull Racing", "Max Verstappen"));
		repository.insert(new Teams(4, "Alpine F1", "Pierre Gasly"));
		repository.insert(new Teams(5, "Aston Martin F1", "Fernando Alonso"));
		repository.insert(new Teams(6, "Haas F1", "Nico Hulkenberg"));
		repository.insert(new Teams(7, "Mclaren F1", "Lando Norris"));
		repository.insert(new Teams(8, "Williams", "Alex Albon"));
		repository.insert(new Teams(9, "Alfa Romeo", "Valteri Bottas"));
		repository.insert(new Teams(10, "AlphaTauri", "Yuki Tsunoda"));
		
		repository.delete(10);
		
		System.out.println(repository.select(1));
		System.out.println(repository.select(2));
	}

}
