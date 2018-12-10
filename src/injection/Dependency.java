package injection;

public class Dependency {

  private String dependency;
  
  public Dependency(String name) {
    this.dependency = name;
  }
  
  public String toString() {
    return this.dependency;
  }
  
}
