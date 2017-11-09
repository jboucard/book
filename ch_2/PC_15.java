import javax.swing.JOptionPane;
import java.lang.*;

public class PC_15
{
	public static void main(String []args)
	{
		String drinkersString, multipleDrinksString, citrusDrinkString;
		int drinkersInt, multipleDrinksInt, citrusDrinkInt;
		double multipleDrinksDouble, citrusDrinksDouble;

		drinkersString = JOptionPane.showInputDialog("Enter the numbers of people who drink energry drink");
		drinkersInt = Integer.parseInt(drinkersString);
		multipleDrinksString = JOptionPane.showInputDialog("Enter the percent who drink more than one per day");
		multipleDrinksInt = Integer.parseInt(multipleDrinksString);
		citrusDrinkString = JOptionPane.showInputDialog("Enter the percent who drink more than one per day");
		citrusDrinkInt = Integer.parseInt(citrusDrinkString);
		
		multipleDrinksDouble = drinkersInt * (multipleDrinksInt*(.01));
		citrusDrinksDouble = drinkersInt * (citrusDrinkInt*(.01));

		int multiple = (int) Math.round(multipleDrinksDouble);
		int citrus = (int) Math.round(citrusDrinksDouble);

		System.out.println("The approximate number of customers who drink multiple drinks are: "+multiple);
		System.out.println("The approximate number of customers who prefer citrus drinks are: "+citrus);
		
	}
}
