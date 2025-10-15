import java.util.*;
class itc1{
int rollnumber ;
String name;
void details()
{
             System.out.println("name:"+name);
             System.out.println("rollnumber:"+rollnumber);
}
public static void main(String[] args){
itc1 r=new itc1();
r.name="Rajesh";
r.rollnumber="24481A12I2";
r.details();
itc1 m=new itc1();
m.name="Mahesh";
m.rollnumber="24481A12F5";
r.details();
}







