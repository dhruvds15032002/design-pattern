public class App {
    public static void main(String[] args) throws Exception {
        // Eager Initialisation (Thread Safe as instance is initiated at the time of class loading but is unnecessary for some cases.)
        Eager e1 = Eager.getInstance();
        Eager e2 = Eager.getInstance();
        e2.printMessage(e2);
        System.out.println(e1);
        System.out.println(e2);

        // Lazy Initialisation (Doesn't get instantiated at the time of class loading but not thread safe)

        // Race Condition for differnt threads
        Lazy l1 = Lazy.getInstance();
        Lazy l2 = Lazy.getInstance();
        l2.printMessage(l2);
        System.out.println(l1);
        System.out.println(l2);

        // Synchronization(Extended version of Lazy but to avoid Race condition we use synchronization, It locks the method when one thread is running that)

        // Impacts the performance as the thread is locked for every request

        Synchronization syc1 = Synchronization.getInstance();
        Synchronization syc2 = Synchronization.getInstance();
        syc2.printMessage(syc2);
        System.out.println(syc1);
        System.out.println(syc2);

        // Double Check Locking (Similar to Synchronization but we use volatile so that thread2 doesn't get partial object)
        // Thread is not locked for every request, only in case of first time initialization

        DoubleCheck dou1 = DoubleCheck.getInstance();
        DoubleCheck dou2 = DoubleCheck.getInstance();

        dou1.printMessage(dou1);
        System.out.println(dou1);
        System.out.println(dou2);

        // Bill Pugh Singleton (BEST Practical Approach)
        // lazy loading + thread-safe hota hai bina synchronization/locking ke.

        //Instance ek inner static class me banate hain.
        //Jab tak hum getInstance() call nahi karte, helper class load nahi hoti.
        //Aur class loading Java me by-default thread-safe hoti hai.

        BillPugh bp1 = BillPugh.getInstance();
        BillPugh bp2 = BillPugh.getInstance();

        bp1.printMessage((bp2));
        System.out.println(bp1);
        System.out.println(bp2);
    }
}
