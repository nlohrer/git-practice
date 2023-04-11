public class Quadratwurzel {
  public static void main(String[] args) {
    System.out.println(quadratwurzel(2, 0));
    System.out.println(quadratwurzel(2, 1));
    System.out.println(quadratwurzel(2, 2));
    System.out.println(quadratwurzel(2, 3));
    System.out.println(quadratwurzel(3, 3));
  }
  public static double quadratwurzel(double x, int n) {
    if (n == 0) {
      return (x + 1) / 2;
    } else {
      return (1.0 * 1/2) * (quadratwurzel(x, n - 1) + x / quadratwurzel(x, n - 1));
    }
  }
}
