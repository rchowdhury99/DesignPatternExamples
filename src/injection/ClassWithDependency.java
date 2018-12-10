package injection;

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
