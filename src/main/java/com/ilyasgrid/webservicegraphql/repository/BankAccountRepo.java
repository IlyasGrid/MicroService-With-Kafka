package com.ilyasgrid.webservicegraphql.repository;


import com.ilyasgrid.webservicegraphql.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount, Long> {

}