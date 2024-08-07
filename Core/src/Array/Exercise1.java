/**
 *          ARRAY
 * Arrays are used for various reasons:
 *      Organizing data
 *      simplifying code
 *      improving performance
 */
package Array;
import java.util.Arrays;
public class Exercise1 {
//    Declaring an array
static int[] test1;
    /**  At this point we can't add value because it is not initialized yet.
        Initializing the array
     **/
    public static void main(String[] arg) {
        test1 = new int[10];
//    or simply with one line of code
        int[] test2 = new int[10];
        System.out.println(test2[0]);
        System.out.println(test1.length);
//    or we can simply create an array with value
        int[] test3= {5,4,3,2,1,};
//        accessing the elements from the array
        System.out.println(test3[4]);
//        System.out.println(test3[6]);
//        validating any array index to prevent exeption error
        String[] test4 = {"Test1", "test2", "test3", "test4", "test5"};
        int index = -3;
        if (index >=0 && index<test4.length){
            System.out.println(test4[index]);
        }else {
            System.out.println("invalid index: "+ index);
        }
//       iteration an array
        int[] test5={3,4,5,6,7,8,9};
        for (int i=0; i<test5.length; i++){
            System.out.println("Element at index "+ i+" "+": "+test5[i]);
        }
//        getting average using value
        int total =0;
        for(int j=0; j<test5.length; j++){
            total += test5[j];
        }
        System.out.println(total);
        System.out.println("average manual :"+ total/test5.length);
//        using enhanced for loop(for each)
        for (int eachTotal : test5){
            int totals = 2*eachTotal;
            System.out.println(totals);
        }
//  ---------------------------------------------------------------------------
//        getting average using java built in method
        System.out.println( "average :"+Arrays.stream(test5).average());
    }

}
