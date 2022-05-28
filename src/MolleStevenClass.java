/**
 * 
 * @author <B>Steven Molle</B>
 * <U>4*BI</U>
 * <I>28/05/2022</I>
 *
 */
public class MolleStevenClass {
	/**
	 * Creazione Costruttore vuoto
	 */
	public MolleStevenClass(){}
	/**
	 * Creazione del metodo per calcola un numero di fattori
	 * @param s = indice iniziale
	 * @param f = indifce finale
	 * @return r = intervalli
	 */
	
	
	/**
	 * L'errore era nell'impostare l'indice uguale a 1
	 * mettendolo l'indice "i" uguale all'intervallo iniziale
	 * e moltiplicando per r si ottiene il valore corretto
	 */
	public int molleMet(int s,int f)
	{
		int r = 0;
		for(int i=s;i<f;i++)
		{
			r = s * f * i;
		}
		return r;
	}
	/**
	 * Creazione del main
	 */
	public static void main(String[]args)
	{
		MolleStevenClass mSC = new MolleStevenClass();
		System.out.println(mSC.molleMet(5, 7));
	}
}
