// J-126
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;

public class AudioEx extends JFrame {
	private JButton btns[] = { new JButton("play"),
			new JButton("stop"),
			new JButton("play again")};
	private Clip clip;
	
	public AudioEx() {
		setTitle("AudioEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyActionListener al = new MyActionListener();
		for(int i=0; i<btns.length; i++) {
			c.add(btns[i]);
			btns[i].addActionListener(al);
		}
		setSize(300,150);
		setVisible(true);
		loadAudio("오디오파일");
	}
	private void loadAudio(String pathName) {
		try {
			clip = AudioSystem.getClip();
			File audioFile = new File(pathName);
			AudioInputStream audioStream =
					AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
		}
		catch (LineUnavailableException e) { e.printStackTrace(); }
		catch (UnsupportedAudioFileException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
	}
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
				case "play" : clip.start();
					break;
				case "stop" : clip.stop();
					break;
				case "play again" :
					clip.setFramePosition(0);
					clip.start();
					break;
			}
		}
	}
	public static void main(String [] args) {
		new AudioEx();
	}
}
