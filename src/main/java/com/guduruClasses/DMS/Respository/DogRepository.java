package com.guduruClasses.DMS.Respository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.guduruClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
   List<Dog>findByName(String name);
}
