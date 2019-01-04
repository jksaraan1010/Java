
import java.util.Scanner;
public class Multiplication 
{
   public static void main(String [] args)
   {
   System.out.print(" Give me a number: ");
   int num1;
   Scanner keyboard = new Scanner (System.in);
   num1 = keyboard.nextInt();
   System.out.print(" Give me another number: ");
   int num2;
   num2 = keyboard.nextInt();
   int product = num1 * num2;
   System.out.print(" Multiplying those numbers gives you: " + product);  
   }
}



     