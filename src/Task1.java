import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1
{
    public static void main(String[] args) throws IOException {
        float sum ,subtraction  ,product, quotient ;
        float firstNumberSirisa, secondNumberSirisa;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program will calculate sum,different,product and quotient");
        System.out.println("Please enter your first number : ");
        firstNumberSirisa = Float.parseFloat (br.readLine());
        System.out.println("Please enter the second number : ");
        secondNumberSirisa = Float.parseFloat(br.readLine());

        sum = firstNumberSirisa + secondNumberSirisa;
        subtraction =firstNumberSirisa - secondNumberSirisa;
        product = firstNumberSirisa * secondNumberSirisa;
        quotient = firstNumberSirisa / secondNumberSirisa;

        // %.2f means 2 decimal place
        System.out.printf("The first number :  %.2f", firstNumberSirisa );
        System.out.printf("The second number : %.2f", secondNumberSirisa);

        System.out.printf("The sum of the number = %.2f \n",sum);
        System.out.printf("The subtraction of the number = %.2f \n",subtraction);
        System.out.printf("The product of the number = %.2f \n",product);
        System.out.printf("The quotient of the number = %.2f \n",quotient);



    }



}
