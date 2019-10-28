package com.firstdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;






@RestController
@RequestMapping(path="/stud")
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	@Autowired
	private StateService ss;
	
	
	@GetMapping("state/{id}")
	//@RequestMapping(value="/stateall",method=RequestMethod.GET)
	public Optional<State> getState(@PathVariable String id) {
		return ss.getState(id);
	}
	
	
    //Getting all the records from student database;
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public @ResponseBody List<Student> getStudentDetails(){
		List<Student> ls=new ArrayList<Student>();
	   
		//State st=new State();
	   //st.getSid();
	   //ls.add(st);
		ls=(List<Student>) repo.findAll();
		
		return ls;
	}
     
	@GetMapping("stud/{name}")
	public @ResponseBody List<Student> getStateName(@PathVariable("name") String name){
	  
		return repo.findByState(name);
	  
	}

	@GetMapping("studstate/{id}")
	public @ResponseBody List<Student> getStateId(@PathVariable("id")String id){
		List<Student> ls=new ArrayList<Student>();
		if(repo.findById(id) == null) {
			Student s=new Student();
			s.getState();
			
			ls.add(s);
				
		}
		return ls;
	}
	
	
	@GetMapping("student/{id}")
	
	public @ResponseBody List<Student> getStateNames(@PathVariable("id")String id){
		
		List<Student> ls=new ArrayList<Student>();
		System.out.println(repo.findById(id));
		Student s=  repo.findById(id).orElse(null);
		
		System.out.println("Student by id:" + s);
		ls.add(s);
		return ls;
	}
   
	/*@RequestMapping(value="stateid/{id}",method=RequestMethod.GET)

	public @ResponseBody List<Student> getStateId(@PathVariable("id")String id){
		
		List<Student> ls=new ArrayList<Student>();
		System.out.println(repo.findByStatesSid(id));
		
		ls=repo.findByStatesSid(id);
		
		
		return ls;
	}

	/*@RequestMapping(value="/create",method=RequestMethod.POST)
	
	 public Student addStudent(Student s) {
		
		
   return repo.save(emp);*/
   


	
	
}

