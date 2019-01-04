
// this is to decide if a number is even or odd

import java.util.Scanner;
public class EvenOddNum
{
   public static void main(String [] args)
   {
      Scanner digit = new Scanner(System.in);
      System.out.printf("Enter a number: ");
      int number = digit.nextInt();
         if (number %2 == 0)
            System.out.printf(number + " is a even number ");
         else 
            System.out.printf(number + " is a odd number ");
    }
} 
