package InnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;



public class InnerClass {

    public static void main(String[] args)
    {
        var clock = new TalkingClock(1000, true);
        clock.start();
        //keep program running until the user selects OK
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}
class TalkingClock 
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval ,boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }
    public void start()
    {
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }
    public class TimePrinter implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
          System.out.println("At the tone, the time is "+Instant.ofEpochMilli(e.getWhen()));
          if (beep) Toolkit.getDefaultToolkit().beep();
        }

    }
}