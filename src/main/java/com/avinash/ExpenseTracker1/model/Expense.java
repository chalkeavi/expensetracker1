package com.avinash.ExpenseTracker1.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "expense")
public class Expense {
	
	@Id
	@GeneratedValue
	private Long id;
	private String details;
	private BigDecimal amount;
	private String purchaseType;
	private String cardType;
	private Date date;
	private String bank;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Expense [id=" + id + ", details=" + details + ", amount=" + amount + ", purchaseType=" + purchaseType
				+ ", cardType=" + cardType + ", date=" + date + ", bank=" + bank + ", description=" + description + "]";
	}
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expense(Long id, String details, BigDecimal amount, String purchaseType, String cardType, Date date,
			String bank, String description) {
		super();
		this.id = id;
		this.details = details;
		this.amount = amount;
		this.purchaseType = purchaseType;
		this.cardType = cardType;
		this.date = date;
		this.bank = bank;
		this.description = description;
	}
	
	
	

}
