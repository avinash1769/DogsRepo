package com.yandapalliClasses.DMS.repository;

/**
*
* @author Avinash Yandapalli
*/
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yandapalliClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog >findByName(String name);
	
	

}
