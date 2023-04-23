package com.varunreddy95.springboot.learnjpahibernate.teams.JPA;

import org.springframework.stereotype.Repository;

import com.varunreddy95.springboot.learnjpahibernate.teams.Teams;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TeamsJPARepository {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	public void insert(Teams team) {
		entitymanager.merge(team);
	}
	
	public Teams findById(int id) {
		return entitymanager.find(Teams.class, id);
	}
	
	public void deleteById(int id) {
		Teams team = entitymanager.find(Teams.class, id);
		entitymanager.remove(team);
	}
}
