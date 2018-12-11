package builder;

public class Driver {

  public static void main(String[] args) {

    NutritionFacts cola = new NutritionFacts.Builder(240, 8)
        .calories(100)
        .sodium(35)
        .carbohydrates(27)
        .build();
    
    System.out.println(cola);
    System.out.println();
    
    NutritionFacts bigMac = new NutritionFacts.Builder(1, 1)
        .carbohydrates(500)
        .calories(3000)
        .fat(2000)
        .build();
    System.out.print(bigMac);

  }

}
