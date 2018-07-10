public class PC_3
{
	String name;
	String address;
	int age;
	String phone;

	public PC_3(String name1, String address1, int age1, String phone1)
	{
		name = name1;
		address = address1;
		age = age1;
		phone = phone1;
	}

	public void setName(String name1)
	{
		name = name1;
	}

	public void setAddress(String address1)
	{
		address = address1;
	}

	public void setAge(int age1)
	{
		age = age1;
	}

	public void setPhone(String phone1)
	{
		phone = phone1;
	}

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public int getAge()
	{
		return age;
	}

	public String getPhone()
	{
		return phone;
	}

	public void printing(PC_3 personNew)
	{
		System.out.println("The frist person is "+personNew.getName()+"\n"+
							"He lives at "+personNew.getAddress()+"\n"+
							"His age is "+personNew.getAge()+"\n"+
							"His phone number is "+personNew.getPhone());
	}

	public static void main(String[] args) {
		
		PC_3 person1 = new PC_3("Phil", "1 Wilson Way", 12, "1234567890");
		PC_3 person2 = new PC_3("Bill", "2 Carter Court", 13, "1678567560");
		PC_3 person3 = new PC_3("Will", "3 Pat Path", 14, "1248567832");

		person1.printing(person1);
		person1.printing(person2);
		person1.printing(person3);

	}
}