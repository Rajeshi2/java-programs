public class MyExceptionExtendsException
{
private static int accno[]={101,102,103,104,105};
private static String
name[]={"subramanyam","neeraja","nithwik","rohith","nani"};
private static double bal[]={10000,15000,5600.50,999.50,4000.00};
MyException() { }
MyException(String str)
{
super(str);
}
public static void main(String[] args)
{
try
{
System.out.println("ACCONT NO "+"CUSTOMER NAME"+"BALANCE");
for(int i=0;i<5;i++)
{
if(bal[i]<1000)
{
MyException me=new MyException("balance is less than 1000 at :"+accno[i]);
throw me;
}
System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
}
}
catch(MyException me)
{
me.printStackTrace();
}
}
}
