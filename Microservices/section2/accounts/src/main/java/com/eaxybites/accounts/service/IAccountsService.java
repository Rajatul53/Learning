package com.eaxybites.accounts.service;

import com.eaxybites.accounts.dto.CustomerDto;


public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}