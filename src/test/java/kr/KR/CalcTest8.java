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
public class CalcTest8{
	/**
	 * Создание тестовых методов.
	 */
	Calculation CalcTest8;

    @BeforeEach
   void setUp() {
    	CalcTest8 = new Calculation();
    }
    @Test
	void testn8() {
	    /**
		 * Максимальная мощность 5700.
		 * Напряжение сети 380.
		 * Необходимый коэффициент для расчёта 1.2.
		 */
		  float k8=(float)5700,r8=(float) 380;
			/**
			   * итоговая проверка, tests и result2 сравниваются на равенство.
			   */
		assertEquals((float)18, CalcTest8.sums(k8,r8));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
		
	}
}