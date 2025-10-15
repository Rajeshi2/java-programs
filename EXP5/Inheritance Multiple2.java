interface A{
       void show();
}

class B{
       void display(){
            System.out.println("printable");
       }
}

class C extends B implements A {
       public void show() {
            System.out.println("showable");
       }
}

class Multiple2 {
       public static void main(String args[]){
            C obj= new C();
            obj.show();
            obj.display();
       }
}
