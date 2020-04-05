import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Display extends JFrame{



     public Display()
   {
      setSize(500,800);
      setLocation(0,200);
      setLayout(new BorderLayout());
      setResizable(false);
      add(new JLabel("info"));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      setVisible(true);
   }
}
