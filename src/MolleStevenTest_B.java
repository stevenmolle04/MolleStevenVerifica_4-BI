import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MolleStevenTest_B {
	MolleStevenClass mSC;
	@Before
	public void before()
	{
		mSC = new MolleStevenClass();
	}
	@Test
	public void test() {
		//Risultato atteso 60
		int risAtteso = 60;
		int risOttenuto = mSC.molleMet(3, 5);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	public void test2() {
		//Risultato atteso 720
		int risAtteso = 720;
		int risOttenuto = mSC.molleMet(8, 10);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	public void test3() {
		//Risultato atteso 336
		int risAtteso = 336;
		int risOttenuto = mSC.molleMet(6, 8);
		assertEquals(risAtteso,risOttenuto);
	}

}
