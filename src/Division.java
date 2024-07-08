import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int num1, num2, count = 0;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }
        System.out.printf("Quo : %d\nRem : %d", count, num1);
    }
}
