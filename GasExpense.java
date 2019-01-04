import java.util.Scanner;

public class GasExpense
{
   public static void main(String [] args)
   {
   System.out.print("How many miles do you drive per week? ");
   double num1;
   Scanner keyboard = new Scanner (System.in);
   num1 = keyboard.nextInt();
   System.out.print("How many miles per gallon does your auto get? ");
   int num2;
   num2 = keyboard.nextInt();
   System.out.print("What is current cost of gas? ");
   double num3;
   num3 = keyboard.nextInt();
   double year = num1 * 52;
   System.out.println("At "+ num1 + " miles per week, you will travel " + year + " miles per year");  
   double week = num1 * num3;
   System.out.println("Gallons per week: " + week + " gallons");
   double cost = week * 52;
   System.out.println("Gallons per year: " + cost + " gallons");
   System.out.println("With gas at " + num3 + " per gallon, you will spend: ");
   double gas = week * 3.8;
   System.out.println("You will spend $" +gas + " per week");
   double miles = gas * 52;
   System.out.println("You will spend $" + miles + " per year");
   double plus = num3 + 1;
   System.out.println("If gas goes up by one dollar per gallon to " + plus + " per gallon, you will spend: ");
   double up = week * 4.8;
   System.out.println("You will spend $" +up  + " per week"); 
   double annual = up * 52;
   System.out.println("You will spend $" +annual + " per year");
   
   
   
   }
   
}