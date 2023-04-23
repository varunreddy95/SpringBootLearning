package com.varunreddy95.springboot.learnjpahibernate.teams.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.varunreddy95.springboot.learnjpahibernate.teams.Teams;

@Repository
public class TeamsJDBCRepository {
	
	@Autowired
	JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY = 
			"""
				INSERT INTO formula(id, teamname, drivername)
				VALUES(?, ?, ?)
			""";
	
	private static String DELETE_QUERY = 
			"""
				DELETE FROM formula WHERE id=?
			""";
	
	public void insert(Teams team) {
		springJdbcTemplate.update(INSERT_QUERY, 
				team.getId(), team.getTeamname(), team.getDrivername());
	}
	
	public void delete(int id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
}
