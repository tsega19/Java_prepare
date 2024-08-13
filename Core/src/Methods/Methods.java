package Methods;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        mn();
        mn(1,2);
        mn(1,2,3);
        System.out.println("Test");
//        sampleMethod();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number between 1.. to 10");
        int num= number.nextInt();
        if ((1<num && num<=10 )){
            System.out.println(num+" is whole number");
        }
        else{
            System.out.println("Not whole number");
        }
        String numbers = String.valueOf(getNumber());
        System.out.println(numbers.toCharArray());
    }
    private static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 =sc.nextInt();
        if (num1<1 || num1>10){
            System.out.println("Valid");
        }
        else {
            System.out.println("is invalid");
        }
        return num1;
    }
//    public static void sampleMethod() {
//        System.out.println("123");
//
//    }
//    public static void sampleMethod(int num, double nums) {
//        System.out.println(num);
//    }
//    public static void sampleMethod(int num, double um,  String name) {
//        System.out.println("test");
//    }

//    Java Varargs
    public static void mn(int... args){
        int sum = 0;
        for (int i:args){
            sum += i;
        }
        System.out.println(sum);
    }

}

