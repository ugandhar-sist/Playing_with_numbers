import java.util.Scanner;

public class BetrothedPair {
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
        if (sum1 == b + 1 && sum2 == a + 1)
            System.out.print("Bethroed Pairs");
        else
            System.out.print("not");
    }
}
