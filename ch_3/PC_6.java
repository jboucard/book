import java.util.Scanner;

public class PC_6
{
	static Scanner key = new Scanner(System.in);	

	static int numbWidgets, numbHours, days;
	final static int hoursOpen = 8;
	final static int widgetsPerhour = 10;

	public static void howManyWidgets(int wid)
	{
		numbWidgets = wid;
	}
	public static void widgetsPerDay(int numbWidgets)
	{
		numbHours = numbWidgets / widgetsPerhour;
		
		if((numbWidgets % widgetsPerhour)!=0)
		{
			numbHours = numbHours+1;
		}
		System.out.println(numbHours+" hours");
	}
	public static void daysToMakeWid(int hours2)
	{
		days = hours2 / hoursOpen;
		if((hours2%hoursOpen)!=0)
		{
			days+=1;
		}
		System.out.println(days+" days");
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the number of widgets");
		int widgetsEntered = key.nextInt();
		key.nextLine();

		howManyWidgets(widgetsEntered);

		widgetsPerDay(numbWidgets);

		daysToMakeWid(numbHours);
	}
}