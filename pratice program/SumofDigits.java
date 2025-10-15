import java.util.Scanner;
public class SumofDigits {
       public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter an in teger:");
       int num=sc.nextInt(),sum=0;
       while (num!=0) {
              sum+=num%10;
              num/=10;
        }
        System.out.println("sum of digits:"+sum);
        sc.close();
        }
}