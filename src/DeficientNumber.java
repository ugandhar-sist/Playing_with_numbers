import java.util.Scanner;

public class DeficientNumber {
    public static void main(String[] args) {
        long a, sum = 0, i;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for (i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum < a)
            System.out.print("Deficient Number");
        else
            System.out.print("Not");
    }
}
