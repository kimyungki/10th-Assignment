import java.awt.FlowLayout;
import javax.swing.*;
  
public class AbsoluteTest2 extends JFrame {
	JPanel p1;
  
	AbsoluteTest2() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++)
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true);
	}


	public static void main(String args[]) {
		new AbsoluteTest2();
	}
}
