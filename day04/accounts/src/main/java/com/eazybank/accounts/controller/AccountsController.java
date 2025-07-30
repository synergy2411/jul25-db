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
        Long accountsId = accountsService.create(customerDto);
        return ResponseEntity.status(201)
                .body(new ResponseDto("CREATED - " + accountsId, HttpStatus.CREATED));

    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetch(@RequestParam String mobileNumber){
        CustomerDto customerDto = accountsService.fetch(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(customerDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> delete(@RequestParam String mobileNumber){
        Boolean isDeleted = accountsService.delete(mobileNumber);
        if(isDeleted){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Deleted successfully", HttpStatus.OK));
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseDto("Unable to delete for mobile number - " + mobileNumber, HttpStatus.NOT_FOUND));
        }
    }

    @PatchMapping("/update")
    public ResponseEntity<ResponseDto> update(@RequestBody CustomerDto customerDto){
        Boolean isUpdated = accountsService.update(customerDto);
        if(isUpdated){
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new ResponseDto("Updated successfully.",HttpStatus.ACCEPTED));
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseDto("Unable to update record for mobile number - " + customerDto.getMobileNumber(), HttpStatus.ACCEPTED));
        }
    }


}