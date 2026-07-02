package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;

@SpringBootApplication
public class OrmLearnApplication {

	private static CountryService countryService;
	private static final Logger logger = LoggerFactory.getLogger(OrmLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

}
