// J-119
import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
	public ToolTipDelayEx() {
		setTitle("ToolTipDelayEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel cherryLabel = new JLabel(new ImageIcon("C:\\Users\\chang\\Pictures\\cherry.jpg"));
		cherryLabel.setToolTipText("체리");
		
		JLabel appleLabel = new JLabel(new ImageIcon("C:\\Users\\chang\\Pictures\\apple.jpg"));
		appleLabel.setToolTipText("사과");
		
		c.add(cherryLabel);
		c.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}
