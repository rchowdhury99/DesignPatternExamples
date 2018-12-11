package publishSubscribe;

import java.util.Observable; // the Publisher; A Class

// Database is a Publisher
public class Database extends Observable{

  private String operation;
  private String record;

  //Constructor
  public Database() {}

  public void editRecord(String operation, String record) {
    this.operation = operation;
    this.record = record;

    this.operation = operation;
    this.record = record;
    // hasChanged() method returns true when setChanged() is called
    this.setChanged();
    // all of the subscribers update() method is called
    this.notifyObservers();
  }

  public String getRecord() {
    return this.record;
  }

  public String getOperation() {
    return this.operation;
  }
}