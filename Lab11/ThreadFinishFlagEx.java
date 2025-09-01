// J-113
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag=false;
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	public void finish() {
		flag = true;
	}
	public void run() {
		while(true) {
			int x = ((int)(Math.random()*contentPane.getWidth()));
			int y = ((int)(Math.random()*contentPane.getHeight()));
			JLabel label = new JLabel("윤창호");
			label.setSize(80,30);
			label.setLocation(x,y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if(flag==true) {
					contentPane.removeAll();
					label.setSize(80,30);
					label.setLocation(100,100);
					
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			}
			catch(InterruptedException e) { return; }
		}
	}
}
public class ThreadFinishFlagEx extends JFrame {
	private RandomThread th;
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
	}
	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}
}
