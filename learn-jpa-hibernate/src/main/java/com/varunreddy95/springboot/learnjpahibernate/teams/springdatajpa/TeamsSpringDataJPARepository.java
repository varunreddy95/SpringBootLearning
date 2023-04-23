package com.varunreddy95.springboot.learnjpahibernate.teams.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varunreddy95.springboot.learnjpahibernate.teams.Teams;

public interface TeamsSpringDataJPARepository extends JpaRepository<Teams, Integer>{
	
}
