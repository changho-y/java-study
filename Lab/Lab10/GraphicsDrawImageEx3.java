//J-104
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx3 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx3() {
		setTitle("GraphicsDrawImageEx3");
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
			
			g.drawImage(img,20,20,250,100,100,50,200,200,this);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawImageEx3();
	}
}