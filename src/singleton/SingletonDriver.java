package singleton;

public class SingletonDriver {

  public static void main(String[] args) {
    
    // Creating one and only one instance of a Singleton object
    Singleton a = Singleton.createInstanceOfSingleton();
    Singleton b = Singleton.createInstanceOfSingleton();
    Singleton c = Singleton.createInstanceOfSingleton();
    
    // a b, and c are both references to the same Singleton object
    System.out.println(a.equals(b)); // true
    System.out.println(a.equals(b) && b.equals(c) && c.equals(a)); // true
  }
}
