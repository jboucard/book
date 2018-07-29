import java.util.Scanner;

public class PC_6{
	int weight, distance, base, rem;
	double price, shipRate, distRate;

	public PC_6 getShipment(PC_6 obj){
		Scanner key = new Scanner(System.in);

		System.out.print("Enter the weight: ");
		obj.weight = key.nextInt();

		System.out.print("Enter the distance: ");
		obj.distance = key.nextInt();

		return obj;
	}

	public PC_6 calculateShipment(PC_6 obj){
		if(obj.weight>10)
			obj.shipRate = 4.8;
		else if(obj.weight>6)
			obj.shipRate = 3.7;
		else if(obj.weight>2)
			obj.shipRate = 2.2;
		else 
			obj.shipRate = 1.1;

		obj.base=obj.distance/500;
		obj.rem=obj.distance%500;

		if(obj.rem > 0)
			obj.base++;

		obj.price = obj.shipRate*obj.base;
		System.out.println("base: "+obj.base+" rem: "+obj.rem);

		return obj;
	}

	public void printLabel(PC_6 obj){
		System.out.println("A package that weighs "+obj.weight+" and is being sent "+obj.distance+" miles.\n"+
						   "Will be shipped for $"+String.format("%.2f", obj.price));
	}

	public static void main(String[] args){
		PC_6 shipment = new PC_6();
		shipment.printLabel(shipment.calculateShipment(shipment.getShipment(shipment)));
	}
}