package factoryMethod;

public class Driver {

  public static void main(String[] args) {
    ComplexNumber number1 = 
        ComplexNumber.createComplexNumberFromCartesionCoordinates(6.0, 5.0);
    ComplexNumber number2 = 
        ComplexNumber.createComplexNumberFromPolarCoordinates(1.0, Math.PI/2);
  }
}
