import java.util.*;
public class bubble{
      public static void main(String[]args){
          System.out.println("enter array size:");
          Scanner Scanner=new Scanner(System.in);
        	  int size=Scanner.nextInt();
          System.out.println("enter" + size +"element in the aray:");
          int a[]=new int[size];
          for(int i=0;i<size;i++){
               a[i]=Scanner.nextInt();
          }
          System.out.println("array before sorting");
          for(int i=0;i<size;i++){
               System.out.println(a[i]+" ");
          }
          for(int i=0;i<size;i++){
               for(int j=0;i<size-i-1;j++){
                   if(a[j]>a[j+1]){
                      int temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
                   }
          }
}
System.out.println("array after sorting");
for(int i=0;i<size;i++) {
       System.out.println(a[i]+" ");
       }
       Scanner.close();
       }
}      
