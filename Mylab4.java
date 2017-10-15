import java.awt.*;
import javax.swing.*;
 
public class Mylab4 extends JFrame {
       public Mylab4() {
 
             setTitle("BorderLayoutTest");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
             // �������� ����Ʈ�� BorderLayout �̹Ƿ� ����� ���ʿ�
             setLayout(new BorderLayout());
 
             // ��ư�� �߰��Ѵ�.
             add(new JButton("Center"), BorderLayout.CENTER);
             add(new JButton("Line Start"), BorderLayout.LINE_START);
             add(new JButton("Line End"), BorderLayout.LINE_END);
             add(new JButton("Page Start"), BorderLayout.PAGE_START);
             add(new JButton("Page End"), BorderLayout.PAGE_END);
 
             pack();
             setVisible(true);
       }
public static void main(String args[]){
	new Mylab4();
}
}
