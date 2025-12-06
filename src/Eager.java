public class Eager {
  private static final Eager instance = new Eager();

  private Eager()
  {

  }

  public static Eager getInstance() {
      return instance;
  }

  public void printMessage(Eager eagerInstance)
  {
    System.out.println("This is Eager Instance: "+ eagerInstance);
  }
}
