// J-86
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"사과", "배", "수박"};
	
	private JLabel sumLabel;
	
	public CheckBoxItemEventEx() {
		setTitle("checkBox and ItemEvent Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과5000원, 배4500원, 수박30000원입니다."));
		
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("현재 0원입니다.");
		c.add(sumLabel);
				
		setSize(250, 200);
		setVisible(true);
	}	
	class MyItemListener implements ItemListener {
		private int sum = 0;
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 5000;
				else if(e.getItem() == fruits[1])
					sum += 4500;
				else
					sum += 30000;
			}
			else {
				if(e.getItem() == fruits[0])
					sum -= 5000;
				else if(e.getItem() == fruits[1])
					sum -= 4500;
				else
					sum -= 30000;
			}
			sumLabel.setText("현재" + sum + "원 입니다.");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();

	}

}
