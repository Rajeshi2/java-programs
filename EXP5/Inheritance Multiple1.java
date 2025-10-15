interface A{
       void show();
}
interface B{
       void display();
}
class C implements A,B{
       public void show(){
            System.out.println("showable");
       }
       public void display(){
            System.out.println("printable");
       }
}
class Multiple1 {
       public static void main(String args[]){
            C obj=new C();
            obj.show();
            obj.display();
       }
}
