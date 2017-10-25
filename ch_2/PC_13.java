import javax.swing.JOptionPane;

public class PC_13
{
	public static void main(String []args)
	{
		String priceString, cityUpperCase, citylowerCase, cityfirstChar;
		int cityNumb;
		double tax, tip, priceDouble;
		double pricePlusTax, pricePlusTaxPlusTip, scoreOneDouble, scoreTwoDouble, scoreThreeDouble, priceAddStateAddCounty;
		priceString = JOptionPane.showInputDialog("Enter the price of a meal");
		priceDouble = Double.parseDouble(priceString);
		tax = 6.75;
		tip = 15;

		pricePlusTax = (priceDouble*(tax*.01))+priceDouble;
		pricePlusTaxPlusTip = (pricePlusTax*(tip*.01))+pricePlusTax;

		System.out.println("The price with tax will be "+pricePlusTax);
		System.out.println("The price with tax and tip will be "+pricePlusTaxPlusTip);
		
	}
}
