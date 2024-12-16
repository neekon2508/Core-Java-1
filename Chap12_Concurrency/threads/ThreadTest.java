package Chap12_Concurrency.threads;
/**
 * @version 1.0 2024-08-04
 * @author Neekon
 */
public class ThreadTest {
    public static final int DELAY = 10;
    public static final int STEPS = 100;
    public static final double MAX_AMOUNT = 1000;

    public static void main(String[] args) {
        var bank = new Bank(4, 100000);
        Runnable task1 = () ->
        {
            try 
            {
                for (int i =0; i < STEPS; i++)
                {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(0, 1, amount);
                    System.out.println(System.currentTimeMillis());
                    Thread.sleep((int)(DELAY*Math.random()));
                }
            }
            catch (InterruptedException e)
            {}
        };
        Runnable task2 = () ->
        {
            try
            {
                for (int i =0; i < STEPS; i++)
                {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(2, 3, amount);
                    Thread.sleep((int)(DELAY*Math.random()));
                }
               
            }
            catch (InterruptedException e)
            {}
        };
        new Thread(task1).start();

    }
}
