// J- 87
import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("RadioButton Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon appleIcon = new ImageIcon("C:\\Users\\chang\\Pictures\\apple.jpg");
		
		ImageIcon selectedAppleIcon = new ImageIcon("C:\\Users\\chang\\Pictures\\appleCheck.jpg");
		
		ButtonGroup g = new ButtonGroup();
		
		JCheckBox cherry = new JCheckBox("체리");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox apple = new JCheckBox("사과", appleIcon);
		
		apple.setBorderPainted(true);
		apple.setSelectedIcon(selectedAppleIcon);
		
		g.add(cherry);
		g.add(pear);
		g.add(apple);
		
		c.add(cherry);
		c.add(pear);
		c.add(apple);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
