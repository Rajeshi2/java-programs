import java.util.Scanner;
public class ExceptionHandling1
{
public static void main(String[] args)
{
try
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b values: ");
a=sc.nextInt();
b=sc.nextInt();
c=a/b;
System.out.println("c="+c);
int array[]= {50,60,70};
array[100]=80;
System.out.println(array[80]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception:\n"+e);

}
finally
{
System.out.println("Finally is executed");
}
}
}