package week1.day3;


public class FactorialNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 int fact =1;
		for(int i=5;i>=1;i--) {
			System.out.println(i);
			fact=fact*i;
		}
		System.out.println("Factorial :"+fact); 
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number : ");
		scanner.close();
		int number = scanner.nextInt();
		int fact =1;
		for( int i=number;i>=1;i--) {
			System.out.println(i);
			fact=fact*i;
		}
	 System.out.println("Factorial Of  : "+fact); */

		

	}

}
