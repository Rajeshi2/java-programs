interface A{
      int x=10;
      A(int a){
      x=a;
      System.out.println("x="+x);
      }
      void display(){
          System.out.println("showable:"+x);

       }
}
interface B{
      void print(){
          Sysytem.out.println("printable");
      }
}
interface C extends B,A{
      public  void shout(){
      }
}
class Example{
      public static void main(String args[]){
         C.obj = new C(10);
         obj.show();
         obj.display();
     }
}
      
      