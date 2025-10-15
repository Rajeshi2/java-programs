import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        int left = 0, right = arr.length - 1, mid;
        boolean found = false;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println(found ? "Found" : "Not found");
        sc.close();
    }
}