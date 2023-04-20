package com.varunreddy95.springboot.learnspringboot;

public class F1Teams {

	private int id;
	private String name;
	private String driver_name;
	

	public F1Teams(int id, String name, String driver_name) {
		super();
		this.id = id;
		this.name = name;
		this.driver_name = driver_name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDriver_name() {
		return driver_name;
	}

	@Override
	public String toString() {
		return "F1Teams [id=" + id + ", name=" + name + ", " + 
	           "driver_name=" + driver_name + "]";
	}
	
	
	
}
