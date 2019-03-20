package pro1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;


public class Menu extends Account{
	
	int selection;
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer , Integer> data = new HashMap<Integer , Integer>();
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do{
			try{
				
				
				data.put(756780, 4567);
				data.put(709659, 1234);
				
				System.out.println("Welcome To The ATM Of ABC Bank !!!");
				
				System.out.println("Enter Your Customer Number :  ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter Your Pin Number :  ");
				setPinNumber(menuInput.nextInt());
				
			}
			catch(Exception e){
				System.out.println("\n" + "Invalid Character(s). Only numbers." + "\n");
				x = 2;
			}
			
			for(Entry<Integer, Integer> entry : data.entrySet()){
				if(entry.getKey() == getCustomerNumber()  &&  entry.getValue() == getPinNumber()){
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
		}while(x == 1);
	}
	
	/* Display Account Type Menu With Selection */
	
	public void getAccountType(){
		System.out.println("Select the Account you want to access : ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice : ");
		
		selection = menuInput.nextInt();
		
		switch(selection){
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank You For Using This ATM, Bye Have A Nice Day !");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getAccountType();
		}
	}
	
	public void getChecking(){
		System.out.println("Checking Account : ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice : ");
				
		selection = menuInput.nextInt();
		
		switch(selection){
		case 1:
			System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You For Using This ATM, Bye Have A Nice Day !");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}
	
	public void getSaving(){
		System.out.println("Saving Account : ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice : ");
				
		selection = menuInput.nextInt();
		
		switch(selection){
		case 1:
			System.out.println("Saving Account Balance : " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You For Using This ATM, Bye Have A Nice Day !");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getSaving();
		}
	}
}

