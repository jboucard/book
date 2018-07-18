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
	public void print(PC_8 obj)
	{
		System.out.println("Area: "+obj.getArea()+"\nDiameter: "+
									obj.getDiameter()+"\nCircumference: "+
									obj.getCircumference());
	}

	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		double rad1;
		String cont;

		do{
			System.out.print("Enter the radius: ");
			rad1 = key.nextDouble();
			key.nextLine();

			PC_8 circle = new PC_8(rad1);
			circle.print(circle);

			System.out.print("Continue? y/n: ");
			cont = key.nextLine();
		}while(cont.equals("y"));
	}
}