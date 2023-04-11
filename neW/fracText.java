public class fracText {
  public static void main(String[] args) {
    Fraction myFrac = new Fraction(2,3);
    System.out.println(myFrac);
    myFrac.multiply(myFrac);
    System.out.println(myFrac);
    System.out.println(myFrac.asDouble());
  }
}
