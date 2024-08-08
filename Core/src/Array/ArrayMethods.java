package Array;
import java.util.Arrays;
public class ArrayMethods {
   public static void main(String[] args) {
       int[] numbers = {9, 10, 6, 7, 8,5 };
//       Array Sorting
       Arrays.sort(numbers);
//       Binary search method
       int target= 11;
       int index = Arrays.binarySearch(numbers, target);
       System.out.println(index);
//       Converting to string method
       System.out.println(Arrays.toString(numbers)+" "+ numbers);
//       FIll method
       int[] num= new int[5];
       Arrays.fill(num, 23);
       System.out.println(Arrays.toString(num));
//       CopyOf method
       int[] num2 = Arrays.copyOf(numbers, numbers.length);
       System.out.println(Arrays.toString(num2)+" "+ num2);
//       Array equal method
       boolean ArrryEqual = Arrays.equals(num, numbers);
       System.out.println(ArrryEqual);
   }
//
}
