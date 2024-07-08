import java.util.Scanner;

public class MinimumNumberToCube {
    public static void main(String[] args) {
        long a, fact, count, ans = 1;
        Scanner input = new Scanner(System.in);
        a = input.nextLong();
        for (fact = 2; a != 1; fact++) {
            count = 0;
            while (a % fact == 0) {
                count++;
                a = a / fact;
            }
            if (count % 3 == 2) {
                ans = ans * fact * fact;
            } else if (count % 3 == 1) {
                ans = ans * fact;
            }
        }
        System.out.print(ans);
    }
}
