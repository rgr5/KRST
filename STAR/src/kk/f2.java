/**
 * ���������� ������
 */
package kk;
/**
 * ���������� ����������� ��� ������
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * ���������� ���������� ������ ��� �������� ���� 
 */
public class f2 {
	/**
	 * �������� ����������� �����
	 */
	JPanel contentPane;
	JPanel Panel1;
	JPanel Panel2;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JFormattedTextField TxtBox1;
	JFormattedTextField TxtBox2;
	JButton btnNewButton;
	/**
	 * ���������� ������, � ������� ����������� �������� �������� �����
	 */
	f2() {
		/**
		 * ������� ������ � ������� �������� ��� ������, �����;
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 20);
		/**
		 * �������� � ��������� ����������� �����
		 */
		JPanel Panel1 = new JPanel();
		TxtBox1=new JFormattedTextField("");
		TxtBox1.setFont(font);
		TxtBox1.setPreferredSize( new Dimension( 100, 24 ) );
		TxtBox2=new JFormattedTextField();
		TxtBox2.setFont(font);
		TxtBox2.setPreferredSize( new Dimension( 100, 24 ) );
		label_1=new JLabel("������������ ��������, ��");
		label_1.setFont(font);
		label_2=new JLabel("���������� ����, �");
		label_2.setFont(font);
		label_3=new JLabel(" ");
		label_3.setFont(font);
		btnNewButton=new JButton("���������");
		btnNewButton.setFont(font);
		Panel1 = new JPanel();
		/**
		 * ��������� ������, ��������� ���� � ����� �� ������
		 */
		Panel1.add(label_1);
		label_1.setBounds(50, 80, 350, 20);
        Panel1.add(TxtBox1);
        TxtBox1.setBounds(100, 200, 150, 100);
        Panel1.add(label_2);
        Panel1.add(TxtBox2);
        TxtBox2.setBounds(50, 80, 350, 20);
        TxtBox2.setText(String.valueOf(220));
		TxtBox2.disable();
        Panel1.add(btnNewButton);
        btnNewButton.setBounds(50, 20, 140, 40);
        Panel1.add(label_3);
        /**
		 * �������� ������ �� ������� �����
		 */
		JFrame frame = new JFrame("��� ����� ���������");
		frame.setContentPane(Panel1);
		frame.pack();
		frame.setBounds(300,15,500,160);
		/**
		 * ���������� ����
		 */
		frame.setVisible(true);
		frame.setResizable(false);
		/**
		 * ��������� ���� ����� ����� ���� � backspace � ��������� ����
		 */
		TxtBox1.addKeyListener(new KeyAdapter() {
			   public void keyTyped(KeyEvent e) {
			      char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
			         e.consume();  
			      }
			   }
			});
		/**
		 * �������� ���������� ������� �� ������ f1
		 */
		f1 calcEngine = new f1(this);
		 btnNewButton.addActionListener(calcEngine);
		
	}
	/**
	 * ��������� ����� f2
	 */
	public static void main(String[] args) {
       f2 calc = new f2();
    }
}