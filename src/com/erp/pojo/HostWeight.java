package pojo;

/*主机信息*/
public class HostWeight {

	private int hId;/*主机编号*/
	private String hModel;/*主机类型*/
	private double hWeight;/*主机重量*/
	private String hOrderPersonDate;/*创建人以及时期*/
	private String hConfirmingPersonDate;/*确认人以及日期*/
	private String hModifyInformation;/*修改人以及日期*/
	private int hState;/*主机状态 0待审核  1已审核 2未审核*/

	public HostWeight() {
	}

	public HostWeight(String hModel, double hWeight, String hOrderPersonDate,
			String hConfirmingPersonDate, String hModifyInformation,
			int hState) {
		this.hModel = hModel;
		this.hWeight = hWeight;
		this.hOrderPersonDate = hOrderPersonDate;
		this.hConfirmingPersonDate = hConfirmingPersonDate;
		this.hModifyInformation = hModifyInformation;
		this.hState = hState;
	}

	public int gethId() {
		return hId;
	}

	public void sethId(int hId) {
		this.hId = hId;
	}

	public String gethModel() {
		return hModel;
	}

	public void sethModel(String hModel) {
		this.hModel = hModel;
	}

	public double gethWeight() {
		return hWeight;
	}

	public void sethWeight(double hWeight) {
		this.hWeight = hWeight;
	}

	public String gethOrderPersonDate() {
		return hOrderPersonDate;
	}

	public void sethOrderPersonDate(String hOrderPersonDate) {
		this.hOrderPersonDate = hOrderPersonDate;
	}

	public String gethConfirmingPersonDate() {
		return hConfirmingPersonDate;
	}

	public void sethConfirmingPersonDate(String hConfirmingPersonDate) {
		this.hConfirmingPersonDate = hConfirmingPersonDate;
	}

	public String gethModifyInformation() {
		return hModifyInformation;
	}

	public void sethModifyInformation(String hModifyInformation) {
		this.hModifyInformation = hModifyInformation;
	}

	public int gethState() {
		return hState;
	}

	public void sethState(int hState) {
		this.hState = hState;
	}
	
	public String gethStateStr(){
		return hState == 0 ? "待确认" : 
			hState == 1 ? "确认" : "停用";
	}
	

}