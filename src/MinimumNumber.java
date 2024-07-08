import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        int num, fact, count, ans = 1;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();///num=4
        for (fact = 2; num != 1; fact++)//fact=3
        {
            count = 0;///count=0
            while (num % fact == 0)//while(5%3==0)
            {
                count++;//count=2
                num = num / fact;//num=5
            }
            if (count % 3 == 2)
                ans = ans * fact * fact;
            else if (count % 3 == 1)
                ans = ans * fact;
        }
        System.out.println(ans);
    }
}
