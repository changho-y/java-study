// J-124
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAndColorChooserEx extends JFrame {
	private JLabel label = new JLabel("윤 창 호");
	
	public MenuAndColorChooserEx() {
		setTitle("MenuAndColorChooserEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem = new JMenuItem("색상");
		JMenu fileMenu = new JMenu("텍스트");
		
		colorMenuItem.addActionListener(new MenuActionListener());
		
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("색상")) {
				Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
				if(selectedColor != null)
					label.setForeground(selectedColor);
			}
		}
	}
	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}
}
