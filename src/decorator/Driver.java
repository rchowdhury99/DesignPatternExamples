package decorator;

public class Driver {

  public static void main(String[] args) {
    Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
    System.out.println("Ingredients: " + pizza.getDescription());
    System.out.print("Cost: " + pizza.getCost());
  }

}
