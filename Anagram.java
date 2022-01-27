package week1.day2.assignments.mandatory;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args)
	{
		String text1="stops";
		String text2="potss";
		int i=text1.length();
		int j=text2.length();
		
		if(i==j)
		{
			  char[] charArray1 = text1.toCharArray();
		      char[] charArray2 = text2.toCharArray();

		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);
		      
		      boolean result = Arrays.equals(charArray1, charArray2);

		      if(result==true) 
		      {
		        System.out.println("Anagram.");
		      }
		      else {
		        System.out.println(" are not Anagram.");
		      }
		}
		else 
		{
		      System.out.println(text1 + " and " + text2 + " are not anagram.");
		}
	}
}
