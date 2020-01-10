package pojo;

public class DSearch {
	private int id;
	private int userId;
	private int funcId; 
	private int delivCata;
	private int logiFedb;
	private int realShipTime;
	private int logiComp;
	private int fromCity;
	private int toCity;
	private int floatClaim;
	private int contrNo;
	private int clientName;
	private int spec;
	private int weight;
	private int manufact;
	private int manuCode;
	private int packCode;
	private int clientArea;
	private int logiAddr;
	private int logiCont;
	private int logiTel;
	private int logiCode;
	private int remark;
	
	public DSearch() {
		super();
	}
	
	public DSearch(int userId, int funcId) {
		super();
		this.userId = userId;
		this.funcId = funcId; 
		delivCata = 1;
		logiFedb = 1;
		realShipTime = 1;
		logiComp = 1;
		fromCity = 1;
		toCity = 1;
		contrNo = 1;
		clientName = 1;
		spec = 1;
		weight = 1;
		manufact = 1;
		manuCode = 1;
		packCode = 1;
		clientArea = 1;
		logiAddr = 1;
		logiCont = 1;
		logiTel = 1;
		logiCode = 1;
		floatClaim = 1;
		remark = 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFuncId() {
		return funcId;
	}

	public void setFuncId(int funcId) {
		this.funcId = funcId;
	}

	public int getDelivCata() {
		return delivCata;
	}

	public void setDelivCata(int delivCata) {
		this.delivCata = delivCata;
	}

	public int getLogiFedb() {
		return logiFedb;
	}

	public void setLogiFedb(int logiFedb) {
		this.logiFedb = logiFedb;
	}

	public int getRealShipTime() {
		return realShipTime;
	}

	public void setRealShipTime(int realShipTime) {
		this.realShipTime = realShipTime;
	}

	public int getLogiComp() {
		return logiComp;
	}

	public void setLogiComp(int logiComp) {
		this.logiComp = logiComp;
	}

	public int getFromCity() {
		return fromCity;
	}

	public void setFromCity(int fromCity) {
		this.fromCity = fromCity;
	}

	public int getToCity() {
		return toCity;
	}

	public void setToCity(int toCity) {
		this.toCity = toCity;
	}

	public int getFloatClaim() {
		return floatClaim;
	}

	public void setFloatClaim(int floatClaim) {
		this.floatClaim = floatClaim;
	}

	public int getContrNo() {
		return contrNo;
	}

	public void setContrNo(int contrNo) {
		this.contrNo = contrNo;
	}

	public int getClientName() {
		return clientName;
	}

	public void setClientName(int clientName) {
		this.clientName = clientName;
	}

	public int getSpec() {
		return spec;
	}

	public void setSpec(int spec) {
		this.spec = spec;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getManufact() {
		return manufact;
	}

	public void setManufact(int manufact) {
		this.manufact = manufact;
	}

	public int getManuCode() {
		return manuCode;
	}

	public void setManuCode(int manuCode) {
		this.manuCode = manuCode;
	}

	public int getPackCode() {
		return packCode;
	}

	public void setPackCode(int packCode) {
		this.packCode = packCode;
	}

	public int getClientArea() {
		return clientArea;
	}

	public void setClientArea(int clientArea) {
		this.clientArea = clientArea;
	}

	public int getLogiAddr() {
		return logiAddr;
	}

	public void setLogiAddr(int logiAddr) {
		this.logiAddr = logiAddr;
	}

	public int getLogiCont() {
		return logiCont;
	}

	public void setLogiCont(int logiCont) {
		this.logiCont = logiCont;
	}

	public int getLogiTel() {
		return logiTel;
	}

	public void setLogiTel(int logiTel) {
		this.logiTel = logiTel;
	}

	public int getLogiCode() {
		return logiCode;
	}

	public void setLogiCode(int logiCode) {
		this.logiCode = logiCode;
	}

	public int getRemark() {
		return remark;
	}

	public void setRemark(int remark) {
		this.remark = remark;
	}
	
	
	
}
