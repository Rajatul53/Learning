package com.eaxybites.accounts.service;

import com.eaxybites.accounts.dto.AccountsDto;
import com.eaxybites.accounts.dto.CustomerDto;
import com.eaxybites.accounts.entity.Customer;
import com.eaxybites.accounts.mapper.CustomerMapper;
import com.eaxybites.accounts.repository.AccountsRepository;
import com.eaxybites.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        customerRepository.save(customer);


    }
}
