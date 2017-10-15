import javax.swing.*;
public class MyFrameTest2 extends JFrame {
       public MyFrameTest2() {
             setSize(300, 200);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setTitle("MyFrame");
             setVisible(true);
       }
       public static void main(String[] args) {
    	   MyFrameTest2 f = new MyFrameTest2();
       }
}
