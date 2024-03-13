package guvitask4;

import java.util.Scanner;
import java.util.Stack;

public class Ques_5 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Stack<Integer> stackObj = new Stack<Integer>();
		
		System.out.println("enter any 6 integer values");
		for (int i =0 ;i<6;i++) {
		    stackObj.push(userInput.nextInt());
	     }
		
		//all elements
		System.out.println("All Elements " +stackObj);
		
		System.out.println();
		//pop element
		System.out.println("Element Pop : " +stackObj.pop());
		
		System.out.println();
		//is empty check
		boolean emptyCheck = stackObj.isEmpty();
		System.out.println("Is Stack Empty ? " + emptyCheck);
		
		userInput.close();
	}

}
