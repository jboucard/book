//import PC_4;

public class PC_4_b
{
	public static void main(String[] args)
	{
		PC_4 item1 = new PC_4();
		PC_4 item2 = new PC_4();
		PC_4 item3 = new PC_4();

		item1.setDescription("A really big book");
		item1.setUnitsOnHand(4);
		item1.setPrice(14.23);

		item3.setDescription("A magical marker");
		item3.setUnitsOnHand(8);
		item3.setPrice(7.63);

		item1.toString();
		item2.toString();
		item3.toString();
	}
}