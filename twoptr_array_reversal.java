// 2 Pointer approach to revese an array
import java.util.Scanner;
public class twoptr_array_reversal {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements of array");
    int length = in.nextInt();
    int arr[] = new int[length];
    System.out.println("Enter elements of array");
    for(int i = 0; i < length; i++) {
      arr[i] = in.nextInt();
    }
    int left = 0;
    int right = arr.length - 1;
    int temp = 0;
    while(left < right) {
      temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    System.out.println("Array After reversal:");
    for(int i = 0; i < length; i++) {
      System.out.println(arr[i]);
    }
    in.close();
  }
}
