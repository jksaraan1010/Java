import java.util.*;
public class CostOfBurger
{
   public static void main (String [] args)
   {
      System.out.println("How many burgers do you want?");
      Scanner scan = new Scanner (System.in);
      int num = scan.nextInt();
      double cost = num * 7;
      System.out.println("If you want " + num + " burgers, it will cost you $ " + cost);
   
   }
} 