
// Application: Homework 
// Name: Katya Atete
// GitHub User: atetekatya
// Date: Sep 22, 2022
// Version: 1.0
// Description: Create scanner and use While loop to do the task


import java.util.*;
public class homework_3 {

	public static void main(String[] args) {
		
		//Initialize Scanner and variables
		
		Scanner user = new Scanner(System.in);
		
		String name;
		int num;
		
		// Ask the user to enter their name and numbers between 0 and 100
		
		System.out.println("Enter User Names");
		name = user.next();
		
		System.out.println("Enter a number");
		num = user.nextInt();
		
		do
			System.out.println("Enter another number");
			
		
		while (num<100 && num>0);
		
			System.out.println("Thank you for your input " +name);
		
		
		
	}

}
