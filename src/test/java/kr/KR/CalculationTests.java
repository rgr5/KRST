/**
 * Объявление пакета, в котором находится класс.
 */
package kr.KR;
/**
 * Добавление библиотеки для тестирования.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
/**
 * Добавление библиотеки для тестирования.
 */
import org.junit.jupiter.api.Test;
/**
 * Добавление библиотек пря проверки результата теста.
 */
/**
 * Создание класса для тестирования номинала напряжения в электрической цепи.
 */
public class CalculationTests {
	CalculationTests testingClass;

    @BeforeEach
   void setUp() {
        testingClass = new CalculationTests();
    }
	/**
	 * Создание тестовых методов.
	 */
	@Test
	void testn1() {
		/**
		 * Максимальная мощность 300.
		 * Напряжение сети 220.
		 * Необхожимый коэфицент для расчёта 1.2.
		 */
		  float k1=(float)330,r1=220;
			/**
			   * итоговая проверка
			   */
	    assertEquals((float)1.8, Calculation.sums(k1, r1));
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
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
		assertEquals((float)2.4, Calculation.sums(k2,r2));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
	}
	@Test
	void testn3() {
		/**
		 * Максимальная мощность 5500.
		 * Напряжение сети 220.
		 * Необходимый коэффициент для расчёта 1.2.
		 */
		  float k3=(float)5500,r3=220;
			/**
			   * итоговая проверка, tests и result1 сравниваются на равенство.
			   */
	    assertEquals((float)30,Calculation.sums(k3,r3));
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
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
		assertEquals((float)0.6,Calculation.sums(k4,r4));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
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
	    assertEquals((float)0.6, Calculation.sums(k5,r5));
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
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
		assertEquals((float)24,Calculation.sums(k6,r6));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
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
	    assertEquals((float)0.78, Calculation.sums(k7,r7));
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
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
		assertEquals((float)18, Calculation.sums(k8,r8));
		/**
		* Окончание теста расчёта номинала в электрической цепи для производственных помещений.
		*/
		
	}
	/**
	 * Окончание создания класса для расчёта номинала в электрической цепи для жилых помещений.
	 */	
}