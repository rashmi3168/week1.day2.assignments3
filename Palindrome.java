package week1.day2.assignments.mandatory;

public class Palindrome {
public static void main(String[] args)
{
	String txt="madam";
	String rev="";
	for(int i=txt.length()-1;i>=0;i--)
	{
		rev = rev + txt.charAt(i);
		 
	      
	}
	if (txt.equals(rev))
        System.out.println(txt+" is a palindrome");
     else
        System.out.println(txt+" is not a palindrome");
}
}
