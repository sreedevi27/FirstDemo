package com.firstdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

	@Autowired
	private StateRepo srepo;
	public List<State> getAll()
	{
		List<State> ls=new ArrayList<State>();
	  srepo.findAll().forEach(ls::add);
	  return ls;
		
	}
  public Optional<State> getState(String id) {
	  return srepo.findById(id);
  }


}

