import java.util.*;
class BI
{
void Arithmetic()
{
try
{
int a=20,b=0,c;
c=a/b;
System.out.println("c="+c);
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException:\n"+e);
}
}
void Arrayiob()
{
try
{
int a[]= {100,200,300,400};
a[100]=500;
System.out.println(a[100]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
void Nullpe()
{
try
{
String str=null;
System.out.println(str.charAt(0));
}
catch(NullPointerException e)
{
System.out.println(e);
}
}
void Numberfo()
{
try
{
int i=Integer.parseInt("Java");
System.out.println(i);
}
catch(NumberFormatException e)

{
System.out.println(e);
}
}
void Stringiob()
{
try
{
String str="Welcome to Java";
char c=str.charAt(50);
System.out.println(c);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e);
}
}
}
public class BuiltInException
{
public static void main(String args[])
{
int ch;
Scanner sc=new Scanner(System.in);
BI obj=new BI();
while(true)
{
System.out.println("1.ArithmeticException\n 2.ArrayIndexOutOfBoundsException\n 3.NullPointerException\n 4.NumberFormatException\n 5.StringIndexOutOfBoundsException\n 6.Exit: ");
ch=sc.nextInt();
switch(ch)
{
case 1:obj.Arithmetic();
break;
case 2:obj.Arrayiob();
break;
case 3:obj.Nullpe();
break;
case 4:obj.Numberfo();
break;
case 5:obj.Stringiob();
break;
case 6:System.exit(0);
break;
default: System.out.println("Wrong Choice");
}
}
}
}