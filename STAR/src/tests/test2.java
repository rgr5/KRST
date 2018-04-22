/**
 * ���������� ������, � ������� ��������� �����.
 */
package tests;
/**
 * ���������� ���������� ��� ������������.
 */
import static org.junit.jupiter.api.Assertions.*;
/**
 * ���������� ���������� ��� ������������.
 */
import org.junit.jupiter.api.Test;
/**
 * ���������� ��������� ��� �������� ���������� �����.
 */
import junit.framework.Assert;
/**
 * ���������� ������� ���������� ������� ���������� ��� ���������������� ���������.
 */
import kk.l1;
/**
 * �������� ������ ��� ������������ �������� ���������� � ������������� ����.
 */
public class test2 {
	/**
	 * �������� �������� �������.
	 */
	@Test
	/**
	 * ������ ����� ������� �������� � ������������� ���� ��� ���������������� ���������.
	 */
	void test2() {
		/**
		 * ������������ �������� 300.
		 * ���������� ���� 220.
		 * ����������� ��������� ��� ������� 1.2.
		 */
		  float k1=(float)760,r1=(float) ((k1*1.2)/380);
		  /**
		   * result1-�������� �� ������� sums,������������ � ������ l1.
		   */
			float result2=l1.sums(k1,r1);
			/**
			 * tests -�������� ��������.
			 */
			float tests= (float)2.4;
			/**
			   * �������� ��������, tests � result2 �������������� �� ���������.
			   */
		Assert.assertEquals(tests, result2);
		/**
		* ��������� ����� ������� �������� � ������������� ���� ��� ���������������� ���������.
		*/
	}
	/**
	 * ��������� �������� ������ ��� ������� �������� � ������������� ���� ��� ���������������� ���������.
	 */	
}