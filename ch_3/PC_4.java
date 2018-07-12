public class PC_4
{
	String description;
	int unitsOnHand;
	double price;

	public PC_4()
	{
		description = "none";
		unitsOnHand = 0;
		price = 0.0;
	}

	public void setDescription(String desc)
	{
		description = desc;
	}
	public void setUnitsOnHand(int units)
	{
		unitsOnHand = units;
	}
	public void setPrice(double price2)
	{
		price = price2;
	}

	public String getDescription()
	{
		return description;
	}
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	public double getPrce()
	{
		return price;
	}

	public String toString()
	{
		String message = "Item: "+getDescription()+", Units: "+getUnitsOnHand()+
						 ", Price: $"+getPrce();
		System.out.println(message);

		return message;
	}
}