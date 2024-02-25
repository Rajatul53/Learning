package com.eaxybites.accounts.service;

import com.eaxybites.accounts.constants.AccountsConstants;
import com.eaxybites.accounts.dto.CustomerDto;
import com.eaxybites.accounts.entity.Accounts;
import com.eaxybites.accounts.entity.Customer;
import com.eaxybites.accounts.mapper.CustomerMapper;
import com.eaxybites.accounts.repository.AccountsRepository;
import com.eaxybites.accounts.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@AllArgsConstructor
@Service
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);
        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        return newAccount;
    }
}
