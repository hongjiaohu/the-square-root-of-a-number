import java.util.Scanner;

/**
 * 
 */

/**
 * @author h.hu
 *
 */
public class A4L2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**

		 *

		 * Name: Hongjiao Hu

		 * Teacher: Mr. Hardman 

		 * Assignment 4, Program 2

		 * Date Last Modified: 2016/11/17

		 *

		 */
		
		Scanner userInput = new Scanner(System.in);
		int number;
	
		System.out.print("Hey,do you want play a game?"+"\n"+"Please enter a number to start:");
		number=userInput.nextInt();
		
		if (number>=0){
			System.out.println("The result is:"+Math.sqrt(number));
		}
		while (number<=0){
			System.out.println("an error message!"+"\n"+"I can’t take the square root of the number.");
			System.out.print("Please enter a number again:");
			number=userInput.nextInt();
			
			if (number>=0){
				System.out.println("The result is:"+Math.sqrt(number));
			}
		}
		
		
		
		userInput.close();
		
	}

}