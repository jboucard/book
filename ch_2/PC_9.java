import javax.swing.JOptionPane;

public class PC_9
{
	public static void main(String []args)
	{
		String milesDrivenString, gallonsUsedString;
		double carsMPG, milesDrivenDouble, gallonsUsedDouble, totalTax, priceAddStateAddCounty;
		milesDrivenString = JOptionPane.showInputDialog("Enter number of miles driven");
		gallonsUsedString = JOptionPane.showInputDialog("Enter number of gallons used");


		milesDrivenDouble = Double.parseDouble(milesDrivenString);
		gallonsUsedDouble = Double.parseDouble(gallonsUsedString);

		carsMPG = milesDrivenDouble/gallonsUsedDouble;

		System.out.println("The miles driven are: "+milesDrivenDouble+
							"\nThe gallons used are: "+gallonsUsedDouble+
							"\nThe mpg is: "+carsMPG);
	}
}