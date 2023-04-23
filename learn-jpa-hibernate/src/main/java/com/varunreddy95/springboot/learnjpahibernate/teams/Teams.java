package com.varunreddy95.springboot.learnjpahibernate.teams;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="formula")
public class Teams {

	@Id
	private int id;
	
	@Column(name="teamname")
	private String teamname;
	
	@Column(name="drivername")
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




	public void setId(int id) {
		this.id = id;
	}


	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}


	public void setDrivername(String drivername) {
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
