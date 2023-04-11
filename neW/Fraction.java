public class Fraction {

  private int numerator;
  private int denominator;

  public Fraction(int num, int denom) {
    this.numerator = num;
    if (denom == 0) {
      this.denominator = 1;
    } else {
      this.denominator = denom;
    }
  }

  public int getNum() {
    return this.numerator;
  }

  public int getDenom() {
    return this.denominator;
  }

  public double asDouble() {
    return 1.0 * this.numerator / this.denominator;
  }

  void multiply(Fraction fraction) {
    this.numerator *= fraction.getNum();
    this.denominator *= fraction.getDenom();
  }

  public String toString() {
    return this.numerator + ", " + this.denominator;
  }
}
