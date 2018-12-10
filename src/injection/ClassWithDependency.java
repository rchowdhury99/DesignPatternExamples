package injection;

/**
 * This class makes use of the Injection Design Pattern because it injects
 * a dependency with a constructor or a setter
 */
public class ClassWithDependency {
  
  private Dependency d;
  
  public ClassWithDependency(Dependency d) {
    this.d = d;
  }
  
  public void setDependency(Dependency d) {
    this.d = d;
  }
  
  public String toString() {
    return "The dependency is: " + this.d.toString();
  }
}
