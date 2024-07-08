import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        long a, i;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for (i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.print(a);
    }
}
