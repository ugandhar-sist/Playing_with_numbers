import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        long a, fact;
        Scanner input = new Scanner(System.in);
        a = input.nextLong();
        for (fact = 2; a != 1; fact++) {
            while (a % fact == 0) {
                System.out.print(fact + " ");
                a = a / fact;
            }
        }
    }
}
