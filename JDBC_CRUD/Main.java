package test;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	JScrollPane scrollPane = new JScrollPane();
	AddrDAO dao = new AddrDAO();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 842);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_1106063681514200");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 0, 866, 200);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름:");
		lblNewLabel.setBounds(12, 32, 36, 15);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(46, 29, 96, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("나이:");
		lblNewLabel_1.setBounds(178, 34, 50, 15);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 31, 96, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("주소:");
		lblNewLabel_2.setBounds(12, 73, 50, 15);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(48, 71, 266, 21);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("연락처:");
		lblNewLabel_3.setBounds(12, 117, 50, 15);
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(57, 115, 57, 21);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 115, 55, 21);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(193, 116, 59, 21);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("이메일:");
		lblNewLabel_4.setBounds(12, 163, 50, 15);
		panel_1.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(54, 160, 259, 21);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("성별:");
		lblNewLabel_5.setBounds(407, 89, 50, 15);
		panel_1.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(448, 84, 113, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(593, 85, 113, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(0, 210, 866, 85);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"N", "AGE", "GENDER", "address", "tel", "mail"}));
		comboBox.setBounds(156, 23, 63, 23);
		panel_2.add(comboBox);
		
		textField_7 = new JTextField();
		textField_7.setBounds(241, 25, 346, 21);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("조회");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String category = (String)comboBox.getSelectedItem();
				String text = textField_7.getText();
				
				ArrayList<AddrDTO> list = dao.selectOne(category, text);
				String[][] data = new String[list.size()][6];
				String[] col = {"이름", "나이", "성별", "주소", "전화번호", "이메일"};
				int i = 0;
				for(AddrDTO dto : list) {
					data[i][0] = dto.getN();
					data[i][1] = dto.getAge()+"";
					data[i][2] = dto.getGender();
					data[i][3] = dto.getAddress();
					data[i][4] = dto.getTel();
					data[i][5] = dto.getMail();
					i++;
				}
				table = new JTable(data, col);
				scrollPane.setViewportView(table);
			}
		});
		btnNewButton.setBounds(596, 25, 91, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("전체조회");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(scrollPane);
			}
		});
		btnNewButton_1.setBounds(704, 25, 91, 23);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 305, 866, 341);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		scrollPane.setBounds(0, 10, 866, 321);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		show(scrollPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBounds(0, 663, 866, 122);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("등록");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField.getText();
				int age = Integer.parseInt(textField_1.getText());
				String address = textField_2.getText();
				String tel = textField_3.getText()+"-"+textField_4.getText()+"-"+textField_5.getText();
				String mail = textField_6.getText();
				String gender ="";
				if(rdbtnNewRadioButton.isSelected()) {
					gender = "Male";
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					gender = "Female";
				}
				dao.insert(n, age, gender, address, tel, mail);
				show(scrollPane);
			}
		});
		btnNewButton_2.setBounds(147, 47, 91, 23);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("수정");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textField.getText();
				int age = Integer.parseInt(textField_1.getText());
				String address = textField_2.getText();
				String tel = textField_3.getText()+"-"+textField_4.getText()+"-"+textField_5.getText();
				String mail = textField_6.getText();
				String gender ="";
				if(rdbtnNewRadioButton.isSelected()) {
					gender = "Male";
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					gender = "Female";
				}
				int row = table.getSelectedRow();
				String key_n = (String)table.getModel().getValueAt(row, 0);
				
				dao.update(n, age, gender, address, tel, mail, key_n);
				show(scrollPane);
			}
		});
		btnNewButton_3.setBounds(302, 47, 91, 23);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("삭제");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				String n = (String)table.getModel().getValueAt(row, 0);
				dao.delete(n);
				show(scrollPane);
			}
		});
		btnNewButton_4.setBounds(488, 47, 91, 23);
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("종료");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_5.setBounds(661, 47, 91, 23);
		panel_4.add(btnNewButton_5);
	}
	public void show(JScrollPane scrollPane) {
		AddrDAO dao = new AddrDAO();
		ArrayList<AddrDTO> list = dao.select();
		String[][] data = new String[list.size()][6];
		String[] col = {"이름", "나이", "성별", "주소", "전화번호", "이메일"};
		int i = 0;
		for(AddrDTO dto : list) {
			data[i][0] = dto.getN();
			data[i][1] = dto.getAge()+"";
			data[i][2] = dto.getGender();
			data[i][3] = dto.getAddress();
			data[i][4] = dto.getTel();
			data[i][5] = dto.getMail();
			i++;
		}
		table = new JTable(data, col);
		scrollPane.setViewportView(table);
	}
}
