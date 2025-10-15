import java.util.*;
public class binary1 {
      public static void main(String[] args) {
              Scanner Scanner=new Scanner(System.in);
              System.out.println("enter array size");
              int size=Scanner.nextInt();
              System.out.println("enter"+ size + "elements in the array:");
              int a[]=new int[size];
              for(int i=0;i<size;i++){
                   a[i]=Scanner.nextInt( );
              }
              System.out.println("enter the elements to search:");
              int key=Scanner.nextInt();
              int low=0,high=size-1,mid,f=0;
              while(low<=high){
                  mid=(low+high)/2;
                  if(a[mid]==key){
                      f=1;
                     System.out.println("elements found at index:" + mid);
                     break;
             }else
             {
                     if(key>=a[mid]){
                         low=mid+1;
                     }
                     if(key<=a[mid]){
                          high=mid-1;
                     }
             }
             if(f==0){
                     System.out.println("elements not found in the array:");
              }
        }
       Scanner.close();
}
}