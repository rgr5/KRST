/**
 * объявление пакета
 */
package kr.KR;
/**
 * Библиотеки необходимые для работы
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Объявление публичного класса для создания зависимости между классами и выполнение вычислений 
 */
public class f1 implements ActionListener {
	float result;
	/**
	 * ссылка на родительский класс
	 */
	private f2 parent;
	/**
	 * Переменные отвечающие за вычисление:
	 *k1-Вводимая максимальная мощность
	 *r1-Результат вычислений
	 */
	float k1;
	float r1;
	/**
	 * Установление связи между родительским и дочерним классом
	 */
	f1(f2 parent){
        this.parent = parent;
    }
	/**
	 * Событие для кнопки "Рассчитать", для производственных помещений.
	 */
	public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == parent.btnNewButton){
        	k1=Float.parseFloat((String) parent.TxtBox1.getValue());
        	//r1= Float.parseFloat((String) parent.TxtBox2.getValue());
			r1= (float) ((k1*1.2)/220);
			//sum_n.setText(""+ (result= Calculation.Calc_n(int_rad,sumok)));
			//result=Calculation.sums(k1, r1);
			parent.label_3.setText(" Результат: "+ String.format("%.2f",r1 )+ " Ампер ");
			//System.out.println(r1);
        } 
	}
	
	

}