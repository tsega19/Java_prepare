package OOB;

import java.util.Arrays;
public class method {
    private int a = 10;
    private int[] b = new int[10];
    public int getA() {
        return a;
    }
    public int[] getC() {
        int[] c = Arrays.copyOf(b, b.length);
        return c;
    }
    public int[] getB() {
        return b;
    }
    public static void main(String[] args) {
        method p = new method();
        System.out.println(Arrays.toString(p.getB()));
        System.out.println(Arrays.toString(p.getC()));
    }
}
