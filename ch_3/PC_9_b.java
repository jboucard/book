import java.util.Scanner;

public class PC_9_b
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		PC_9 pet = new PC_9();
		System.out.print("Enter a pet name: ");
		String name1 = key.nextLine();
		pet.setName(name1);
		System.out.print("Enter a pet Type: ");
		String type1 = key.nextLine();
		pet.setType(type1);
		System.out.print("Enter a pet age: ");
		int age1 = key.nextInt();
		key.nextLine();
		pet.setAge(age1);

		System.out.println("My pet "+pet.getName()+" which is a "+pet.getType()+" is "+pet.getAge()+" years old.");
	}
}