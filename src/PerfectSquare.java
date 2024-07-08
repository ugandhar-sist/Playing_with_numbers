import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        long N, num;
        Scanner input = new Scanner(System.in);
        N = input.nextLong();
        /*for(num=1; num*num<=N; num++);
        if((num-1)*(num-1) == N)
            System.out.println("Yes");
        else
            System.out.println("No");
         */
        int sqr = (int) Math.sqrt(N);
        if (sqr * sqr == N)
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
