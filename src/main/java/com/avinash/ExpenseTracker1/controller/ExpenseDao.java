package com.avinash.ExpenseTracker1.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.avinash.ExpenseTracker1.model.Expense;

public interface ExpenseDao extends JpaRepository<Expense, Long> {
	
	@Query(value = "Select * from expense",nativeQuery = true)
	public List<Expense> getAll();

	public List<Expense> findByPurchaseType(String purchaseType);


}
