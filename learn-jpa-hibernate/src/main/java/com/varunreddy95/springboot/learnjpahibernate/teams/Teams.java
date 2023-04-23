package com.varunreddy95.springboot.learnjpahibernate.teams;

import org.springframework.stereotype.Component;

@Component
public class Teams {

	private int id;
	private String teamname;
	private String drivername;
	
	
	public Teams() {
		super();
	}
	

	public Teams(int id, String teamname, String drivername) {
		super();
		this.id = id;
		this.teamname = teamname;
		this.drivername = drivername;
	}




	public int getId() {
		return id;
	}


	public String getTeamname() {
		return teamname;
	}


	public String getDrivername() {
		return drivername;
	}


	@Override
	public String toString() {
		return "Teams [id=" + id + ", teamname=" + teamname + ", drivername=" + drivername + "]";
	}
	
	
	
}
