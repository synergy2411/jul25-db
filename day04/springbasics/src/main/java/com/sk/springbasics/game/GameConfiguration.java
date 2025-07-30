package com.sk.springbasics.game;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GameConfiguration {

    @Bean()
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public String getFullName(){
        return "Monica Geller";
    }

    @PostConstruct
    public void postBeanCreation(){
        System.out.println("----- POST CONSTRUCT CALLED");
    }

    @PreDestroy
    public void beforeBeanDestory(){
        System.out.println("------ PRE DESTROY CALLED");
    }
}