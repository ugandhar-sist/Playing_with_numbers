import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int N, first_term, second_term, sum = 0, itr;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        first_term = 0;
        second_term = 1;
        if (N == 0 || N == 1)
            System.out.println(N);
        else {
            for (itr = 1; itr < N; itr++) {
                sum = first_term + second_term;
                first_term = second_term;
                second_term = sum;
            }
            System.out.print(sum);
        }
    }
}
