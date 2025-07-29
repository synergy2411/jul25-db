package com.eazybank.accounts.controller;

import com.eazybank.accounts.dto.CustomerDto;
import com.eazybank.accounts.dto.ResponseDto;
import com.eazybank.accounts.service.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AccountsController {

    private AccountsService accountsService;

    @GetMapping("/greet")
    public ResponseEntity<ResponseDto> greet() {
        return ResponseEntity
                .status(201)
                .body(new ResponseDto("SUCCESS", HttpStatus.OK));
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> create(@RequestBody CustomerDto customerDto){
        accountsService.create(customerDto);
        return ResponseEntity.status(201)
                .body(new ResponseDto("CREATED", HttpStatus.CREATED));

    }


}
