import javax.swing.*;

import java.awt.Button;
import java.awt.FlowLayout;
  
class MyFrame3 extends JFrame {
       public MyFrame3() {
             setSize(300, 200);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setTitle("MyFrame");
  
             setLayout(new FlowLayout());
             JButton button = new JButton("¹öÆ°");
              this.add(button);
             setVisible(true);
       }
}
public class MyFrameTest3 {
    public static void main(String[] args) {
    	MyFrame3 f = new MyFrame3();
    }
}
