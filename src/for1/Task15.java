package for1;

public class Task15 {
public static void main(String args[])
{
	String a="vowels";
	int count=0;
	for (int i=0;i<a.length();i++) {
		if (a.charAt(i)!='a' && a.charAt(i)!='e' && a.charAt(i)!='i' && a.charAt(i)!='o' && a.charAt(i)!='u') {
			count=count+1;
		}
	}
	System.out.println(count);
}
}
