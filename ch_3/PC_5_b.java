import java.util.Scanner;

public class PC_5_b
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Enter the number of employees");
		int employeesEntered = key.nextInt();
		key.nextLine();
		int i = 0;

		PC_5[] empArray = new PC_5[employeesEntered];
		
		while(i< employeesEntered)
		{
			System.out.println("Enter a name");
			String nameEntered = key.nextLine();

			System.out.println("Enter an idNumber");
			int idNumberEntered = key.nextInt();

			key.nextLine();

			System.out.println("Enter hours worked");
			int hoursWorkedEntered = key.nextInt();

			System.out.println("Enter payRate");
			float payRateEntered = key.nextFloat();
			key.nextLine();	

			PC_5 employee = new PC_5(nameEntered, idNumberEntered, hoursWorkedEntered, payRateEntered);

			empArray[i] = employee;

			i++;
		}

		int j = 0;
		while(j<employeesEntered)
		{
			empArray[j].toString();
			j++;
		}
	}
}