import java.util.Scanner;

public class PC_8
{
	final double pi = 3.14159;
	double radius;

	public PC_8(double rad)
	{
		radius = rad;
	}

	public void setRadius(double rad)
	{
		radius = rad;
	}
	public double getRadius()
	{
		return radius;
	}
	public String getArea()
	{
		double area = pi*radius*radius;
		return String.format("%.2f",(area));
	}
	public String getDiameter()
	{
		double diameter = radius*2;
		return String.format("%.2f",(diameter));
	}
	public String getCircumference()
	{
		double circumference = pi*radius*2;
		return String.format("%.2f",(circumference));
	}

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double rad1 = key.nextDouble();
		key.nextLine();

		PC_8 circle = new PC_8(rad1);

		System.out.println("Area: "+circle.getArea()+"\nDiameter: "+
									circle.getDiameter()+"\nCircumference: "+
									circle.getCircumference());


	}
}