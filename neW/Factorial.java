public class Factorial {
  public static void main(String[] args) {
    System.out.println(fac(3));
    System.out.println(fac(4));
    System.out.println(fac(5));
  }

  public static int fac(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * fac(n - 1);
    }
  }
}
