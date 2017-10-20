import javax.swing.JOptionPane;

public class PC_11
{
	public static void main(String []args)
	{
		String priceString, scoreString, scoreOneString, scoreTwoString, scoreThreeString;
		int scoresNumb;
		double priceDouble, profitFactor, profitPrice, scoreOneDouble, scoreTwoDouble, scoreThreeDouble, priceAddStateAddCounty;
		priceString = JOptionPane.showInputDialog("Enter the preice of the circuit board");
		priceDouble = Double.parseDouble(priceString);

		//double[] scoresArray = new double[scoresNumb];
		profitFactor = .4;
		profitPrice = priceDouble*profitFactor;

		System.out.println("The price of the circuit board is: "+priceDouble);
		System.out.println("The amount of profit that the store makes is : "+profitPrice);
		
	}
}
