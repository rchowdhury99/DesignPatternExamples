package injection;

public class Driver {

  public static void main(String[] args) {
    Dependency d1 = new Dependency("Apples");
    Dependency d2 = new Dependency("Oranges");
    Dependency d3 = new Dependency("Grapes");
    
    ClassWithDependency c1 = new ClassWithDependency(d1);
    ClassWithDependency c2 = new ClassWithDependency(d2);
    System.out.println(c1);
    System.out.println(c2);
    
    c2.setDependency(d3);
    System.out.print(c2);

  }

}
