public class DoubleCheck {
  private static volatile DoubleCheck instance;

  private DoubleCheck()
  {

  }

  public static DoubleCheck getInstance()
  {
    if(instance == null)
    {
      synchronized(DoubleCheck.class)
      {
        if(instance == null) // Kyuki ho sakta hai ek thread lock me aate waqt doosra thread object bana chuka ho
        {
          instance = new DoubleCheck();
        }
      }
    }
    return instance;
  }

  public void printMessage(DoubleCheck obj)
  {
    System.out.println("This is Double Check Locking Instance: " + obj);
  }
}
