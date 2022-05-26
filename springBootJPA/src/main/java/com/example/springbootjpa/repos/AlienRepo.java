package com.example.springbootjpa.repos;

import com.example.springbootjpa.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
}
