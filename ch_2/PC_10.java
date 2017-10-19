import javax.swing.JOptionPane;

public class PC_10
{
	public static void main(String []args)
	{
		String scoreOneString, scoreTwoString, scoreThreeString;
		double average, scoreOneDouble, scoreTwoDouble, scoreThreeDouble, priceAddStateAddCounty;
		scoreOneString = JOptionPane.showInputDialog("Enter the first test score");
		scoreTwoString = JOptionPane.showInputDialog("Enter the second test score");
		scoreThreeString = JOptionPane.showInputDialog("Enter the third test score");


		scoreOneDouble = Double.parseDouble(scoreOneString);
		scoreTwoDouble = Double.parseDouble(scoreTwoString);
		scoreThreeDouble = Double.parseDouble(scoreThreeString);

		average = (scoreOneDouble+scoreTwoDouble+scoreThreeDouble)/3;

		System.out.println("The first test score is: "+scoreOneDouble+
							"\nThe second test score is: "+scoreTwoDouble+
							"\nThe third test score is: "+scoreThreeDouble+
							"\nThe average score is: "+average);
	}
}