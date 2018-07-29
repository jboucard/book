import java.util.Scanner;

public class PC_4{

	int sold;
	float percent, price;
	
	public PC_4(){
	}
	public PC_4(int quant){
		sold =  quant;
	}

	public PC_4 getQuant(PC_4 obj){
		Scanner key = new Scanner(System.in);

		System.out.print("Enter the quantity sold: ");
		obj.sold = key.nextInt();

		return obj;
	}

	public PC_4 discount(PC_4 obj){
		if(obj.sold>99)
			obj.percent = .5f;
		else if(obj.sold>49)
			obj.percent = .4f;
		else if(obj.sold>19)
			obj.percent = .3f;
		else if(obj.sold>9)
			obj.percent = .2f;
		else
			obj.percent = 1;

		System.out.println("The discount will be: "+obj.percent);
		return obj;
	}

	public void cost(PC_4 obj){
		price = obj.sold* obj.percent*99;
		System.out.println("The total cost is: $"+String.format("%.2f", price));
	}

	public static void main(String[] args){
		PC_4 sale1 = new PC_4();

		sale1.cost(sale1.discount(sale1.getQuant(sale1)));
	}
}