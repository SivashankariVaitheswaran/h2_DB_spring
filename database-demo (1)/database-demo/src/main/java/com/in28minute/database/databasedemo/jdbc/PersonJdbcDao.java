package com.in28minute.database.databasedemo.jdbc;

import com.in28minute.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao
{
    @Autowired
    JdbcTemplate jdbcTemplate;
    private Object Person;

    //select * from Persontable;
    //need to select data as list from person db table
    public List<Person> findAll()
    {
        jdbcTemplate.query("select * from Person", new BeanPropertyRowMapper<Person>(Person.class));
        return null;
    }
    public List<Person> findId(int id) {
        jdbcTemplate.queryForObject("select * from Person where id=?", new Object[]{id} ,new BeanPropertyRowMapper<Person>(Person.class));
        return null;
    }
}
