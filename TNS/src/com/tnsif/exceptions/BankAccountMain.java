package com.tnsif.exceptiondemo;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(101,5000.0);
		        try {
		            account.displayBalance();

		            // Depositing an amount
		            account.deposit(2000);

		            // Withdrawing an amount
		            account.withdraw(3000);

		            // Display final balance
		            account.displayBalance();

		        } catch (InvalidAmountException e) {
		            System.out.println("Error: " + e.getMessage());
		        } catch (InsufficientFundsException e) {
		            System.out.println("Error: " + e.getMessage());
		        } finally {
		            System.out.println("Transaction process completed.");
		        }
		    }
		}

