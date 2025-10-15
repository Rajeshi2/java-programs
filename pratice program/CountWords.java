import java.util.Scanner;
public class CountWords{
       public static void main (String[]  args) {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter a string:");
             String line=sc.nextLine().trim();
             String[] words = line.split("\\s+");
             System.out.println("Number of words:"+words.length);
             sc.close();
       }
}