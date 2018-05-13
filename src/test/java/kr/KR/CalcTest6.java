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
public class CalcTest6{
	/**
	 * Создание тестовых методов.
	 */
	Calculation CalcTest6;

    @BeforeEach
   void setUp() {
    	CalcTest6 = new Calculation();
    }
    @Test
	void testn6() {
	    /**
		 * Максимальная мощность 7600.
		 * Напряжение сети 380.
		 * Необходимый коэффициент для расчёта 1.2.
		 */
		  float k6=(float)7600,r6=(float) 380;
			/**
			   * итоговая проверка, tests и result2 сравниваются на равенство.
			   */
		assertEquals((float)24,CalcTest6.sums(k6,r6));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
	}
}