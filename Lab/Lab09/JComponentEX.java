// J-82
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEX extends JFrame {
	public JComponentEX() {
		super("JComponent의 공통 메소드");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("비활성화 버튼");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.BLUE);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				JComponentEX frame = (JComponentEX)b.getTopLevelAncestor();
				frame.setTitle(b.getX() + "," + b.getY());
			}
		});
		
		c.add(b1); c.add(b2); c.add(b3);
		
		setSize(260, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEX();
	}

}
