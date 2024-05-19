package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Login_Gui extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private JButton btnDangNhap;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Gui frame = new Login_Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Login_Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel imgProfile = new JLabel("");
		imgProfile.setBounds(231, 162, 52, 46);
		imgProfile.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/profile.png"));
		contentPane.add(imgProfile);

		JLabel imgKey = new JLabel("");
		imgKey.setBounds(231, 237, 67, 29);
		imgKey.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/key.png"));
		contentPane.add(imgKey);

		txtUser = new JTextField();
		txtUser.setBounds(314, 165, 298, 40);
		txtUser.setForeground(new Color(255, 255, 255));
		txtUser.setBackground(new Color(248, 248, 255));
		txtUser.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtUser.setPreferredSize(new Dimension(100, 30));
		txtUser.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(314, 226, 298, 40);
		txtPassword.setForeground(new Color(255, 255, 255));
		txtPassword.setBackground(new Color(248, 248, 255));
		txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPassword.setPreferredSize(new Dimension(100, 30));
		contentPane.add(txtPassword);

		btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setBounds(392, 292, 150, 35);
		btnDangNhap.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Main mainGui = new Main();
				mainGui.setVisible(true);
			}
		});

		btnDangNhap.setForeground(new Color(255, 255, 255));
		btnDangNhap.setBackground(new Color(255, 162, 78));
		btnDangNhap.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(btnDangNhap);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Hoc Tap\\Nam 3_HK2\\Project_PTUD\\QuanLyLopHocTinChi_Client\\src\\main\\java\\img\\iuh_logo.png"));
		lblNewLabel.setBounds(10, -11, 204, 256);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cổng thông tin sinh viên");
		lblNewLabel_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(346, 10, 241, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Đăng nhặp hệ thống");
		lblNewLabel_2.setForeground(new Color(30, 144, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(379, 97, 233, 29);
		contentPane.add(lblNewLabel_2);
	}

}
