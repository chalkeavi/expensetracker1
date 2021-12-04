package com.avinash.ExpenseTracker1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.ExpenseTracker1.model.Expense;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {
	
	@Autowired
	ExpenseDao expenseDao;
	
	@PostMapping("/save")
	public void saveExpense(@RequestBody Expense expense)
	{
		expenseDao.save(expense);
	}
	
	@GetMapping("/getAll")
	public List<Expense> getDetails()
	{
		return expenseDao.getAll();
	}
	/*
	 * @GetMapping("/getByPurchaseType/{purchaseType}") public List<Expense>
	 * getByType(@PathVariable String purchaseType) { return
	 * expenseDao.findByPurchaseType(purchaseType); }
	 * 
	 * @GetMapping("/getByCardType/{cardType}") public List<Expense>
	 * getBycardType(@PathVariable String cardType) { //return
	 * expenseDao.findByCardType(cardType); }
	 * 
	 * @GetMapping("/getByBankName/{bankName}") public List<Expense>
	 * getByBank(@PathVariable String bankName) { //return
	 * expenseDao.findByBankName(bankName); }
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "home.html";
	}
	
	@RequestMapping(value="/welcome1",produces =MediaType.APPLICATION_JSON_VALUE)
	public String getMessage() {
		return "Welcome to Angular and Spring Boot World";
	}
	
	@RequestMapping(value="/hello",produces =MediaType.APPLICATION_JSON_VALUE)
	public HelloBean helloBean() {
		throw new RuntimeException("Message");
		//return new HelloBean("Welcome to Angular and Spring Boot World");
	}
	
	@RequestMapping(value="/hello/{username}",produces =MediaType.APPLICATION_JSON_VALUE)
	public HelloBean helloBean(@PathVariable("username") String name) {
		
		return new HelloBean("Hello "+name);
	}
}
