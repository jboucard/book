import javax.swing.JOptionPane;

public class PC_10
{
	public static void main(String []args)
	{
		String scores, scoreString, scoreOneString, scoreTwoString, scoreThreeString;
		int scoresNumb;
		double average, add, scoreDouble, scoreOneDouble, scoreTwoDouble, scoreThreeDouble, priceAddStateAddCounty;
		scores = JOptionPane.showInputDialog("Enter the number of scores");
		scoresNumb = Integer.parseInt(scores);

		double[] scoresArray = new double[scoresNumb];

		add = 0;
		for(int i=0; i<scoresNumb; i++)
		{
			i+=1;
			scoreString = JOptionPane.showInputDialog("Enter test score "+i);
			scoreDouble = Double.parseDouble(scoreString);
			i-=1;
			scoresArray[i]=scoreDouble;
			add = add+scoreDouble;

		}
		/*scoreOneString = JOptionPane.showInputDialog("Enter the first test score");
		scoreTwoString = JOptionPane.showInputDialog("Enter the second test score");
		scoreThreeString = JOptionPane.showInputDialog("Enter the third test score");
		
		scoreOneDouble = Double.parseDouble(scoreOneString);
		scoreTwoDouble = Double.parseDouble(scoreTwoString);
		scoreThreeDouble = Double.parseDouble(scoreThreeString);
		*/

		average = add/scoresNumb;

		//average = (scoreOneDouble+scoreTwoDouble+scoreThreeDouble)/scoresNumb;



		/*System.out.println("The first test score is: "+scoreOneDouble+
							"\nThe second test score is: "+scoreTwoDouble+
							"\nThe third test score is: "+scoreThreeDouble+
							"\nThe average score is: "+average);
		*/

		for(int j=0; j<scoresNumb; j++)
		{
			System.out.println("Score "+(j+1)+" is: "+scoresArray[j]);

		}
		System.out.println("The average score is: "+average);
	}
}
