import javax.swing.JOptionPane;
import java.lang.*;

public class PC_17
{
	public static void main(String []args)
	{
		String numberOfStocksBoughtString, buyingPricePerStockString, commisionPercentString;
		String numberOfStocksSoldString, sellingPricePerStockString;
		int numberOfStocksBoughtInt, numberOfStocksSoldInt;
		double buyingPricePerStockDouble, sellingPricePerStockDouble, commisionPercentDouble;
		double totalBuy, totalSell, commissionBuy, commissionSell;

		numberOfStocksBoughtString = JOptionPane.showInputDialog("Enter the numbers of stocks bought");
		numberOfStocksBoughtInt = Integer.parseInt(numberOfStocksBoughtString);
		numberOfStocksSoldString = JOptionPane.showInputDialog("Enter the numbers of stocks sold");
		numberOfStocksSoldInt = Integer.parseInt(numberOfStocksSoldString);
		buyingPricePerStockString = JOptionPane.showInputDialog("Enter the price each stock was bought at");
		buyingPricePerStockDouble = Double.parseDouble(buyingPricePerStockString);
		sellingPricePerStockString = JOptionPane.showInputDialog("Enter the price each stock was sold at");
		sellingPricePerStockDouble = Double.parseDouble(sellingPricePerStockString);
		commisionPercentString = JOptionPane.showInputDialog("Enter the percent of commsion paid to broker");
		commisionPercentDouble = Double.parseDouble(commisionPercentString);

		totalBuy = numberOfStocksBoughtInt*buyingPricePerStockDouble;
		commissionBuy = ((.01)*commisionPercentDouble)*totalBuy;
		totalSell = numberOfStocksSoldInt*sellingPricePerStockDouble;
		commissionSell = ((.01)*commisionPercentDouble)*totalSell;

		System.out.println("The stocks were bought at $"+totalBuy+" and the broker was paid $"+commissionBuy);
		System.out.println("The stocks were sold at $"+totalSell+" and the broker was paid $"+commissionSell);
		
	}
}
