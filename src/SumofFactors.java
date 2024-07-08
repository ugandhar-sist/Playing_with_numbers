import java.util.Scanner;

public class SumofFactors {
    public static void main(String[] args) {
        long num, fact, sum = 0;
        Scanner input = new Scanner(System.in);
        num = input.nextLong();
        for (fact = 1; fact <= num / 2; fact++) {
            if (num % fact == 0) {
                sum = sum + fact;
            }
        }
        //sum=sum+num;
        System.out.println(sum);
    }
}
