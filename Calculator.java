 import java.awt.*; 
 import javax.swing.*; 
 import java.awt.event.*; 
 
 
 public class Calculator extends JFrame implements ActionListener{ 
 
 	private JPanel panel; 
 	private JTextField tField; 
 	private JButton[] buttons; 
 	String result ;
 	double result2 = 0;
 	String key = null;
	String a=null,b=null;
	private String[] labels = {  
 			"Backspace", "", "", "CE", "C", 
 			"7", "8", "9", "/", "sqrt", 
 			"4", "5", "6", "x", "%", 
 			"1", "2", "3", "-", "1/x", 
 			"0", "+/-", ".", "+", "=" 
 	}; 
 	public Calculator() { 
 		tField = new JTextField(35); 
 		panel = new JPanel(); 
 		tField.setText(""); 
 		 
    
 		panel.setLayout(new GridLayout(0, 5, 3, 3)); 
 		buttons = new JButton[25]; 
 		int index = 0; 
 		for (int rows = 0; rows < 5; rows++) { 
 			for (int cols = 0; cols < 5; cols++) { 
 				buttons[index] = new JButton(labels[index]); 
 				buttons[index].addActionListener(this); 
 				if( cols >= 3 ) 
					buttons[index].setForeground(Color.red); 
				else  
 					buttons[index].setForeground(Color.blue); 
 				buttons[index].setBackground(Color.yellow); 
 				panel.add(buttons[index]); 
 				index++; 
			} 
 		} 
 		add(tField, BorderLayout.NORTH); 
 		add(panel, BorderLayout.CENTER); 
 		setVisible(true); 
 		pack(); 
 	} 
 	public void actionPerformed(ActionEvent e){ 
 		String s = e.getActionCommand(); 
 		char c = s.charAt(0); 
 		if ( s == "0" || s=="1" || s =="2" || s == "3" || s == "4" || s=="5" || s =="6" || s == "7" || s == "8" || s=="9" || s==".") 
 		{
 			
 			tField.setText(tField.getText()+s); 
 		} 
		if(s == "Backspace"){ 
			String t = tField.getText();
 			t= t.substring(0, t.length()-1); // 0~ 마지막-1까지 
 			tField.setText(t); 
 		} 
 		if(s == "C" || s == "CE"){ 
 			a=null;
 			b=null;
 			key=null;
 			tField.setText(null); 
 			
 		} 
 		if(s == "+" || s == "-" || s == "*" || s == "/"||s=="%" ){ 
 			a=tField.getText();
 			key=s;
 			tField.setText(""); 
 		} 
 	
 		 if(s == "sqrt" ){ 
 			result2=Math.sqrt(Double.parseDouble(tField.getText()));
 		tField.setText(""+result2);
 		 } 
 		 if(s == "1/x" ){ 
 			result2=1/(Double.parseDouble(tField.getText()));
 			tField.setText(""+result2);
 		} 
 		if(s == "=" ){ 
 		b=tField.getText();
 		double digit = Double.parseDouble(a);
 		double digit2 = Double.parseDouble(b);
 			switch(key){ 
 			case "+": 
 				result = ""+(digit+digit2);

 				tField.setText(result);
 				break; 
 			case "-": 
 				result =  ""+(digit-digit2);
 				break; 
 			case "*": 
 				result =  ""+(digit*digit2);
 				break; 
 			case "/": 
 				result =  ""+(digit/digit2);
 				break; 
 			case "%": 
 				result =  ""+(digit%digit2);
 				break; 
 			} 
 			 	 
 		} 
 	} 
 	public static void main(String args[]) { 
 		new Calculator(); 
 	} 
 } 
