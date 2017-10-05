public class PC_2
{
	public static void main(String[] args)
	{
		String firstName, middleName, lastName;
		char firstInitial, middleInitial, lastInitial;

		firstName = "Chase";
		middleName = "Adams";
		lastName = "Harrow";

		firstInitial = 'C';
		middleInitial = 'A';
		lastInitial = 'H';

		System.out.println("My initials are "+firstInitial+" "+middleInitial+" "+lastInitial);
		System.out.println(firstInitial+" stands for "+firstName);
		System.out.println(middleInitial+" stands for "+middleName);
		System.out.println(lastInitial+" stands for "+lastName);
	}
}