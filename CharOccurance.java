package week1.day2.assignments.mandatory;

public class CharOccurance {

	public static void main(String[] args) {
		String str="welcome to Chennai";
		int count=0;
		char[] c=str.toCharArray();
		//str.length();
		for (int i = 0; i < c.length; i++) {
			char d=str.charAt(i);
			if(d=='e')
			{
				count++;
				
			}
		}
		System.out.println("total occurance of e "+count +"");

	}

}
