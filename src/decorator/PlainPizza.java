package decorator;


/**
 * Concrete Component
 */
public class PlainPizza implements Pizza {
  
  public PlainPizza() {
    System.out.println("Adding Dough");
  }

  @Override
  public String getDescription() {
    return "Dough";
  }

  @Override
  public double getCost() {
    return 5.0;
  }

}
