import javax.swing.JOptionPane;
public class Program3
{
   public static void main(String[] args)
   { 
   JOptionPane.showMessageDialog(null, "Calculate your tuition!", "Tuition at OCC", JOptionPane.INFORMATION_MESSAGE);
   String s = JOptionPane.showInputDialog(null, "Are you a: \n 1. College District Resident\n2. Non-Resident of College District\n3. Out of State or International Student\n\nEnter 1, 2 or 3 ");
   int status = Integer.parseInt(s);
      if (status == 1)
         JOptionPane.showInputDialog(null, "How many credit hours are you taking? ");
      else if (status == 2)
         JOptionPane.showInputDialog(null, "How many credit hours are you taking? ");
      else if (status == 3)
         JOptionPane.showInputDialog(null, "How many credit hours are you taking? ");
      else 
         JOptionPane.showMessageDialog(null, "Please enter a  1 , 2 OR 3!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
    String h = JOptionPane.showInputDialog(null, "How many credits are you taking? ");
    double hours = Double.parseDouble(h);
    double district = hours * 82.00;
    double nresident = hours * 152.00;
    double international = hours * 216.00;
      if (hours == hours)
         JOptionPane.showMessageDialog(null, "$" + h + " hours at $82.00 per hour, yields a tuition at " + district );
      else if (hours == hours)
          JOptionPane.showMessageDialog(null, "$" + h + " hours at $152.00 per hour, yields a tuition at " + nresident );
      else if (hours == hours)
          JOptionPane.showMessageDialog(null, "$" + h + " hours at $216.00 per hour, yields a tuition at " + international );
      else 
         JOptionPane.showMessageDialog(null, "You must enter a value of 1 or more", "Invalid Input", JOptionPane.ERROR_MESSAGE);
   }
   
   
}