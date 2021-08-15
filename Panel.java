package CurrencyConverter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel
{
   private JFrame frame;
   private JPanel contentPane;

   public void start()
   {
       frame = new JFrame("Currency Converter");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container contentPane = frame.getContentPane();

       frame.setSize(300, 300);
       frame.setVisible(true);
   }
   public void makeContent()
   {
       contentPane = (JPanel) frame.getContentPane();
       contentPane.setLayout(new BorderLayout(6,6));
       makeNorthRegion();
   }
   public void makeNorthRegion()
   {
       JPanel panel = new JPanel();
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       panel.setBorder(BorderFactory.createTitledBorder("Currency Converter"));
       contentPane.add(panel, BorderLayout.NORTH);
   }
}
