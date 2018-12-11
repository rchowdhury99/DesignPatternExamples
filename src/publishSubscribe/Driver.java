package publishSubscribe;

public class Driver {

  public static void main(String[] args) {
    // Creation of the publisher
    Database database = new Database();

    // Creation of the subscribers
    Archiver archiver = new Archiver();
    Client client = new Client();
    Manager manager = new Manager();

    database.addObserver(archiver);
    database.addObserver(client);
    database.addObserver(manager);

    database.editRecord("delete", "record1");
  }
}
