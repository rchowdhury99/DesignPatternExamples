package builder;

/**
 * This class utilizes the Builder design pattern because it has
 * many optional parameters, and should be immutable
 */
public class NutritionFacts {

  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrates;

  private NutritionFacts(Builder b) {
    this.servingSize = b.servingSize;
    this.servings = b.servings;
    this.calories = b.calories;
    this.fat = b.fat;
    this.sodium = b.sodium;
    this.carbohydrates = b.carbohydrates;
  }

  public static class Builder {
    // required parameters
    private final int servingSize;
    private final int servings;

    // optional parameters - initialized to default values
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrates = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int value) {
      this.calories = value;
      return this;
    }

    public Builder fat(int value) {
      this.fat = value;
      return this;
    }

    public Builder sodium(int value) {
      this.sodium = value;
      return this;
    }

    public Builder carbohydrates(int value) {
      this.carbohydrates = value;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }

  public String toString() {
    return "Servings: " + this.servings + "\nServing Size: " 
        + this.servingSize + "\nCalories: " + this.calories
        + "\nFat: " + this.fat + "\nSodium: " + this.sodium 
        + "\nCarbohydrates: " + this.carbohydrates;
  }

}
