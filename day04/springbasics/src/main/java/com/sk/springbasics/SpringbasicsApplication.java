package com.sk.springbasics;

import com.sk.springbasics.game.GameRunner;
import com.sk.springbasics.game.GamingConsole;
import com.sk.springbasics.game.MarioGame;
import com.sk.springbasics.game.SuperContraGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan({"com.sk.springbasics.*", "org.myapp.otherpackage"})
//@Configuration
public class SpringbasicsApplication {

	final private static Logger logger = LoggerFactory.getLogger(SpringbasicsApplication.class);


	public static void main(String[] args) {

		logger.error("LOGGER ERROR MESSAGE");
		logger.debug("DEBUG LOGGER MESSAGE");
		logger.warn("WRNING LOGGER MESSAGE");
		logger.info("LOGGER INFO MESSAGE");

		ConfigurableApplicationContext context =
				SpringApplication.run(SpringbasicsApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		String getFullName = (String) context.getBean("getFullName");
		System.out.println("Full Name : " + getFullName);


//		GamingConsole game = new SuperContraGame();
//		GamingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();
	}

}

// Creating and managing beans in the Spring Container / Context
// IoC: