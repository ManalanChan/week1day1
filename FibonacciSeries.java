package Week1Day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F1=0,F2=1,r=8,sum;
		System.out.println(F1+ "\n"+F2);
		for (int i =1; i <=r-2; i++) {
			sum=F1+F2;
			System.out.println(sum);
			F1=F2;
			F2=sum;
			
		}

	}

}
