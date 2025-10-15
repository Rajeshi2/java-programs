class ArrayExample {
      public static void main(String[] args)
      {
           int[] arr;
           arr=new int[5];
           arr[0]=2;
           arr[1]=3;
           arr[2]=8;
           arr[3]=6;
           arr[4]=9;
           for(int i=0;i<arr.length; i++)
                 System.out.println("elements at index"+i+":"+arr[i]);
        }
}