package decorator;

/**
 * Concrete Decorator
 */
public class Mozzarella extends ToppingDecorator{

  public Mozzarella(Pizza pizza) {
    super(pizza);
    System.out.println("Adding Mozzarella");
  }

  @Override
  public String getDescription() {
    return this.pizza.getDescription() + ", Mozzarella";
  }

  @Override
  public double getCost() {
    return this.pizza.getCost() + 3.0;
  }

}
