import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, sum = 0, digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        num = original;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == original)
            System.out.println(original + " is an armstrong.");
        else
            System.out.println(original + " is not an armstrong.");
        sc.close();
    }
}