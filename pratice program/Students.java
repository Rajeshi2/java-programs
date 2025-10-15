class Student {
       public int roll_no;
       public String name;

       Student(int roll_no , String name){
               this.roll_no = roll_no;
               this.name = name;
       }
}
public class ArrayOfObjects{
        public static void main(String[] args){
                Student[] arr;
                arr = new Student[5];
                arr[0] = new Student [1,"rajesh"];
                arr[1] = new Student [2,"mani"];
                arr[2] = new Student [3,"shiva"];
                arr[3] = new Student [4,"mahesh"];
                arr[4] = new Student [5,"yeswanth"];
                for(int i=0; i<arr.length; i++)
                      System.out.println("elements at  " + i + " : { " + arr[i].roll_no +" " + arr[i].name + "}");
         }
}
