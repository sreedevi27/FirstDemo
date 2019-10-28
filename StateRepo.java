package com.firstdemo;

import org.springframework.data.repository.CrudRepository;

public interface StateRepo extends CrudRepository<State, String>  {

}
