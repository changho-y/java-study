// J-94
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	private String [] fruits = {"apple", "pear", "cherry", "mango"};
	
	private ImageIcon [] images = { new ImageIcon("C:\\Users\\chang\\Pictures\\apple.jpg"),
									new ImageIcon("C:\\Users\\chang\\Pictures\\pear.jpg"),
									new ImageIcon("C:\\Users\\chang\\Pictures\\cherry.jpg"),
									new ImageIcon("C:\\Users\\chang\\Pictures\\mango.jpg")};
	private JLabel imgLabel = new JLabel(images[0]);
	private JComboBox<String> strCombo = new JComboBox<String>(fruits);
	
	public ComboActionEx() {
		setTitle("ComboActionEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(strCombo);
		c.add(imgLabel);
		
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
