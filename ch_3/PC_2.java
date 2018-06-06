public class PC_2
{
	int yearModel;
	String make;
	int speed;

	public PC_2(int yearModel1, String make1)
	{
		yearModel = yearModel1;
		make = make1;
		speed = 0;
	}

	public void setYearModel(int yearModel1)
	{
		yearModel = yearModel1;
	}

	public void setMake(String make1)
	{
		make = make1;
	}

	public void setSpeed(int speed1)
	{
		speed = speed1;
	}

	public int getYearModel()
	{
		return yearModel;
	}

	public String getMake()
	{
		return make;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void accelerate()
	{
		System.out.println("Accelerating");
		speed = speed + 5;
		System.out.println("The speed is "+getSpeed());
	}

	public void brake()
	{
		System.out.println("Decelerating");
		speed = speed - 5;
		System.out.println("The speed is "+getSpeed());
	}

	public static void main(String[] args)
	{
		PC_2 car = new PC_2(2002, "Honda");
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.brake();
		car.accelerate();
	}
}