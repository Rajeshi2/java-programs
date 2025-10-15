class A{
    int x,y;
    A(int a,int b){
    x=a;
    y=b;
        System.out.println("x="+x+"y="+y);
   }
   void add(){
        System.out.println("super add:"+(x+y));
   }
}
class B extends A{
    int z=88;
    B(int x,int y){
    super(x,y);
    }
    void display(){
    super.add();
    z=super.x+super.y+z;
        System.out.println("sub add:"+z);
    }
}
class SuperExample{
    public static void main(String[] args){
       B obj=new B(10,20);
       obj.display();
    }
} 
