import java.util.Scanner;

public class PC_7
{
	int score1, score2, score3,sum;
	float avgScore;

	public PC_7()
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;	
	}
	public PC_7(int sc1,int sc2,int sc3)
	{
		score1 = sc1;
		score2 = sc2;
		score3 = sc3;
	}

	public void setScore1(int sc1)
	{
		score1 = sc1;
	}
	public void setScore2(int sc2)
	{
		score2 = sc2;
	}
	public void setScore3(int sc3)
	{
		score3 = sc3;
	}

	public int getScore1()
	{
		return score1;
	}
	public int getScore2()
	{
		return score2;
	}
	public int getScore3()
	{
		return score3;
	}

	public float getAvgScore(int sc1,int sc2,int sc3)
	{
		sum = sc1+sc2+sc3;
		avgScore = sum/3;
		return avgScore;
	}

	public static void main(String[] args)
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

		PC_7 grade = new PC_7(score1, score2,score3);
		float val;
		val = grade.getAvgScore(grade.getScore1(), grade.getScore2(), grade.getScore3());
		System.out.println("Average score is: "+val);
	}

}