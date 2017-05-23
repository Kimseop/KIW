

/**
 * @author K family
 * @version 1.0
 * @created 19-5-2017 ¿ÀÀü 11:07:33
 */
public class CarInsurance extends Insurance {

	private String CarClass;
	private int CarDamage;
	private int CarDistance;
	private int CarModeYear;
	private String CarName;
	private String EmergencyScarambleServ;
	private int PhysicalDamage;
	public CarUse m_CarUse;
	public CarAccidentExp m_CarAccidentExp;

	public CarInsurance(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}