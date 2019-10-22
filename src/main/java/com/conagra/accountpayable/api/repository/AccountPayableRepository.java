package com.conagra.accountpayable.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conagra.accountpayable.api.model.AccountPayable;

@Repository
public interface AccountPayableRepository extends JpaRepository<AccountPayable, Long>{

}
