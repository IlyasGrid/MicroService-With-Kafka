package com.ilyasgrid.webservicegraphql.service;


import com.ilyasgrid.webservicegraphql.dto.ReceiveAccount;
import com.ilyasgrid.webservicegraphql.dto.RequestAccount;
import com.ilyasgrid.webservicegraphql.entity.BankAccount;
import com.ilyasgrid.webservicegraphql.mapper.BankAccountMapper;
import com.ilyasgrid.webservicegraphql.repository.BankAccountRepo;

import java.util.List;
import java.util.Optional;

public class BankAccountImpl implements BankAccountService{


    BankAccountRepo bankAccountRepo;
    BankAccountMapper bankAccountMapper;
    public BankAccountImpl(BankAccountRepo bankAccountRepo, BankAccountMapper bankAccountMapper) {
        this.bankAccountRepo = bankAccountRepo;
        this.bankAccountMapper = bankAccountMapper;
    }

    @Override
    public Optional<RequestAccount> addAccount(RequestAccount requestAccount) {
        BankAccount bankAccount = bankAccountMapper.toEntity(requestAccount);
        bankAccountRepo.save(bankAccount);
        return Optional.ofNullable(requestAccount);
    }

    @Override
    public boolean deleteAccount(Long id) {
        return false;
    }

    @Override
    public ReceiveAccount updateAccount(Long id, RequestAccount requestAccount) {
        return null;
    }

    @Override
    public List<ReceiveAccount> getAllAccounts() {
        return List.of();
    }

    @Override
    public ReceiveAccount getAccountById(Long id) {
        return null;
    }
}