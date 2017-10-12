public class PC_4{
 
     public static void main(String []args){
        int lines = 11;
        int upStars, downStars, stars=1;
        int i = 1, j=1;
        boolean newLine = false;
        int middle;

        //find middle line of diamond
        if(lines%2 == 1)
        {
            middle = (lines/2)+1;
        }else{
            middle = lines/2;
        }
        //System.out.print("middle: "+middle+"\n");
        while(i<=lines)
        {
            //System.out.println("i: "+i);
            upStars=1;
            downStars=1;
           
            if(i<=middle)
            {
                upStars = (i*2)-1;
                stars = upStars;
            }else{
                stars-=2;
            }
            j=i;
            while((i<=middle)&&(upStars != 0))
            {
                while(j<middle)
                {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*");
                upStars--;
                newLine = true;
            }
            downStars = stars;
            //System.out.println("up: "+upStars+" down: "+downStars+" stars: "+stars);
            while((i>middle)&&(downStars != 0))
            {
                while(j>middle)
                {
                    System.out.print(" ");
                    j--;
                }
                System.out.print("*");
                downStars--;
                newLine = true;
            }
           
            if(newLine)
            {
                System.out.println();
                newLine = false;
            }
            i++;
        }
     }
}