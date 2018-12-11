package publishSubscribe;

import java.util.Observable; // the Publisher; A Class
import java.util.Observer; // the Subscriber; An Interface

public class Client implements Observer{
    
    public Client() {}
    
    public void update(Observable obs, Object record){
        System.out.println("The client says a "
        + ((Database) obs).getOperation() + " operation was performed on "
        + ((Database) obs).getRecord());
    }
}