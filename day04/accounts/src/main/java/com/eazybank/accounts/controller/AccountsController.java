package com.eazybank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountsController {

    @GetMapping("/greet")
    public String greet(){
        return "Hello World!";
    }



}
