import java util scanner;
public class quadraticroots{
public static void main (string[] arg){
Scanner Sc=new scanner (system.in);
System.out.println("enter values of a:");
double a=Sc.nextDouble();
System.out.println("enter values of b:");
double b=Sc.nextDouble();
System.out.println("enter values of c:");
double c=Sc.nextDouble();
double d=b*b-4a*c;
if(d>0){
double root1=(-b+math.sqrt(d))/(2*a);
double root1=(-b-math.sqrt(d))/(2*a);
SystemSystem.out.println("roots are real and different);
System.out.println("root1="+root1);
System.out.println("root2="+root2);
}else if(d==0){
double root=b/(2*a);
System.out.println("roots are real and equal);
System.out.println("root="+root);
}else{
double root=b/(2*a);
double imagpart=math.sqrt(d)/(2*a);
System.out.println("roots are complex and different);
System.out.println("root1="+realpart+"+"+imagpart");
System.out.println("root2="+realpart+"+"+imagpart");
}
Sc.close();
}
}

