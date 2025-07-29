package com.eazybank.accounts.service.impl;

import com.eazybank.accounts.dto.AccountsDto;
import com.eazybank.accounts.dto.CustomerDto;
import com.eazybank.accounts.entity.Accounts;
import com.eazybank.accounts.entity.Customer;
import com.eazybank.accounts.mapper.AccountsMapper;
import com.eazybank.accounts.mapper.CustomerMapper;
import com.eazybank.accounts.repository.AccountsRepository;
import com.eazybank.accounts.repository.CustomerRepository;
import com.eazybank.accounts.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;


@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public void create(CustomerDto customerDto) {
        String mobileNumber = customerDto.getMobileNumber();
        Optional<Customer> foundCustomer =
                customerRepository.findByMobileNumber(mobileNumber);
        if(foundCustomer.isPresent()){
                throw new RuntimeException("Customer already exists for mobile number - " + mobileNumber);
        }

        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer = customerRepository.save(customer);

        AccountsDto accountsDto = openAccount(savedCustomer.getCustomerId());
        Accounts accounts = AccountsMapper.mapToAccounts(accountsDto, new Accounts());
        accounts.setCustomerId(savedCustomer.getCustomerId());
        accountsRepository.save(accounts);
    }

    private AccountsDto openAccount(long customerId) {
        AccountsDto accountsDto = new AccountsDto();
        accountsDto.setAccountType("SAVINGS");
        accountsDto.setBranchAddress("201, Main Road, Wakad, Pune");
        long randomNumber = new Random().nextInt(900000000) + 10000000;
        accountsDto.setAccountNumber(randomNumber);
        return accountsDto;

    }
}
