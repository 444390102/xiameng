package pojo;

/*单价信息*/
public class FreightUnitPrice  {

	private int fId;
	private String fShippingCity;/*发送城市*/
	private String fReceivingCity;/*收货城市*/
	private double fClass1Weight;/*一阶*/
	private double fClass2Weight;/*二阶*/
	private double fClass3Weight;/*三阶*/
	private double fClass4Weight;/*四阶*/
	private double fClass5Weight;/*五阶*/
	private double fClass6Weight;/*六阶*/
	private double fClass7Weight;/*七阶*/
	private double fClass8Weight;/*八阶*/
	private double fClass9Weight;/*九阶*/
	private double fClass10Weight;/*十阶*/
	private String fOrderPersonDate;/*制单人以及日期*/
	private String fConfIrmingPersonDate;/*确认人以及日期*/
	private String fModifyInfOrmation;/*修改人以及日期*/
	private int fState;/*单价状态 : 0 待审核  1已审核 2停用*/

	public FreightUnitPrice() {
	}

	public FreightUnitPrice(int fId) {
		this.fId = fId;
	}

	public FreightUnitPrice(int fId, String fShippingCity,
			String fReceivingCity, double fClass1Weight, double fClass2Weight,
			double fClass3Weight, double fClass4Weight, double fClass5Weight,
			double fClass6Weight, double fClass7Weight, double fClass8Weight,
			double fClass9Weight, double fClass10Weight,
			String fOrderPersonDate, String fConfIrmingPersonDate,
			String fModifyInfOrmation) {
		this.fId = fId;
		this.fShippingCity = fShippingCity;
		this.fReceivingCity = fReceivingCity;
		this.fClass1Weight = fClass1Weight;
		this.fClass2Weight = fClass2Weight;
		this.fClass3Weight = fClass3Weight;
		this.fClass4Weight = fClass4Weight;
		this.fClass5Weight = fClass5Weight;
		this.fClass6Weight = fClass6Weight;
		this.fClass7Weight = fClass7Weight;
		this.fClass8Weight = fClass8Weight;
		this.fClass9Weight = fClass9Weight;
		this.fClass10Weight = fClass10Weight;
		this.fOrderPersonDate = fOrderPersonDate;
		this.fConfIrmingPersonDate = fConfIrmingPersonDate;
		this.fModifyInfOrmation = fModifyInfOrmation;
	}

	

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfShippingCity() {
		return fShippingCity;
	}

	public void setfShippingCity(String fShippingCity) {
		this.fShippingCity = fShippingCity;
	}

	public String getfReceivingCity() {
		return fReceivingCity;
	}

	public void setfReceivingCity(String fReceivingCity) {
		this.fReceivingCity = fReceivingCity;
	}

	public double getfClass1Weight() {
		return fClass1Weight;
	}

	public void setfClass1Weight(double fClass1Weight) {
		this.fClass1Weight = fClass1Weight;
	}

	public double getfClass2Weight() {
		return fClass2Weight;
	}

	public void setfClass2Weight(double fClass2Weight) {
		this.fClass2Weight = fClass2Weight;
	}

	public double getfClass3Weight() {
		return fClass3Weight;
	}

	public void setfClass3Weight(double fClass3Weight) {
		this.fClass3Weight = fClass3Weight;
	}

	public double getfClass4Weight() {
		return fClass4Weight;
	}

	public void setfClass4Weight(double fClass4Weight) {
		this.fClass4Weight = fClass4Weight;
	}

	public double getfClass5Weight() {
		return fClass5Weight;
	}

	public void setfClass5Weight(double fClass5Weight) {
		this.fClass5Weight = fClass5Weight;
	}

	public double getfClass6Weight() {
		return fClass6Weight;
	}

	public void setfClass6Weight(double fClass6Weight) {
		this.fClass6Weight = fClass6Weight;
	}

	public double getfClass7Weight() {
		return fClass7Weight;
	}

	public void setfClass7Weight(double fClass7Weight) {
		this.fClass7Weight = fClass7Weight;
	}

	public double getfClass8Weight() {
		return fClass8Weight;
	}

	public void setfClass8Weight(double fClass8Weight) {
		this.fClass8Weight = fClass8Weight;
	}

	public double getfClass9Weight() {
		return fClass9Weight;
	}

	public void setfClass9Weight(double fClass9Weight) {
		this.fClass9Weight = fClass9Weight;
	}

	public double getfClass10Weight() {
		return fClass10Weight;
	}

	public void setfClass10Weight(double fClass10Weight) {
		this.fClass10Weight = fClass10Weight;
	}

	public String getfOrderPersonDate() {
		return fOrderPersonDate;
	}

	public void setfOrderPersonDate(String fOrderPersonDate) {
		this.fOrderPersonDate = fOrderPersonDate;
	}

	public String getfConfIrmingPersonDate() {
		return fConfIrmingPersonDate;
	}

	public void setfConfIrmingPersonDate(String fConfIrmingPersonDate) {
		this.fConfIrmingPersonDate = fConfIrmingPersonDate;
	}

	public String getfModifyInfOrmation() {
		return fModifyInfOrmation;
	}

	public void setfModifyInfOrmation(String fModifyInfOrmation) {
		this.fModifyInfOrmation = fModifyInfOrmation;
	}

	public int getfState() {
		return fState;
	}

	public void setfState(int fState) {
		this.fState = fState;
	}

	public String getfStateStr(){
		return fState == 0 ? "待确认" : 
			fState == 1 ? "确认" : "停用";
	}

	

}