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
public class CalcTest2{
	/**
	 * Создание тестовых методов.
	 */
	Calculation CalcTest2;

    @BeforeEach
   void setUp() {
    	CalcTest2 = new Calculation();
    }
    @Test
	void testn2() {
	    /**
		 * Максимальная мощность 760.
		 * Напряжение сети 380.
		 * Необхожимый коэфицент для расчёта 1.2.
		 */
		  float k2=(float)760,r2=(float) 380;
			/**
			   * итоговая проверка, tests и result2 сравниваниются на равенство.
			   */
		assertEquals((float)2.4, CalcTest2.sums(k2,r2));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
	}
}