import java.util.Scanner;
/**
 * 
 */

/**
*
* Name: Laturski, Garrett William
* Teacher: Mr.Hardman
* Assignment #3
* Date Last Modified: 
*
*/

public class lab6Part3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		boolean checkPrime;
		
		System.out.print("Please enter a number ");
		userNumber = userInput.nextInt();
		
		if(userNumber == 1){
			System.out.println("One isn't a prime");
		}else{
			
			checkPrime = isPrime(userNumber);
				
			if(checkPrime == true){
				System.out.println("this number is prime");
			}else{
				System.out.println("this number isn't prime");
			}
				
			
			
		}
		
		userInput.close();
		
	}

	public static boolean isPrime(int userNumber){
		
		boolean prime = true;
		
		for(int i = 2; prime && i < Math.sqrt(userNumber); i++){
			
			/**
			 * Check whether the remainder of userNumber divided by i equals 0.
			 * If so, prime = false;
			 *
			 */
			if(userNumber % i == 0){
				prime = false;
				
			}
			
		}
		
		return prime;
		
	}
		
}