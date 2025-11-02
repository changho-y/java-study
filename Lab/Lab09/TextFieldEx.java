// J-89
import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("TextFieldEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("AI소프트웨어학과", 20));
		c.add(new JLabel("주소 "));
		c.add(new JTextField("경기도 ...", 20));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
