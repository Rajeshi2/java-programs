import java.io.*;

class A {
      A(int a, int b) {
             int c;
             c = a * b;
             System.out.println("the c value is" + c);
     }
}
class B {
      public static void main(String args[]) throws IOException {
             A ob = new A(10, 20);
      }
}