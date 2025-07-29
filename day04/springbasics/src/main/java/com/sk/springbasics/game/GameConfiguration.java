package com.sk.springbasics.game;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean("getFullName")
    public String getFullName(){
        return "Monica Geller";
    }
}
