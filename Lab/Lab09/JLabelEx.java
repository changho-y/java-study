// J-83
import javax.swing.*;
import java.awt.*;

public class JLabelEx extends JFrame {
	public JLabelEx() {
		setTitle("Label Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("우리집 강아지 샤브러브에요");
		
		ImageIcon dog = new ImageIcon("C:\\Users\\chang\\Pictures\\shabuLove.jpg");
		JLabel imageLabel = new JLabel(dog);
		
		ImageIcon changho = new ImageIcon("C:\\Users\\chang\\Pictures\\changho.jpg");
		JLabel Jchangho = new JLabel("이 사진은 저 입니다.", changho, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(Jchangho);
		
		setSize(320, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelEx();
	}

}
