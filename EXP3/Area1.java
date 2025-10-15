import java.io.*;
import java.util.*;
class Area {
     double a;

     public double area(double r) {
            a = 3.14 * r * r;
            return a;
    }
}
class Circle {
      public static void main(String args[]) throws IOException {
           Area ob = new Area();
          Scanner sc = new Scanner(System.in);
          System.out.println("enter radius of a circle");
          double r = sc.nextDouble();
          double ar = ob.area(r);
          System.out.println("Area of a circle is:" + ar);
     }
}