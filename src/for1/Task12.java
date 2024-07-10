package for1;

public class Task12 {
public static void main(String args[])
{
	int a=0;
	int b=10;
	int c=0;
	for(int i=1;i<=5;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
