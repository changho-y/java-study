// J-102
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx() {
		setTitle("GraphicsDrawImageEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(270,300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\chang\\Pictures\\shabuLove.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img,20,20,this);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawImageEx();
	}
}
