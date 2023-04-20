package com.varunreddy95.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * F1Teams(Team_Id, Name, Driver)
 */


@RestController
public class AppController {
	
	//Uri:  http://localhost:8080/teams

	
	@RequestMapping("/teams")
	public List<F1Teams> retrieveAllTeams() {
		return Arrays.asList(
				new F1Teams(1, "Scuderia Ferrari", "Charles Leclerc"),
			    new F1Teams(2, "Mercedes Petronas Amg", "Lewis Hamilton"),
			    new F1Teams(3, "Redbull Oracle Racing", "Max Verstappen"),
			    new F1Teams(4, "Aston Marting Racing", "Fernando Alonso"),
			    new F1Teams(5, "Alpine F1", "Pierre Gasly"),
			    new F1Teams(6, "Mclaren", "Lando Norris"),
			    new F1Teams(7, "Haas F1", "Nico Hulkenberg"),
			    new F1Teams(8, "Alfa Romeo Sauber", "Valteri Bottas"),
			    new F1Teams(9, "Williams Racing", "Alex Albon"),
			    new F1Teams(10, "Scuderia AlphaTauri", "Yuki Tsunoda"));
	}
	
	
	
}
