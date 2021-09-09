package Week1Day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,a=1,t;
		for (int i = 1; i <= n; i++) {
			t=i*a;
			a=t;
		}
		System.out.println(a);

	}

}
