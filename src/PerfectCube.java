import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        int N, num;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        for (num = 1; num * num * num <= N; num++) ;
        if ((num - 1) * (num - 1) * (num - 1) == N)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
