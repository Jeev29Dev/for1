package for1;

public class Taskpalin {
public static void main(String args[])
{
	String a="mom";
String b="";
for(int i=a.length()-1;i>=0;i--) {
	b=b+a.charAt(i);
}
if(a.equals(b)) {
	System.out.println("palindrome");
}
else {
	System.out.println("not polindrome");
}
}
}
