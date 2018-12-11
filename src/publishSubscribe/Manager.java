package publishSubscribe;

import java.util.Observable; // the Publisher; A Class
import java.util.Observer; // the Subscriber; An Interface

public class Manager implements Observer{

  public Manager(){}

  public void update(Observable obs, Object record){
    System.out.println("The manager says a "
        + ((Database) obs).getOperation() + " operation was performed on "
        + ((Database) obs).getRecord());
  }
}