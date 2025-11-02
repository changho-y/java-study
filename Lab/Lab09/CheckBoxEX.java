// J-85
import javax.swing.*;
import java.awt.*;

public class CheckBoxEX extends JFrame {
	public CheckBoxEX() {
		setTitle("CheckBox Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon appleIcon = new ImageIcon("C:\\Users\\chang\\Pictures\\apple.jpg");
		
		ImageIcon selectedAppleIcon = new ImageIcon("C:\\Users\\chang\\Pictures\\appleCheck.jpg");
		
		JCheckBox cherry = new JCheckBox("체리");
		JCheckBox pear = new JCheckBox("배");
		JCheckBox apple = new JCheckBox("사과", appleIcon);
		
		apple.setBorderPainted(true);
		apple.setSelectedIcon(selectedAppleIcon);
		
		c.add(cherry);
		c.add(pear);
		c.add(apple);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEX();
	}

}
