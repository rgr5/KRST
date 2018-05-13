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
public class CalcTest7{
	/**
	 * Создание тестовых методов.
	 */
	Calculation CalcTest7;

    @BeforeEach
   void setUp() {
    	CalcTest7 = new Calculation();
    }
    @Test
   	void testn7() {
   		/**
   		 * Максимальная мощность 143.
   		 * Напряжение сети 220.
   		 * Необходимый коэффициент для расчёта 1.2.
   		 */
   		  float k7=(float)143,r7=(float) 220;
   			/**
   			   * итоговая проверка, tests и result1 сравниваются на равенство.
   			   */
   	    assertEquals((float)0.78, CalcTest7.sums(k7,r7));
   	   /**
   		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
   		*/
   	}
}