import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2
{
    public static void main(String[] args) throws IOException {

        float heightSirisa, weightSirisa;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program will calculate BMI");
        System.out.println("Please enter your height in cm : ");
        heightSirisa = Float.parseFloat(br.readLine());
        System.out.println("Please enter your weight in kg : ");
        weightSirisa = Float.parseFloat(br.readLine());
        double BMI = weightSirisa / (Math.pow(heightSirisa / 100, 2));
        System.out.println(BMI);

        if (BMI < 16.00)
        {
            System.out.println("Starvation");
        }
        else if (BMI >= 16.00 && BMI <= 16.99)
        {
            System.out.println("Emaciation");
        }
        else if (BMI >= 17.00 && BMI <= 18.49 )
        {
            System.out.println("Underweight");
        }
        else if (BMI >= 18.50 && BMI <= 22.99)
        {
            System.out.println("Normal,low range");
        }
        else if (BMI >= 23.00 && BMI <= 24.99)
        {
            System.out.println("Normal, high range");
        }
        else if (BMI >= 25.00 && BMI <= 27.49)
        {
            System.out.println("Overweight, low range");
        }
        else if (BMI >= 27.50 && BMI <= 29.99)
        {
            System.out.println("Overweight, high range");
        }
        else if (BMI >= 30 && BMI <= 34.9)
        {
            System.out.println("1st degree obesity");
        }
        else if (BMI >= 35 && BMI <= 39.99)
        {
            System.out.println("2nd degree obesity");
        }
        else if (BMI <= 40)
        {
            System.out.println("3rd degree obesity");
        }




    }
}