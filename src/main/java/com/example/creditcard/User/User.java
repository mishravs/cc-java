package com.example.creditcard.User;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cardUser")
public class User {
	private String cardNumber;
	private String holderName;
	private Date expiry;
	private String cvv;
	private long amount;

	User() {
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public User(String cardNumber, String holderName, Date expiry, String cvv, long amount) {
		super();
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.expiry = expiry;
		this.cvv = cvv;
		this.amount = amount;
	}

}
