//J-103
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx2() {
		setTitle("GraphicsDrawImageEx2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(400,300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\chang\\Pictures\\shabuLove.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img,0,0,getWidth(),getHeight(),this);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawImageEx2();
	}
}
