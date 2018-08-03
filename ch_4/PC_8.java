import java.util.Scanner;

public class PC_8{

	String name;
	int time;
	int numb;

	Scanner key = new Scanner(System.in);

	public PC_8(int o){

	}

	public PC_8(){
		System.out.print("Enter the runners name: ");
		name = key.nextLine();

		System.out.print("Enter the runners time: ");
		time = key.nextInt();
	}

	public int numbRun(){
		System.out.print("How many runners: ");
		numb = key.nextInt();

		return numb;
	}

	public static void results(PC_8[] obj){
		int i = 0;

		while(i<obj.length){
			System.out.print("Runners name: "+obj[i].name+" time: "+obj[i].time+"\n");
			i++;
		}
	}

	/*public static PC_8[] sort(PC_8[] arr){
		int tempVal=0;
		int i = 0;
		boolean stop = false;
		System.out.println("length is: "+arr.length);
		while(i < arr.length){
			System.out.println("i is: "+i);
			if(!(stop)&&(i==arr.length-1)){
				stop = true;
			
			if((arr[i].time>arr[i+1].time)){

			}else{
				tempVal = arr[i].time;
				arr[i].time = arr[i+1].time;
				arr[i+1].time = tempVal;
			}
		}
			i++;
		}
		return arr;
	}*/

	public static void main(String[] args){
		PC_8 temp = new PC_8(0);
		temp.numb = temp.numbRun();
		//int j = temp.numb;

		PC_8[] runnersArray = new PC_8[temp.numb];

		while(temp.numb != 0){
			PC_8 run = new PC_8();
			runnersArray[temp.numb-1] = run;
			temp.numb--;
		}
		results(/*sort*/(runnersArray));
	}
	
}