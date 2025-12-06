public class Lazy {
  private static Lazy instance;

  private Lazy()
  {

  }

  public static Lazy getInstance()
  {
    if(instance == null)
    {
      instance = new Lazy();
    }
    return instance;
  }

  public void printMessage(Lazy lazyInstance)
  {
    System.out.println("This is Lazy Instance: "+ lazyInstance);
  }
}
