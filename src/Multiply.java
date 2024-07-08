import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        int num1, num2, itr, sum = 0;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        for (itr = 1; itr <= num2; itr++)
            sum = sum + num1;
        System.out.println(sum);
    }
}
