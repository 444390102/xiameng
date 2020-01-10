package pojo;

public class DelivMain {
	
	private long id;
	private long subOrderId;
	private String logiFedb;  /*回执编码*/
	private String contrNo;  /*合同号*/
	private String clientName;  /*客户名称*/
	private String spec;  /*规格型号*/
	private float weight;    /*主机总重*/
	private String manufact;  /*制造商*/
	private String manuCode;  /*投产编号*/
	private String packCode;  /*出产编号*/
	private String clientArea;  /*客户区域*/
	private String logiAddr;  /*收货地址*/
	private String logiCont;  /*收货人*/
	private String logiTel;  /*联系电话*/
	private String logiCode;  /*快递单号*/
	private String remark;  /*备注*/
	private float targetWeight;/*确认后的主机重量*/

	
	
	public float getTargetWeight() {
		return targetWeight;
	}
	public void setTargetWeight(float targetWeight) {
		this.targetWeight = targetWeight;
	}
	public DelivMain() {}
	public DelivMain(long id, String logiFedb, String contrNo, String clientName, String spec,
			float weight, String manufact, String manuCode, String packCode, String clientArea, String logiAddr,
			String logiCont, String logiTel, String logiCode, String remark) {
		super();
		this.id = id;
		this.logiFedb = logiFedb;
		this.contrNo = contrNo;
		this.clientName = clientName;
		this.spec = spec;
		this.weight = weight;
		this.manufact = manufact;
		this.manuCode = manuCode;
		this.packCode = packCode;
		this.clientArea = clientArea;
		this.logiAddr = logiAddr;
		this.logiCont = logiCont;
		this.logiTel = logiTel;
		this.logiCode = logiCode;
		this.remark = remark;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSubOrderId() {
		return subOrderId;
	}
	public void setSubOrderId(long subOrderId) {
		this.subOrderId = subOrderId;
	}
	public String getLogiFedb() {
		return logiFedb;
	}
	public void setLogiFedb(String logiFedb) {
		this.logiFedb = logiFedb;
	}
	public String getContrNo() {
		return contrNo;
	}
	public void setContrNo(String contrNo) {
		this.contrNo = contrNo;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getManufact() {
		return manufact;
	}
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}
	public String getManuCode() {
		return manuCode;
	}
	public void setManuCode(String manuCode) {
		this.manuCode = manuCode;
	}
	public String getPackCode() {
		return packCode;
	}
	public void setPackCode(String packCode) {
		this.packCode = packCode;
	}
	public String getClientArea() {
		return clientArea;
	}
	public void setClientArea(String clientArea) {
		this.clientArea = clientArea;
	}
	public String getLogiAddr() {
		return logiAddr;
	}
	public void setLogiAddr(String logiAddr) {
		this.logiAddr = logiAddr;
	}
	public String getLogiCont() {
		return logiCont;
	}
	public void setLogiCont(String logiCont) {
		this.logiCont = logiCont;
	}
	public String getLogiTel() {
		return logiTel;
	}
	public void setLogiTel(String logiTel) {
		this.logiTel = logiTel;
	}
	public String getLogiCode() {
		return logiCode;
	}
	public void setLogiCode(String logiCode) {
		this.logiCode = logiCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
