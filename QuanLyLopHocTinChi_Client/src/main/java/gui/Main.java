package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	private JTextField txtTmKim;

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
		getContentPane().setBackground(new Color(220, 220, 220));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(0, 92, 517, 224);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MSSV:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(120, 25, 47, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("20036851");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(198, 29, 80, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblHVTn = new JLabel("Họ và tên:");
		lblHVTn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblHVTn.setBounds(120, 54, 73, 29);
		panel.add(lblHVTn);
		
		JLabel lblNewLabel_2_1 = new JLabel("Giới tính:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(120, 80, 73, 29);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ngày sinh:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_2.setBounds(120, 107, 73, 29);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(System.getProperty("user.dir") +  "/src/main/java/img/8.PNG"));
		lblNewLabel_4.setBounds(10, 44, 73, 76);
		panel.add(lblNewLabel_4);
		
		JLabel lblLpHc = new JLabel("Lớp học:");
		lblLpHc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLpHc.setBounds(303, 25, 73, 29);
		panel.add(lblLpHc);
		
		JLabel lblKhaHc = new JLabel("Khóa học:");
		lblKhaHc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblKhaHc.setBounds(303, 54, 73, 29);
		panel.add(lblKhaHc);
		
		JLabel lblBcoTo = new JLabel("Bậc đào tạo:");
		lblBcoTo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBcoTo.setBounds(303, 80, 79, 29);
		panel.add(lblBcoTo);
		
		JLabel lblLoiHnho = new JLabel("Loại hình đào tạo:");
		lblLoiHnho.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblLoiHnho.setBounds(303, 107, 114, 29);
		panel.add(lblLoiHnho);
		
		JLabel lblNiSng = new JLabel("Nơi sống:");
		lblNiSng.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNiSng.setBounds(120, 142, 73, 29);
		panel.add(lblNiSng);
		
		JLabel lblNghnh = new JLabel("Nghành:");
		lblNghnh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNghnh.setBounds(303, 142, 47, 29);
		panel.add(lblNghnh);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hồ Đức Lâm");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1.setBounds(198, 60, 80, 21);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nam");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_2.setBounds(198, 84, 80, 21);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("24/08/2002");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_3.setBounds(198, 111, 80, 21);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Khánh Hòa");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_4.setBounds(198, 146, 80, 21);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("DHKTPM16B");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_5.setBounds(392, 29, 80, 21);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("2020-2024");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_6.setBounds(392, 58, 80, 21);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Đại học");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_7.setBounds(392, 84, 80, 21);
		panel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Chính quy");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_8.setBounds(402, 111, 80, 21);
		panel.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Kỹ thuật phần mềm");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_9.setBounds(360, 146, 135, 21);
		panel.add(lblNewLabel_1_9);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 517, 21);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Thông tin sinh viên");
		lblNewLabel_5.setForeground(new Color(128, 128, 128));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(27, 0, 164, 21);
		panel_4.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(248, 248, 255));
		panel_1.setBounds(10, 403, 171, 89);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		 
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(System.getProperty("user.dir") +  "/src/main/java/img/5.PNG"));
		lblNewLabel_3.setBounds(60, 22, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Đăng ký học phần");
		btnNewButton.setBackground(new Color(248, 248, 255));
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 45, 151, 21);
		panel_1.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(248, 248, 255));
		panel_1_1.setBounds(253, 403, 165, 89);
		getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBackground(new Color(30, 144, 255));
		lblNewLabel_3_1.setIcon(new ImageIcon(System.getProperty("user.dir") +  "/src/main/java/img/flag.PNG"));
		lblNewLabel_3_1.setBounds(51, 22, 30, 14);
		panel_1_1.add(lblNewLabel_3_1);
		
		JButton btnXemKtQu = new JButton("Xem kết quả học tập");
		btnXemKtQu.setForeground(new Color(30, 144, 255));
		btnXemKtQu.setBackground(new Color(248, 248, 255));
		btnXemKtQu.setBounds(10, 46, 151, 21);
		panel_1_1.add(btnXemKtQu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 248, 255));
		panel_2.setBounds(593, 157, 341, 118);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nhắc nhở mới, chưa xem");
		lblNewLabel_2.setBounds(32, 10, 182, 22);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(248, 248, 255));
		panel_1_1_1.setBounds(517, 403, 145, 89);
		getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(53, 20, 45, 13);
		panel_1_1_1.add(lblNewLabel_3_2);
		
		JButton btnLchTheoTun = new JButton("Lịch theo tuần");
		btnLchTheoTun.setForeground(new Color(30, 144, 255));
		btnLchTheoTun.setBackground(new Color(248, 248, 255));
		btnLchTheoTun.setBounds(10, 43, 125, 21);
		panel_1_1_1.add(btnLchTheoTun);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(new Color(248, 248, 255));
		panel_1_1_2.setBounds(735, 403, 171, 89);
		getContentPane().add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBounds(65, 23, 45, 13);
		panel_1_1_2.add(lblNewLabel_3_3);
		
		JButton btnTraCuCng = new JButton("Tra cứu công nợ");
		btnTraCuCng.setForeground(new Color(30, 144, 255));
		btnTraCuCng.setBackground(new Color(248, 248, 255));
		btnTraCuCng.setBounds(10, 46, 151, 21);
		panel_1_1_2.add(btnTraCuCng);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(248, 248, 255));
		panel_3.setBounds(0, 10, 948, 63);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		txtTmKim = new JTextField();
		txtTmKim.setText("Tìm kiếm");
		txtTmKim.setBounds(167, 26, 253, 27);
		panel_3.add(txtTmKim);
		txtTmKim.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Avatar");
		lblNewLabel_4_1.setBounds(669, 0, 73, 63);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(System.getProperty("user.dir") +  "/src/main/java/img/logo1.PNG"));
		lblNewLabel_4_1_1.setBounds(10, 0, 82, 63);
		panel_3.add(lblNewLabel_4_1_1);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setForeground(new Color(255, 69, 0));
		btnLogOut.setBackground(new Color(248, 248, 255));
		btnLogOut.setBounds(777, 21, 103, 21);
		panel_3.add(btnLogOut);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 517, 948, 49);
		getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Địa chỉ: 12 Nguyễn Văn Bảo, Phường 04, Quận Gò Vấp, Tp. Hồ Chí Minh");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 10, 652, 29);
		panel_5.add(lblNewLabel_6);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 613);
	}
}
