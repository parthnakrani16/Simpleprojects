package pro1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account{
	
	private int customerNumber ;
	private int pinNumber ;
	private double checkingBalance = 0 ;
	private double savingBalance = 0 ;
	
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	/* set the customer number */
	
	public int setCustomerNumber(int customerNumber){		
		this.customerNumber = customerNumber ;
		return customerNumber;
	}
	
	/* get the customer number */
	
	public int getCustomerNumber(){
		return customerNumber;
	}
	
	/* set the pin number */
	
	public int setPinNumber(int pinNumber){
		this.pinNumber = pinNumber ;
		return pinNumber;
	}
	
	/* get the pin number */
	
	public int getPinNumber(){
		return pinNumber;
	}
	
	/* get Saving Account Balance */
	
	public double getSavingBalance(){
		return savingBalance;
	}
	
	/* get Checking Account Balance */
	
	public double getCheckingBalance(){
		return checkingBalance;
	}
	
	/* calculate Checking Account Withdrawal */
	
	public double calcCheckingWithdraw(double amount){
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
		
	/* calculate Saving Account Withdrawal */
	
	public double calcSavingWithdraw(double amount){
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	/* calculate Checking Account Deposit */
	
	public double calcCheckingDeposite(double amount){
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	/* calculate Saving Account Deposit */
	
	public double calcSavingDeposite(double amount){
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	/* customer checking Account Withdrawal input*/
	
	public void getCheckingWithdrawInput(){
		System.out.println("Checking Account Balance :" + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0 ){
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance :" + moneyFormat.format(checkingBalance));
		}else{
			System.out.println("Balance cannot be negative :" + "\n");
		}
	}
	
	/* customer saving Account Withdrawal input*/
	
	public void getSavingWithdrawInput(){
		System.out.println("Saving Account Balance :" + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0 ){
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance :" + moneyFormat.format(savingBalance));
		}else{
			System.out.println("Balance cannot be negative :" + "\n");
		}
	}
	
	/* customer checking Account Deposit input*/
	
	public void getCheckingDepositInput(){
		System.out.println("Checking Account Balance :" + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0 ){
			calcCheckingDeposite(amount);
			System.out.println("New Checking Account Balance :" + moneyFormat.format(checkingBalance));
		}else{
			System.out.println("Balance cannot be negative :" + "\n");
		}	
	}
	
	/* customer saving Account Deposit input*/
	
	public void getSavingDepositInput(){
		System.out.println("Saving Account Balance :" + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0 ){
			calcSavingDeposite(amount);
			System.out.println("New Saving Account Balance :" + moneyFormat.format(savingBalance));
		}else{
			System.out.println("Balance cannot be negative :" + "\n");
		}	
	}	
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		