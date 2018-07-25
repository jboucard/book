import java.util.Scanner;



public class PC_2{

	public static int getInput()
	{
		Scanner key = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		int numb = key.nextInt();
		key.nextLine();

		return numb;
	}

	/*public static twoVal getTime(int secs)
	{
		twoVal obj = new twoVal(secs);

		if(secs > 3600)
		{
			int hours = secs/3600;
		}
		if(secs > 60)
		{
			//int min = secs/60;
			//secs = secs%60;
			obj.base = secs/60;
			obj.remain = secs%60;
		}

		return obj;
	}*/

	public static void println(twoVal val)
	{
		System.out.println("\nthe day is: "+val.days+"\nthe hour is: "+val.hours+"\nthe base is: "+ val.base+"\nThe remainder is: "+ val.remain);
	}

	public static void main(String[] args)
	{
		int seconds = getInput();

		twoVal ob1 = new twoVal(seconds);

		println(ob1);
	}
}



