/**
 * объявление пакета
 */
package kr.KR;
/**
 * Импорт библиотек классов, необходимых для работы.
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
 * Объявление публичного класса, наследующего члены класса JFrame 
 */
public class main extends JFrame {
	/**
	 * Метод, отвечающий за запуск фрейма
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					/**
					 * Вывод сообщений в случае ошибки для дальнейшей отладки
					 */
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Объявление метода, в котором объявляются элементы экранной формы, ее события
	 */
	public main() {
		/**
		 * Создание главной панели
		 */
		TitledBorder titledBorder = BorderFactory.createTitledBorder(null, "Выберите необходимый вам калькулятор", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("times new roman",Font.PLAIN,15), Color.black);
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(titledBorder);
		JPanel Panel1 = new JPanel();
		Panel1.setBounds(50,15,500,650);
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(5,15,650,650);
		/**
		 * Задание шрифта и размера надписей для кнопок
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 25);
		/**
		 * Создание кнопки
		 */
		JButton btnNewButton1 = new JButton("Для жилых помещений");
		JButton btnNewButton2 = new JButton("Для производственных помещений");
		btnNewButton1.setFont(font);
		btnNewButton1.setBounds(1, 10, 620, 100);
		btnNewButton1.setFocusable(isDisplayable());
		btnNewButton2.setFont(font);
		btnNewButton2.setBounds(1,110, 620, 100);
		btnNewButton2.setFocusable(isDisplayable());
		/**
		 * Добавление элементов на панель для кнопки
		 */
		Panel2.add(btnNewButton1);
		Panel2.add(btnNewButton2);
		/**
		 * Добавление элементов на главную панель
		 */
		contentPane.add(Panel2);
		contentPane.add(Panel1);
		/**
		 * Указание размера, расположения, названия экранной формы, добавление на нее главной панели
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Расчет номинала предохранителей в электрической цепи");
		setContentPane(contentPane);
		setBounds(100, 100, 650, 280);	
		/**
		 * Событие для кнопки "Для жилых помещений". 
		 */
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Для жилых помещений")) {
					f2 calc = new f2();
				    }
			}
		});
		/**
		 * Событие для кнопки "Для производственных помещений". 
		 */
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Для производственных помещений")) {
					l2 calc = new l2();
				    }
			}
		});
	}
}