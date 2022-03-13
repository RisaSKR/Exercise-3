public class Task4
{
    public static void main(String[] args) {
        int number = 100;
        int sum = 0;

        System.out.println("Answer for the sums of even number : ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0){
                sum = sum + i;
                // number%2 == 0 means it an Even number

            }

        }System.out.println(sum);
    }
}
