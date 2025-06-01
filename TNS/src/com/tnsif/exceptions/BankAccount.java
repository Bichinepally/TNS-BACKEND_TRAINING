package com.tnsif.exceptiondemo;

public class BankAccount {
	public int accountNumber;
	    public double balance;

	    // Parameterized constructor
	    public BankAccount(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Method to deposit amount
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit amount must be greater than zero.");
	        }
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    // Method to withdraw amount
	    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    }

	    // Method to display balance
	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
	    }
	}

	
