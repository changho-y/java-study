// J-84
import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("Button Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\chang\\Pictures\\changho.jpg");
		ImageIcon rollverIcon = new ImageIcon("C:\\Users\\chang\\Pictures\\love.jpg");
		ImageIcon pressedIcon = new ImageIcon("C:\\Users\\chang\\Pictures\\shabuLove.jpg");
		
		JButton btn = new JButton("내 세상", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rollverIcon);
		c.add(btn);
		
		setSize(500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEx();
	}

}
