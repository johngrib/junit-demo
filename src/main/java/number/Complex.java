package number;

import lombok.Getter;

import java.util.Objects;

/**
 * 복소수를 정의한다
 */
public class Complex {
  @Getter
  private double real;
  @Getter
  private double imagine;

  private Complex() {
  }

  private Complex(double real, double imagine) {
    this.real = real;
    this.imagine = imagine;
  }

  public static Complex of(double real, double imagine) {
    return new Complex(real, imagine);
  }

  public static Complex of(double real) {
    return new Complex(real, 0);
  }

  /**
   * 두 복소수의 덧셈을 연산한다
   * @param a
   * @param b
   * @return
   */
  public static Complex sum(Complex a, Complex b) {
    return new Complex(a.real + b.real, a.imagine + b.imagine);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Complex complex = (Complex) o;
    return Double.compare(complex.real, real) == 0 &&
        Double.compare(complex.imagine, imagine) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(real, imagine);
  }

  @Override
  public String toString() {
    if (imagine == 0D) {
      return String.format("%f", real);
    }
    return String.format("%f+%fi", real, imagine);
  }
}
