package guvitask2;

import java.util.Scanner;

class Account{
	
	//instance variable
	double balance = 0 ,depositAmount , withdrawAmount ; 
	
	//no argument constructor
	Account(){
		System.out.println("No-Argumented Constructor");
	}
	
	//two Arguments Constructor
	Account(String name,int accountNumber ,double depositAmount,double withdrawnAmount ){	
		this.depositAmount = depositAmount;
		this .withdrawAmount = withdrawnAmount;
		System.out.println("Two Argumented Constructor \n" );
		System.out.println("NAME : "+name+"  Acc Number : "+accountNumber+"  Deposited Amount  " +depositAmount+"  Withdrawn Amount " +withdrawAmount);
		
	}		
	//instance method for deposit amount
	void deposit() {
		balance = depositAmount;
		
	}
	
	//instance method for withdraw
	void withdraw() {
		balance = balance - withdrawAmount;
	}
	
	//instance method to display balance
	double display() {
		return balance;	//returning balance amount
	}
}


public class Ques_3 {

	public static void main(String[] args) {
		
		double userBalance;
		//object creation
		Account obj = new Account();// no arguments constructor
		userBalance=obj.display();

				
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name , Account numeber and Amount to be Deposited");
		String name = input.nextLine();
		int accountNumber = input.nextInt();		
		double userAmount = input.nextDouble();//input 
		System.out.println("Enter the Amount to be withdrawn");
    	        double userWithdraw = input.nextDouble();//input	
    	        input.close();
    	
		Account obj1 = new Account(name ,accountNumber,userAmount,userWithdraw);//two arguments constructor creation
		
		obj1.deposit();//calling deposit
		obj1.withdraw();//calling withdraw 
		userBalance = obj1.display();
		System.out.println("Balance Amount is : " + userBalance);	

		
	}

}