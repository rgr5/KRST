/**
 * ���������� ������
 */
package kk;
/**
 * ������ ��������� �������, ����������� ��� ������.
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * ���������� ���������� ������, ������������ ����� ������ JFrame 
 */
public class main extends JFrame {
	/**
	 * �����, ���������� �� ������ ������
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					/**
					 * ����� ��������� � ������ ������ ��� ���������� �������
					 */
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * ���������� ������, � ������� ����������� �������� �������� �����, �� �������
	 */
	public main() {
		/**
		 * �������� ������� ������
		 */
		TitledBorder titledBorder = BorderFactory.createTitledBorder(null, "�������� ����������� ��� �����������", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("times new roman",Font.PLAIN,15), Color.black);
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(titledBorder);
		JPanel Panel1 = new JPanel();
		Panel1.setBounds(50,15,500,650);
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(5,15,650,650);
		/**
		 * ������� ������ � ������� �������� ��� ������
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 25);
		/**
		 * �������� ������
		 */
		JButton btnNewButton1 = new JButton("��� ����� ���������");
		JButton btnNewButton2 = new JButton("��� ���������������� ���������");
		btnNewButton1.setFont(font);
		btnNewButton1.setBounds(1, 10, 620, 100);
		btnNewButton1.setFocusable(isDisplayable());
		btnNewButton2.setFont(font);
		btnNewButton2.setBounds(1,110, 620, 100);
		btnNewButton2.setFocusable(isDisplayable());
		/**
		 * ���������� ��������� �� ������ ��� ������
		 */
		Panel2.add(btnNewButton1);
		Panel2.add(btnNewButton2);
		/**
		 * ���������� ��������� �� ������� ������
		 */
		contentPane.add(Panel2);
		contentPane.add(Panel1);
		/**
		 * �������� �������, ������������, �������� �������� �����, ���������� �� ��� ������� ������
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("������ �������� ��������������� � ������������� ����");
		setContentPane(contentPane);
		setBounds(100, 100, 650, 280);	
		/**
		 * ������� ��� ������ "��� ����� ���������". 
		 */
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("��� ����� ���������")) {
					f2 calc = new f2();
				    }
			}
		});
		/**
		 * ������� ��� ������ "��� ���������������� ���������". 
		 */
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("��� ���������������� ���������")) {
					l2 calc = new l2();
				    }
			}
		});
	}
}