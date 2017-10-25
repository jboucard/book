import javax.swing.JOptionPane;

public class PC_14
{
	public static void main(String []args)
	{
		String priceString, shareString, citylowerCase, cityfirstChar;
		int cityNumb;
		double fee, tip, priceDouble, shareDouble;
		double priceOfShares, priceOfCommision, totalPrice, scoreTwoDouble, scoreThreeDouble, priceAddStateAddCounty;

		priceString = JOptionPane.showInputDialog("Enter the price of a share");
		priceDouble = Double.parseDouble(priceString);
		shareString = JOptionPane.showInputDialog("Enter the number of shares");
		shareDouble = Double.parseDouble(shareString);
		fee = 2;
		tip = 15;

		//System.out.println("price is: "+priceDouble+" Shares are: "+shareDouble);
		priceOfShares = priceDouble * shareDouble;

		priceOfCommision = (fee*.01)*priceOfShares;

		totalPrice = priceOfShares+priceOfCommision;

		System.out.println("The price of the shares will be "+priceOfShares);
		System.out.println("The price of the commision will be "+priceOfCommision);
		System.out.println("The total price will be "+totalPrice);
		
	}
}
