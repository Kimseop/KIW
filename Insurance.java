import java.util.List;

/**
 * 보험료 계산식
 * 
 * 보험료 = (보상금 * 확률 * 1.1) / (보험기간(년) * 12)
 * 
 * 확률은 나이, 성별, 직업군, 병력에 대한 확률을 임의로 계산하여 정한다.
 * @author K family
 * @version 1.0
 * @param <CompensationAmountinfo>
 * @param <상품개발테스트목록>
 * @param <TargetUserInfo>
 * @param <string>
 * @created 19-5-2017 오전 11:07:33
 */
public class Insurance<Compensation, CompensationAmountinfo, 상품개발테스트목록, TargetUserInfo, string> {

	private int ID;
	private String Incaution;
	private String Inexplanation;
	private String Inname;
	private String Insuranceeligibilitystatus;
	private int insuranceFee;
	public MemInfo m_MemInfo;
	public CompensationAmountinfo m_CompensationAmountinfo;
	public 상품개발테스트목록 m_상품개발테스트목록;
	public productInfo m_productInfo;

	public Insurance(){

	}

	public void finalize() throws Throwable {

	}

	public void getID(){

	}

	public void setAdd(){

	}

	/**
	 * 
	 * @param UserInfo
	 */
	public void setCalculate(TargetUserInfo UserInfo){

	}

	/**
	 * 
	 * @param List
	 */
	public void setCallLiset(List List){

	}

	public void setCheck(){

	}

	public void setConfirmed(){

	}

	/**
	 * 
	 * @param Description
	 */
	public void setDescription(string Description){

	}

	public void setFixed(){

	}

	/**
	 * 
	 * @param id
	 */
	public void setID(int id){

	}

	/**
	 * 
	 * @param MedicalHistory
	 */
	public void setMedicalHistory(String MedicalHistory){

	}

	/**
	 * 
	 * @param Name
	 */
	public void setName(String Name){

	}

	public void setOutput(){

	}

	public void setProvision(){

	}

	public void setRefusal(){

	}

	public void setReInput(){

	}

	public void setSaved(){

	}

	/**
	 * 
	 * @param Insurance
	 */
	public void setSelect(Insurance Insurance){

	}

	/**
	 * 
	 * @param sex
	 */
	public void setSex(String sex){

	}

	public void setShow(){

	}

}