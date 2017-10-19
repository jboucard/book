import javax.swing.JOptionPane;

public class PC_8
{
	public static void main(String []args)
	{
		String priceString;
		double priceDouble, stateTax, countyTax, totalTax, priceAddStateAddCounty;
		priceString = JOptionPane.showInputDialog("Enter purchase price");

		priceDouble = Double.parseDouble(priceString);

		stateTax = priceDouble * .04;

		countyTax = priceDouble * .02;

		totalTax = stateTax+countyTax;

		priceAddStateAddCounty = priceDouble+stateTax+countyTax;

		System.out.println("The inital price is: "+priceDouble+
							"\nThe state tax is: "+stateTax+
							"\nThe county tax is: "+countyTax+
							"\nThe total sales tax is: "+totalTax+
							"\nThe total bill of sale is: "+priceAddStateAddCounty);
	}
}