package assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =100;
		int originalNumber=input;
		int sum=0;
		while(input>0) {
			int rem=input%10;
			sum=sum +(rem*rem*rem);
			input =input/10; 
			//System.out.println(rem);
		}
		if(sum==originalNumber) {
			System.out.println(originalNumber +"  is Armstrong Number");
		}
		else {
			System.out.println(originalNumber+ "  is Not Armstrong Number");
		}
	//

	}

}
