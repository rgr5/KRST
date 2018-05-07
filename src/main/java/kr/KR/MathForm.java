/**
 * объявление пакета
 */
package kr.KR;
/**
 * Библиотеки необходимые для работы
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Объявление публичного класса для создания зависимости между классами и выполнение вычислений 
 */
public class MathForm implements ActionListener {
	/**
	 * Ссылка на родительский класс
	 */
	private ComponentForm parent;
	/**
	 * Переменные отвечающие за вычисление:
	 *k1-Вводимая максимальная мощность
	 *r1-Заранее заданное напряжение сети
	 *result-Результат вычислений
	 */
	float k1;
	float r1;
	float result;
	/**
	 * Установление связи между родительским и дочерним классом
	 */
	MathForm(ComponentForm parent){
        this.parent = parent;
    }
	/**
	 * Событие для кнопки "Рассчитать", для производственных помещений.
	 */
	public void actionPerformed(ActionEvent e)  {
		try {
		/**
		 * Создание объекта прослушивающего нажатие кнопок
		 */
        Object src = e.getSource();
        /**
    	 *Условие  для прослушиваемой кнопки
    	 */
        if (src == parent.btnNewButton){
        	/**
        	 * Ссчитывание введенно максимальной мощности
        	 */
			Float k1=Float.parseFloat((parent.TxtBox1.getText( )));
			/**
			 * Считывание заранее заданного напряжения сети
			 */
			Float r1=Float.parseFloat((parent.TxtBox2.getText( )));
			/**
			 * Вычисление напряжения в сети с помощью специальной функции расчёта
			 */
			result=Calculation.sums(k1, r1);
			/**
			 * Вввод результатов на экранную форму
			 */
			parent.label_3.setText(" Результат: " +  String.format("%.2f",result )+" Ампер ");
        } 
	}
		catch(Exception ex) {
			JOptionPane.showMessageDialog(new JFrame(),ex.getMessage(), "ОШИБКА",JOptionPane.ERROR_MESSAGE);
    	}
	}
		
}