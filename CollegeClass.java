import java.util.*;

public class CollegeClass
{
	public static void main(String [] args)
	{		
		System.out.print(" How many years have you been in college? ");
		
		int num;
      Scanner keyboard = new Scanner (System.in);
      num = keyboard.nextInt(); 
		
		if (num == 1)
			 System.out.println( " You are a Freshman! ");
		else if (num == 2)
			System.out.println( " Your a Sophomore! ");
		else if (num == 3)
			System.out.println( " Your a Junior!");
		else if (num == 4)
			System.out.println( " Your a Senior!!!! ");
		else
			System.out.println(" INVALID ");
  	}
}
