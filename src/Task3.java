import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3
{
    public static void main(String[] args) throws IOException {

        double a,b,c,x1,x2,delta ;
        char rootsNumber = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will calculate quadratic equation ax2+bx+c ");
        System.out.println("Please enter a = ");
        a = Float.parseFloat(br.readLine());
        System.out.println("PLease enter b = ");
        b = Float.parseFloat(br.readLine());
        System.out.println("PLease enter c = ");
        c = Float.parseFloat(br.readLine());


        if (a==0){
            System.out.println("PLease enter another number, not zero");
        }


        delta =  Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) rootsNumber = 0;
        if (delta == 0) rootsNumber = 1;
        if (delta > 0) rootsNumber = 2;

        switch (rootsNumber) {
            case 0:
                System.out.println("It's does not a real one");
                break;

            case 1:
                x1 = -b / (2 * a) ;
                System.out.printf("a = " + "%.2f", a);
                System.out.printf("b = " + "%.2f", b);
                System.out.printf("c = " + "%.2f", c);
                System.out.printf("%.2f", x1);
                break;

            case 2:
                x1 = (-b - (Math.sqrt(delta))) / 2 * a;
                x2 = (-b + (Math.sqrt(delta))) / 2 * a;
                System.out.printf("a = " + "%.2f", a);
                System.out.printf("b = " + "%.2f", b);
                System.out.printf("c = " + "%.2f", c);
                System.out.printf(" x1 = ");
                System.out.printf("%.2f", x1);
                System.out.printf(" x2 = ");
                System.out.printf("%.2f", x2);
                break;


        }


    }
}
