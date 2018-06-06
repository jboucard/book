import java.util.Scanner;

public class PC_1
{
	String name;
	int idNumber;
	String department;
	String position;

	public void setName(String name1)
	{
		name = name1;
	}

	public void setIdNumber(int idNumber1)
	{
		idNumber = idNumber1;
	}

	public void setDepartment(String department1)
	{
		department = department1;
	}

	public void setPosition(String position1)
	{
		position = position1;
	}

	public String getName()
	{
		return name;
	}

	public int getIdNumber()
	{
		return idNumber;
	}
	
	public String getDepartment()
	{
		return department;
	}

	public String getPosition()
	{
		return position;
	}

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Enter the number of employees");
		int employeesEntered = key.nextInt();
		int i = 0;
		while(i<employeesEntered)
		{
			System.out.println("Enter a name");
			String nameEntered = key.nextLine();

			key.nextLine();

			System.out.println("Enter an idNumber");
			int idNumberEntered = key.nextInt();

			key.nextLine();

			System.out.println("Enter a department");
			String departmentEntered = key.nextLine();

			//key.nextLine();

			System.out.println("Enter a position");
			String positionEntered = key.nextLine();

			//key.nextLine();

			PC_1 employee = new PC_1();

			employee.setName(nameEntered);
			employee.setIdNumber(idNumberEntered);
			employee.setDepartment(departmentEntered);
			employee.setPosition(positionEntered);

			System.out.println("Name: "+employee.getName()+", ID: "+employee.getIdNumber()+
				", Department: "+employee.getDepartment()+", Position: "+employee.getPosition()+"\n");

			i++;
		}
	}
}