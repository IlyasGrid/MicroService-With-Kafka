package com.ilyasgrid.webservicegraphql.service;


public interface BankAccountService {

    Optional<RequestAccount> addAccount(RequestAccount requestAccount);

    boolean deleteAccount(Long id);

    ReceiveAccount updateAccount(Long id, RequestAccount requestAccount);

    List<ReceiveAccount> getAllAccounts();

    ReceiveAccount getAccountById(Long id);
}