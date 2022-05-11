package assignments;

import java.util.Scanner;

public class SomeOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number : ");
		Scanner scanner = new Scanner(System.in);
		int input =scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		while(input>0) {
			int rem = input % 10;
			sum=sum+rem;
			input =input/10;
			//System.out.println(rem);
					
		}
		System.out.println("The sum of 3 digits is : "+sum);

	}

}
