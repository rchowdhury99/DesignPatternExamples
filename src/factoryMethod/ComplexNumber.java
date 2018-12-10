package factoryMethod;

public class ComplexNumber {

  private double real;
  private double imaginary;

  private ComplexNumber(double r, double i) {
    this.real = r;
    this.imaginary = i;
  }

  public static ComplexNumber createComplexNumberFromCartesionCoordinates(
      double real, double imaginary) {
    return new ComplexNumber(real, imaginary);
  }

  public static ComplexNumber createComplexNumberFromPolarCoordinates(
      double modulus, double angle) {
    return new ComplexNumber(modulus*Math.cos(angle), modulus*Math.sin(angle));
  }
}
