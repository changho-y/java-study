// J-105
import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsClipEx() {
		setTitle("GraphicsClipEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300,300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("C:\\Users\\chang\\Pictures\\shabuLove.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100,20,50,50);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("GO Gator!!", 10, 50);
		}
	}
	public static void main(String[] args) {
		new GraphicsClipEx();
	}

}
