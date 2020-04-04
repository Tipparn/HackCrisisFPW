import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class Display extends JFrame{

     public Display()
   {

      setLocation(0,200);
      setLayout(new BorderLayout());

      add(new JLabel("info"));

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }
}
