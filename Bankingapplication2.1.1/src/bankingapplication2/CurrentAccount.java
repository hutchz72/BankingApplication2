/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication2;

/**
 *
 * @author Hutchy
 */
public class CurrentAccount implements Account{
    private int accountNumber;
    private String accountName;
    private double minimum = 1000;
    private double balance;
    private String accountType = "CurrentAccount";
    
    public CurrentAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public double getMinimum(){
        return this.minimum;
    }
    public void setMinimum(double minimum){
        this.minimum = minimum;
    }
    
    @Override
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }
    @Override
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }
    @Override
    public double getBalance(){
        return this.balance;
    }
    @Override
    public String getAccountType(){
        return this.accountType;
    }
    @Override
    public int getAccountNumber(){
        return this.accountNumber;
    }
    @Override
    public String getAccountName(){
        return this.accountName;
    }
}
