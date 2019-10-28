package com.firstdemo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State {
	@Id
	@Column(name="sid")
	private String sid;
	
	@Column(name="sname")
    private String sname;

	@OneToMany(mappedBy = "states")
	private List<Student> students;
	
		public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

		public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
    
	/*@OneToOne
	   @JoinColumn(name = "stateid", referencedColumnName = "id")
	   private Student student;*/

	/*@OneToMany(mappedBy = "studentstate")

	/*@ManyToOne
	@JoinColumn(name="state_id")*/
	/*private Student student;*/
	 
	/*public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}*/

		
	
	
	

}
