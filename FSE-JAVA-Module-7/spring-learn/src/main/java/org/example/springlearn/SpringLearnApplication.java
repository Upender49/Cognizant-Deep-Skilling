package org.example.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) throws Exception {

        SpringApplication.run(SpringLearnApplication.class, args);
        //displayData();
        //displayCountry();
       // displayCountries();
    }
    public static void displayCountries(){
        logger.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countryList",List.class);
        logger.debug("Countries : {}", countries);
        logger.info("END");

    }
    public static void displayCountry() {
        logger.info("START");
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "country.xml");
        Country country1 = context.getBean("country", Country.class);
        Country country2 = context.getBean("country", Country.class);
        logger.debug("Country : {}", country1.hashCode());
        logger.debug("Country : {}", country2.hashCode());
        logger.info("END");
    }

    public static void displayData() throws Exception {
        logger.info("Start");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = applicationContext.getBean("dateFormat", SimpleDateFormat.class);
        Date date = format.parse("31/12/2018");
        logger.debug("Date :{}", date);
        System.out.println(date);
        logger.info("End");
    }

}
