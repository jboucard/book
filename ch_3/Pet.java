import java.util.Scanner;

public class Pet
{

	String name, animal;
	int age;

	public void setName(String name2)
	{
		name = name2;
	}

	public void setAnimal(String animal2)
	{
		animal = animal2;
	}

	public void setAge(int age2)
	{
		age = age2;
	}

	public String getName()
	{
		return name;
	}

	public String getAnimal()
	{
		return animal;
	}

	public int getAge()
	{
		return age;
	}

	public static void main(String[] args)
	{
		System.out.println("test");

		Scanner key = new Scanner(System.in);

		System.out.println("Enter a name");
		String nameEntered = key.nextLine();

		System.out.println("Enter an animal");
		String animalEntered = key.nextLine();

		System.out.println("Enter an age");
		int ageEntered = key.nextInt();

		Pet pets = new Pet();

		pets.setName(nameEntered);
		pets.setAnimal(animalEntered);
		pets.setAge(ageEntered);

		System.out.println("The animal "+pets.getAnimal()+" is named "+pets.getName()+" and is "+pets.getAge()+" years old");

	}


}