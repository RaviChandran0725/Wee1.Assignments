package week1.day3;

public class FibonnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-1,b=1,c;
		for(int i=1;i<=8;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}
