import java.util.Scanner;

public class CollatzVermutung {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte geben sie ein n ein: ");
    int n = scanner.nextInt();
    calculateCollatzNumbers(n);
    scanner.close();
  }

  public static void calculateCollatzNumbers(int n) {
    while (n != 1) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = 3 * n + 1;
      }
      System.out.println(n);
    }
  }

}
