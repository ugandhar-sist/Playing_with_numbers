import java.util.Scanner;

public class AmicablePairs {
    public static void main(String[] args) {
        long a, b, sum1 = 0, sum2 = 0, i;
        Scanner input = new Scanner(System.in);
        a = input.nextLong();
        b = input.nextLong();
        for (i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for (i = 1; i <= b / 2; i++) {
            if (b % i == 0) {
                sum2 = sum2 + i;
            }
        }
        if (a == sum2 && b == sum1)
            System.out.print("Amicable Pairs");
        else
            System.out.print("not");
    }
}
