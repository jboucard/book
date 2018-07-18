import java.util.Scanner;

public class PC_1
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number");
		int numb = key.nextInt();
		key.nextLine();

		while(numb<1 || numb>9)
		{
			System.out.println("Enter a number between 1 and 10");
			numb = key.nextInt();
			key.nextLine();			
		}

		if(numb == 1)
			System.out.println("I");
		else if(numb == 2)
			System.out.println("II");
		else if(numb == 3)
			System.out.println("III");
		else if(numb == 4)
			System.out.println("IV");
		else if(numb == 5)
			System.out.println("V");
		else if(numb == 6)
			System.out.println("VI");
		else if(numb == 7)
			System.out.println("VII");
		else if(numb == 8)
			System.out.println("VIII");
		else if(numb == 9)
			System.out.println("IX");
		else if(numb == 10)
			System.out.println("X");
	}
}