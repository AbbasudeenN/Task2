package guvitask4;

import java.util.Scanner;

public class Ques_3 {
	   
       public static void main(String[] args) {
		
		 try {
			Scanner userInput = new Scanner(System.in);
			
			String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			
			System.out.println("Enter the value star from 0 to Print the days ");
			int indexValue = userInput.nextInt();
			System.out.println("Day at index "+ indexValue+" is " +days[indexValue]);

			userInput.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurred");
			throw new ArrayIndexOutOfBoundsException("The entered value is not in range enter values between 0-6");
		}
	}

}



