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
public class CalcTest4{
	/**
	 * Создание тестовых методов.
	 */
	Calculation CalcTest4;

    @BeforeEach
   void setUp() {
    	CalcTest4 = new Calculation();
    }
	@Test
	void testn4() {
	    /**
		 * Максимальная мощность 190.
		 * Напряжение сети 380.
		 * Необходимый коэффициент для расчёта 1.2.
		 */
		  float k4=(float)190,r4=(float) 380;
			/**
			   * итоговая проверка, tests и result2 сравниваются на равенство.
			   */
		assertEquals((float)0.6,CalcTest4.sums(k4,r4));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
	}
}