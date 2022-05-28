import static org.junit.Assert.*;

import org.junit.Test;

public class MolleStevenTest_A {

	@Test
	public void test() {
		//Risultato atteso
		MolleStevenClass mSC = new MolleStevenClass();
		int risAtteso = 60;
		int risOttenuto = mSC.molleMet(3, 5);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	public void test2() {
		//Risultato atteso
		MolleStevenClass mSC = new MolleStevenClass();
		int risAtteso = 720;
		int risOttenuto = mSC.molleMet(8, 10);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	public void test3() {
		//Risultato atteso
		MolleStevenClass mSC = new MolleStevenClass();
		int risAtteso = 336;
		int risOttenuto = mSC.molleMet(6, 8);
		assertEquals(risAtteso,risOttenuto);
	}

}
