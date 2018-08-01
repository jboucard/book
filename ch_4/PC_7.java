import java.util.Scanner;

public class PC_7{
	public int calories, fatGrams, caloriesFromFat;
	public float percentageFromFatBase, percentageFromFatRem, percentageFromFat, percentageFromFatPer;

	public PC_7 getFoodInfo(PC_7 obj){
		Scanner key = new Scanner(System.in);

		System.out.print("Enter the calories: ");
		obj.calories = key.nextInt();

		System.out.print("Enter the fatGrams: ");
		obj.fatGrams = key.nextInt();

		return obj;
	}

	public boolean verifyCal(PC_7 obj){
		if(obj.percentageFromFatPer>obj.calories){
			System.out.println("Error in calories, try again");
			return true;
		}
		else
			return false;
	}

	public PC_7 calculateVals(PC_7 obj){
		obj.caloriesFromFat = obj.fatGrams*9;
		obj.percentageFromFatBase = obj.caloriesFromFat/obj.calories;
		obj.percentageFromFatRem = .01f*(obj.caloriesFromFat%obj.calories);
		obj.percentageFromFat = obj.percentageFromFatBase+obj.percentageFromFatRem;
		obj.percentageFromFatPer = obj.percentageFromFat * 100;

		return obj;
	}

	public void analysis(PC_7 obj){
		if(obj.percentageFromFatPer<30)
			System.out.println("The food is low in fat.");
		else
			System.out.println("The food is not low in fat.");
	}

	public PC_7 printInfo(PC_7 obj){
		System.out.println("The calories From Fat are: "+obj.caloriesFromFat+
							"\nThe percentage From Fat is: "+String.format("%.2f", obj.percentageFromFatPer)+"%");
		return obj;
	}

	public static void main(String[] args){
		PC_7 food = new PC_7();
		food.printInfo(food.calculateVals(food.getFoodInfo(food)));
		while(food.verifyCal(food)){
			food.printInfo(food.calculateVals(food.getFoodInfo(food)));
		}
		food.analysis(food);
	}
	
}