package com.in28minute.database.databasedemo;

import com.in28minute.database.databasedemo.jdbc.PersonJdbcDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner
{
	private Logger logger= (Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
    PersonJdbcDao dao;
	public static void main(String[] args)
	{
		SpringApplication.run(DatabaseDemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception
	{
        /*logger.info("",dao.findAll());

*/	}

}
