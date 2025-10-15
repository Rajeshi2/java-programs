class A {
    void display() {
       System.out.println("A class display()");
    }
    void showA() {
       System.out.println("A class show()");
    }
}
class B extends A {
    void display(){
       System.out.println("B class display()");
    }
}
class OverridingExample {
    public static void main(String args[]) {
        A obj = new B();
        obj.display();
        obj.showA();
    }
}
