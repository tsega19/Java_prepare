package Methods;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
//        System.out.println("Test");
//        sampleMethod();
//        Scanner number = new Scanner(System.in);
//        System.out.println("Enter the number between 1.. to 10");
//        int num= number.nextInt();
//        if ((1<num && num<=10 )){
//            System.out.println(num+" is whole number");
//        }
//        else{
//            System.out.println("Not whole number");
//        }
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
    public static void sampleMethod() {
        System.out.println("123");
    }
}
