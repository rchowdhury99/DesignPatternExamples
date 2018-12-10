package singleton;

public class Singleton {

  // reference to a Singleton object
  private static Singleton ref = null;
  
  private Singleton() {}
  
  public static Singleton createInstanceOfSingleton() {
    if(ref == null) {
      ref = new Singleton();
    }
    return ref;
  }
}
