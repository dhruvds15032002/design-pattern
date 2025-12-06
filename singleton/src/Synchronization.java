public class Synchronization {

  private static Synchronization instance;

  private Synchronization()
  {

  }

  public static synchronized Synchronization getInstance()
  {
    if(instance == null)
    {
      instance = new Synchronization();
    }
    return instance;
  }

  public void printMessage(Synchronization synchronization)
  {
    System.out.println("This is Synchronization Instance: " + synchronization);
  }
}
