package kr.KR;

import junit.framework.TestCase;
import kr.KR.form1;

public class AppTest extends TestCase {
  public void testAdds1() {
	  //Максимальная мощность 300
	  // Напряжение сети 220
	  float k1=(float)300,r1=(float) ((300*1.2)/220);
	  //result1-значение из функции sums,расположеной в классе form1
		float result1=form1.sums(k1,r1);
		// tests - итоговое значение
		float tests= (float) 1.6363636;
		//итоговая проверка
    assertEquals(tests, result1);
  }
  public void testAdds2() {
	//Максимальная мощность 300
	  // Напряжение сети 380
	  float k1=(float)300,r1=(float) ((300*1.2)/380);
	//result2-значение из функции sums,расположеной в классе form2
		float result2=form2.sums(k1,r1);
		// tests - итоговое значение
		float tests= (float)0.94736844;
		//итоговая проверка
    assertEquals(tests, result2);
  }
}