import java.io.*;
class A {
      A(int a) {
             System.out.println("The area of a square is:" + a * a);
      }
       A(int a, int b) {
              super();
              System.out.println("The area of a rectangle is" + a * b);
      }
      A(int a, int b, int c) {
             super();
             System.out.println("The volume of a cuboid is " + a * b * c);
       }
}
class B {
      public static void main(String args[]) throws IOException {
             A ob = new A(10);
             A ob1 = new A(10, 2);
             A ob2 = new A(10, 2, 50);
      }
}
