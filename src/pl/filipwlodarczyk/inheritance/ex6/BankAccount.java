package pl.filipwlodarczyk.inheritance.ex6;

public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
    }
    
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    
    public void transfer(double amount, BankAccount bankAccountToTransfer) {
        this.withdraw(amount);
        bankAccountToTransfer.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }
    
    
    
    
}
