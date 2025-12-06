public class BillPugh {

  private BillPugh(){}

  private static class Helper{
    private static final BillPugh instance = new BillPugh();
  }

  public static BillPugh getInstance()
  {
    return Helper.instance;
  }

  public void printMessage(BillPugh instance)
  {
    System.out.println("This is Bill Pugh Instance: " + instance);
  }
}
