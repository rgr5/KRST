	/**
 * Объявление пакета, в котором находится класс.
 */
package kr.KR;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
/**
 * Добавление библиотеки для тестирования.
 */
import org.junit.jupiter.api.Test;
/**
 * Добавление библиотек пря проверки результата теста.
 */
public class CalcTest5{
	/**
	 * Создание тестовых методов.
	 */
	Calculation CalcTest5;

    @BeforeEach
   void setUp() {
    	CalcTest5 = new Calculation();
    }
    @Test
	void testn5() {
		/**
		 * Максимальная мощность 110.
		 * Напряжение сети 220.
		 * Необходимый коэффициент для расчёта 1.2.
		 */
		  float k5=(float)110,r5=(float) 220;
			/**
			   * итоговая проверка, tests и result1 сравниваются на равенство.
			   */
	    assertEquals((float)0.6, CalcTest5.sums(k5,r5));
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
	}
}