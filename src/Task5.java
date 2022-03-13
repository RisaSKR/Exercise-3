import java.util.Random;

public class Task5
{
    public static void main(String[] args) {
        int selection = 10,i=1;
        int num , min=101,max=0;
        System.out.println("Let's find the smallest and greatest of the collection number " +selection);
        Random r = new Random();
        while(i <=selection){
            num=Math.round(r.nextInt(100)+1);
            System.out.print(num +",");
            if(num<min) min=num;
            if(num>max) max=num;
            i++;
        }
        System.out.println("The Largest number is "+max);
        System.out.println("The Smallest number is "+min);


    }
}
