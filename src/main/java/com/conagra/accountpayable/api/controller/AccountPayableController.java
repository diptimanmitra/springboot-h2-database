package com.conagra.accountpayable.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conagra.accountpayable.api.model.AccountPayable;
import com.conagra.accountpayable.api.repository.AccountPayableRepository;

@RestController
@RequestMapping("/api/v1")
public class AccountPayableController {
	
	@Autowired
	private AccountPayableRepository employeeRepository;
	
	@GetMapping("/accounts")
	public List<AccountPayable> getAllAccounts() {
		return employeeRepository.findAll();
	}

}
