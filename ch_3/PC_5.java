public class PC_5
{
	String name;
	int idNumb, hoursWorked;
	float payRate;

	public PC_5(String name2, int idnumb2)
	{
		name = name2;
		idNumb = idnumb2;
	}
	public PC_5(String name2, int idnumb2, int hoursWorked2, float payRate2)
	{
		name = name2;
		idNumb = idnumb2;
		hoursWorked = hoursWorked2;
		payRate = payRate2;
	}

	public void setName(String name2)
	{
		name = name2;
	}
	public void setIdNumb(int idnumb2)
	{
		idNumb = idnumb2;
	}
	public void sethoursWorked(int hoursWorked2)
	{
		hoursWorked = hoursWorked2;
	}
	public void setPayRate(float payRate2)
	{
		payRate = payRate2;
	}

	public String getName()
	{
		return name;
	}
	public int getIdNumb()
	{
		return idNumb;
	}
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	public float getPayRate()
	{
		return payRate;
	}

	public double getPay(int hoursWorked2, float payRate2)
	{
		double pay = hoursWorked2*payRate2;
		return pay;
	}

	public String toString()
	{
		String message = ("Name: "+getName()+
						   ", ID #: "+getIdNumb()+
						   ", Hours Worked: "+getHoursWorked()+
						   ", payRate: "+getPayRate()+
						   ", pay: $"+getPay(getHoursWorked(), getPayRate()));
		System.out.println(message);

		return message;

	}
	
}