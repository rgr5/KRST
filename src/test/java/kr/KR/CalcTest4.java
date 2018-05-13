	/**
 * Объявление пакета, в котором находится класс.
 */
package kr.KR;

import static org.junit.jupiter.api.Assertions.assertFalse;

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
    @BeforeEach
   void setUp() {
    	new ComponentForm();
    }
	@Test
	void testn4() {
			/**
			   * Проверяем ли есть возможность масштабировать главную форму.
			   */
		assertFalse(ComponentForm.frame.isResizable());
	}
}