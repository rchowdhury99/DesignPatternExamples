package decorator;

/**
 * Concrete Decorator
 */
public class TomatoSauce extends ToppingDecorator{

  public TomatoSauce(Pizza pizza) {
    super(pizza);
    System.out.println("Adding Sauce");
  }
  
  @Override
  public String getDescription() {
    return this.pizza.getDescription() + ", Tomato Sauce";
  }

  @Override
  public double getCost() {
    return this.pizza.getCost() + .35;
  }

}
