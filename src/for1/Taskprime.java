package for1;

public class Taskprime {
	public static void main(String args[])
	{
		int N=7;
		boolean a=true;
		for(int i=2;i<N;i++) {
			if(N%i==0) {
				a=false;
			}
		}
		if (a==true) {
				System.out.println("PRIME NUMBER");
		}
		else{
			System.out.println("NOT PRIME NUMBER");
		}
	}

}
