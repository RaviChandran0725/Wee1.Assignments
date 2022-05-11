package week1.day3;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number : ");
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		input.close();
		
		int count = 0;
		for(int i=1;i<=n;i++){
			if(n % i == 0){
				count++;
			}
		}
				
		if(count==2) {
			System.out.println(" prime number ");
			
		}
		else {
			System.out.println("not a prime number");
		}
	
			
		}

	
}




