package week1.day2.assignments.mandatory;


public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		
		String[] txt = test.split(" ");
		for (int i = 0; i < txt.length; i++) {
			if(i%2!=0)
			{
				String str = txt[i];
				//reverse even index word
				for(int j=str.length()-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
				
			}
			else
			{
				//System.out.print(" ");
				System.out.print(txt[i]);
				System.out.print(" ");
			}
		}

	}

}
