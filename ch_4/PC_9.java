import java.util.Scanner;

public class PC_9{
	int numb;
	public int[] rotate1(int[] arr, int p){
		numb = arr.length;
		int[] arr2 = new int[numb];
		int i=0, j=0;

		while(i<arr.length){
			if(i+p<arr.length){
				arr2[i] = arr[i+p];
			}else{
				arr2[i] = arr[j++];
			}
			i++;
		}
		return arr2;
	}

	public int[] rotate2(int[] arr, int p){
		numb = arr.length;
		int i=0, j=0, temp=0;

		while(i<p){
			j=0;
			while(j<arr.length){
				if(j==0){
					temp = arr[j];
				}
				if(j+1<arr.length){
					arr[j]=arr[j+1];
				}else{
					arr[j]=temp;
				}
				j++;
			}
			i++;
		}
		return arr;
	}

	public void printing(int[] array){
		int i=0;
		while(i<array.length){
			System.out.println(array[i]);
			i++;
		}
	}

	public static void main(String[] args){

		int[] arr = {1,2,3,4,5};

		PC_9 turn = new PC_9();
		turn.printing(turn.rotate2(arr, 2));
	}
}