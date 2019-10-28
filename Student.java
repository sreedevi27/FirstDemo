package com.firstdemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="Studentdetails")
public class Student {
	
	@javax.persistence.Id
	//@Column(name="id")
	private String id;
	
	//@Column(name="name")
	private String name;
	
	//@Column(name="state")
	private String state;
	
	//@Column(name="country")
	private String country;
	
	//@Column(name="zipcode")
	private int zipcode;

	  @ManyToOne
	private State states;

	 public Student() {
		 
	 }
	

		
		public Student(String id, String name, String state, String country, int zipcode, State states) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.states = states;
	}




		public State getStates() {
		return states;
	}

	public void setStates(State states) {
		this.states = states;
	}

		public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	/*public void add(StudentState s) {
		if(ss ==null) {
			ss=new ArrayList<>();
		}
		ss.add(s);
		s.setStudent(this);
			
		}*/
	}


