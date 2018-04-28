/**
 * объявление пакета
 */
package kr.KR;
/**
 * Библиотеки необходимые для работы
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Объявление публичного класса для создания окна 
 */
public class ComponentForm2 {
	/**
	 * Описание компонентов формы
	 */
	JPanel contentPane;
	JPanel Panel1;
	JPanel Panel2;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JTextField TxtBox1;
	JTextField TxtBox2;
	JButton btnNewButton;
	/**
	 * Объявление метода, в котором объявляются элементы экранной формы
	 */
	@SuppressWarnings("deprecation")
	ComponentForm2() {
		/**
		 * Задание шрифта и размера надписей для кнопок, меток;
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 20);
		/**
		 * Создание и настройка компонентов формы
		 */
		JPanel Panel1 = new JPanel();
		TxtBox1=new JTextField("");
		TxtBox1.setFont(font);
		TxtBox1.setPreferredSize( new Dimension( 100, 24 ) );
		TxtBox2=new JTextField();
		TxtBox2.setFont(font);
		TxtBox2.setPreferredSize( new Dimension( 100, 24 ) );
		label_1=new JLabel("Максимальная мощность, Вт");
		label_1.setFont(font);
		label_2=new JLabel("Напряжение сети, В");
		label_2.setFont(font);
		label_3=new JLabel(" ");
		label_3.setFont(font);
		btnNewButton=new JButton("Расчитать");
		btnNewButton.setFont(font);
		Panel1 = new JPanel();
		/**
		 * Добавляем кнопку, текстовые поля и метки на панель
		 */
		Panel1.add(label_1);
		label_1.setBounds(50, 80, 350, 20);
        Panel1.add(TxtBox1);
        TxtBox1.setBounds(100, 200, 150, 100);
        Panel1.add(label_2);
        Panel1.add(TxtBox2);
        TxtBox2.setBounds(50, 80, 350, 20);
        TxtBox2.setText(String.valueOf(380));
		TxtBox2.disable();
        Panel1.add(btnNewButton);
        btnNewButton.setBounds(50, 20, 140, 40);
        Panel1.add(label_3);
        /**
		 * Помещаем панель на главный фрейм
		 */
		JFrame frame = new JFrame("Для производственных помещений");
		frame.setContentPane(Panel1);
		frame.pack();
		frame.setBounds(300,15,500,160);
		/**
		 * Отображаем окно
		 */
		frame.setVisible(true);
		frame.setResizable(false);
		/**
		 * Запрещаем ввод всего кроче цифр и backspace в текстовое поле
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
		 * Вызываем обработчик событий из класса l1
		 */
		MathForm2 calcEngine = new MathForm2(this);
		 btnNewButton.addActionListener(calcEngine);
	}
	/**
	 * Запускаем класс l2
	 */
	public static void main(String[] args) {
    }
}