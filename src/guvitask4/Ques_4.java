package guvitask4;

import java.util.HashMap;
import java.util.Scanner;

public class Ques_4{
	
	
	      Scanner userInput = new Scanner(System.in);
	      HashMap <String ,Integer> hashmap = new HashMap<String ,Integer>();
	
	//add method
	public void addStudent() {
		
		try {	
			
			System.out.println("Enter number of  Students ");
			int noofStudents = userInput.nextInt() ;
			for (int i =0 ;i<noofStudents;i++) {
				System.out.println("Enter the  student Details Name and grades " +(i+1));	
				hashmap.put(userInput.next(), userInput.nextInt());
			}		
		} catch (Exception e) {
			System.out.println("Exception Occurred at addStudent");
			e.printStackTrace();

		}	
	}
	
	//remove method
	public void removeStudent() {
		
		try {
			
			System.out.println();
			System.out.println("Enter the student  Name  to remove");
			String name = userInput.next();
			hashmap.remove(name);
			System.out.println(name + " - details have been removed successfully");
			
		} catch (Exception e) {
			System.out.println("Exception Occured at removeStudent");
			e.printStackTrace();
		}
	}
	
	//display method
	public void displayStudent() {
		
		System.out.println();
		System.out.println("All Student details");
		System.out.println(hashmap);
	}
	
	
	public static void main(String[] args) {
		
		       Ques_4 stdObject = new Ques_4();//object
		       
		       stdObject.addStudent();//add details to hashmap
		       
		       stdObject.removeStudent();//remove details from hashmap
		       
		       stdObject.displayStudent();//display details of hashmap

		
	}
}

