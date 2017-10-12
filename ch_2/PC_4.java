public class PC_4
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=0;
		int k=7;
		int middle = -1;
		boolean up = true;
		boolean line = false;
		//while((i != 4)&&(j != 0))
		{

			

			

			while(i < k)
			{


				if((k%2)==1)
				{
					if(i == (k/2)+1)
					{	
						middle = i;
					}
				}else{
					if(i == (k/2))
					{
						middle = i;
					}
					
				}
				//System.out.println(i+" "+j);
				j=0;
				

				if(i==middle)
				{
					//System.out.print("middle: "+middle);	
					up = false;
				}


				

				/*while(up && j<k)
				{
					
					System.out.print("*");
					j+=2;
					line = true;
				}*/
				/*while(up && (j<(i*2)))	
				{
					System.out.print("*");
					j++;
					line = true;
					
				}*/
				/*while(!up && (j<(i*2)))	
				{
					System.out.print("*");
					j++;
					line = true;
				}*/

				while((up)&&(j<=i))
				{
					//System.out.print("1111111111111111");
					System.out.print("*");
					j++;
					line = true;
				}

				//while((!up)&&(j<(k-(i/2))+1))
				while((!up)&&(j<(k-(middle)-j)))
				//while((!up)&&(j<=middle))	
				{
					//System.out.print(i+" "+j+" "+k);
					//System.out.print("2222222222222222");
					System.out.print("*");
					j++;
					line = true;
				}



				if(line)
				{
					System.out.println();	
					line = false;
				}
				//System.out.print("*");
				//System.out.println();
				i++;
			}
		}
	}
}