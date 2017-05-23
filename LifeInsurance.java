

/**
 * @author K family
 * @version 1.0
 * @created 19-5-2017 ¿ÀÀü 11:07:33
 */
public class LifeInsurance extends Insurance {

	private enum LifePaymentMethod{};
	private enum MedicalTranscription{};
	public SilsonMedicalInsurance m_SilsonMedicalInsurance;
	public InsuredHelth m_InsuredHelth;

	public LifeInsurance(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}