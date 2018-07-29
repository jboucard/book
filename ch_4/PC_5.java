import java.util.Scanner;

public class PC_5{
	
	double balance, fees, checkFees, totalCheckFee;
	int months, monthFee, checks, lowBalanceFee;

	public PC_5(){
		Scanner key = new Scanner(System.in);

		System.out.print("Enter the starting balance: ");
		balance = key.nextDouble();
		System.out.print("Enter the number of months the account will be active: ");
		months = key.nextInt();
		System.out.print("Enter the number of checks writtten: ");
		checks = key.nextInt();
	}	

	public PC_5 calculate(PC_5 obj){
		obj.monthFee = obj.months*10;

		if(obj.checks>59)
			obj.checkFees = .04;
		else if(obj.checks>39)
			obj.checkFees = .06;
		else if(obj.checks>19)
			obj.checkFees = .08;
		else
			obj.checkFees = .1;

		obj.totalCheckFee = obj.checks*obj.checkFees;

		if(obj.balance < 400)
			obj.lowBalanceFee = -15;

		obj.fees = obj.monthFee + obj.totalCheckFee + obj.lowBalanceFee;
		obj.balance = obj.balance - obj.fees;

		return obj;
	}

	public void printAcc(PC_5 obj){
		System.out.println("\nThe total month fees are: "+obj.monthFee+
						   "\nThe toal check fees are: "+String.format("%.2f", obj.totalCheckFee)+
						   "\nThe final balance is: $"+String.format("%.2f", obj.balance));
	}
	public String getMonths(PC_5 obj){
		if(obj.months>1)
			return " months";
		else
			return " month";
	}

	public static void main(String[] args){
		PC_5 acc = new PC_5();
		acc.calculate(acc);
		acc.printAcc(acc);
	}
}