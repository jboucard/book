import java.util.Scanner;

public class PC_3{
	
	int score1, score2, score3,sum;
	float avgScore;

	public PC_3()
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;	
	}
	public PC_3(PC_3 obj)
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;	
	}
	public PC_3(int sc1,int sc2,int sc3)
	{
		score1 = sc1;
		score2 = sc2;
		score3 = sc3;
	}

	public PC_3 getGrades()
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Enter the first score");
		int score1 = key.nextInt();
		key.nextLine();

		System.out.println("Enter the second score");
		int score2 = key.nextInt();
		key.nextLine();

		System.out.println("Enter the third score");
		int score3 = key.nextInt();
		key.nextLine();

		PC_3 book = new PC_3(score1, score2, score3);

		return book;
	}

	public char getGrade(int score)
	{
		if(score>90)
			return 'A';
		else if(score>80)
			return 'B';
		else if(score>70)
			return 'C';
		else if(score>60)
			return 'D';
		else 
			return 'F';
	}

	public void printGrades(PC_3 obj){
		System.out.println("Grade 1: "+obj.score1+" Grade: "+obj.getGrade(obj.score1)+
						   "\nGrade 2: "+obj.score2+" Grade: "+obj.getGrade(obj.score2)+
						   "\nGrade 1: "+obj.score3+" Grade: "+obj.getGrade(obj.score3));
	}

	public static void main(String[] args) {
		PC_3 temp = new PC_3();
		temp = temp.getGrades();
		temp.printGrades(temp);
	}
	
}