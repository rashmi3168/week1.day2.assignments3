package week1.day2.assignments.mandatory;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class of Automation $$";
		int letter=0,space=0,num=0,specialChar=0;
		char[] s=test.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if(Character.isLetter(s[i])){
				letter++;
			}
			else if(Character.isDigit(s[i])) {
				num++;
			}
			else if(Character.isSpaceChar(s[i]))
			{
				space++;			
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("Letter count="+letter);
		System.out.println("Digit Count="+num);
		System.out.println("Space count="+space);
		System.out.println("Special Character Count="+specialChar);
	}

}
