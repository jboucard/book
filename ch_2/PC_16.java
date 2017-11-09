import javax.swing.JOptionPane;
import java.lang.*;

public class PC_16
{
	public static void main(String []args)
	{
		String name, age, city, college, job, animal, petName;
		int drinkersInt, multipleDrinksInt, citrusDrinkInt;
		double multipleDrinksDouble, citrusDrinksDouble;

		name = JOptionPane.showInputDialog("Enter the a name");
		age = JOptionPane.showInputDialog("Enter an age");
		city = JOptionPane.showInputDialog("Enter a city");
		college = JOptionPane.showInputDialog("Enter a college");
		job = JOptionPane.showInputDialog("Enter a job");
		animal = JOptionPane.showInputDialog("Enter an animal");
		petName = JOptionPane.showInputDialog("Enter a pet name");

		System.out.println("There once was a person named "+name+" who lived in "+city+". At the age of "+age
							+"\n, "+name+" went to college at "+college+". "+name+" graduated and went to work as a\n "
							+job+". Then, "+name+" adopted a(n) "+animal+" named "+petName+". They both lived\n"
							+"happily ever after!");
		
		
	}
}
