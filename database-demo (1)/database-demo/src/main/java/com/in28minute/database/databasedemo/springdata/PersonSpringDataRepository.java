package com.in28minute.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minute.database.databasedemo.entity.Person;

@Repository
public interface PersonSpringDataRepository
        extends JpaRepository<Person, Integer>{
}