
// Application: Homework3
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
				
				//Check if the number is between 0 and 100
				
				while (!(num>0 && num<100))
				{
					System.out.println("Please re-enter the number " +name);
					num= user.nextInt();
		
				
					if (num>0 && num<100)
						System.out.println("Thank you for your input " +name);

					
					 
				}
				
				System.out.println("Thank you for your input " +name);
				
				// Count down the numbers from user input

				
				for (int i=num;i>=0;i--)
				{
					System.out.println(+i);
					System.out.println("Your doing it " +name);
				}
				
				
			}
		
		}
