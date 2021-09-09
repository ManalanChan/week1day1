package Week1Day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-55;
		if(i<0) {
			System.out.println(i +"is negative number");
			int a=i*(-1);
			System.out.println(a);
		}
		else if(i>0)
			System.out.println(i +"is Positive number");
		else
			System.out.println(i+ "is neither positive nor negative");
		
	}

}
