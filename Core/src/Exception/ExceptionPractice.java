package Exception;

public class ExceptionPractice {
    int i = 10;
    int j = 10;
    int k= i/j;
  public void sum(int i, int j, int k) {
      try {
          k = i / j;
      } catch (Exception e) {
          System.out.println("Wrong try");
      }
      System.out.println(k);
  }
    public static void main(String[] args) {
        ExceptionPractice p = new ExceptionPractice();
        p.sum(2,3, p.k);
        // test
    }
}
