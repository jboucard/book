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

	public static void println(twoVal val)
	{
		System.out.println("\nThe day is: "+val.days+"\nThe hour is: "+val.hours+"\nThe base is: "+ val.base+"\nThe remainder is: "+ val.remain);
	}

	public static void main(String[] args)
	{
		int seconds = getInput();

		twoVal ob1 = new twoVal(seconds);

		println(ob1);
	}
}



