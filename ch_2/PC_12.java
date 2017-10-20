import javax.swing.JOptionPane;

public class PC_12
{
	public static void main(String []args)
	{
		String city, cityUpperCase, citylowerCase, cityfirstChar;
		int cityNumb;
		double priceDouble, profitFactor, profitPrice, scoreOneDouble, scoreTwoDouble, scoreThreeDouble, priceAddStateAddCounty;
		city = JOptionPane.showInputDialog("Enter your favorite city");

		System.out.println("The city "+city+"has "+city.length()+" characters in it");
		System.out.println("The city using all upper case character is "+city.toUpperCase());
		System.out.println("The city using all lower case character is "+city.toLowerCase());
		System.out.println("The first character of the city is "+(city.charAt(0)));
		
	}
}
