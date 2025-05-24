com.tnsif.exceptions// Custom Exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom Exception for invalid amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// BankAccount class with public variables
class BankAccount {
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

// Main class
public class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, 5000.0);

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
	        
	    
	
		