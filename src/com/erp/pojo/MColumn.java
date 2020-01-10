package pojo;

public class MColumn {
	private int clmId;
	private int clmUserId; /* 用户id */
	private int clmFuncId; 
	private int clmCata;  /* 物料类别 */
	private int clmCode;  /* 物料代码 */
	private int clmName;  /* 物料名称 */
	private int clmSpec;  /* 规格型号 */
	private int clmSupply;  /* 供应商 */
	private int clmUnit;  /* 单位 */
	private int clmLocation;  /* 配送位置 */
	private int clmAccount;  /* 套账 */
	private int clmLastDate;  /* 库存截止日期*/
	private int clmTotal;  /* 库存数*/
	private int clmToTest;  /* 待检数*/
	private int clmArriveDate;  /* 到货日期*/
	private int clmStoreUser;  /* 保管员*/
	private int clmStopNum;  /* 停用数量*/
	private int clmNoPass;  /* 不合格数*/
	private int clmToSend;  /* 待发数量*/
	private int clmRemark;  /* 备注*/
	private int clmBad;  /* 不良品*/
	private int clmMinNum;  /* 最小库存*/
	
	public MColumn() {
		super();
	}
	
	public MColumn(int clmUserId, int clmFuncId) {
		super();
		this.clmUserId = clmUserId;
		this.clmFuncId = clmFuncId;
		this.clmCata = 1;this.clmCode = 1;this.clmName = 1;this.clmSpec = 1;
		this.clmSupply = 1;this.clmUnit = 1;this.clmLocation = 1;this.clmAccount = 1;
		this.clmLastDate = 1;this.clmTotal = 1;this.clmToTest = 1;this.clmArriveDate = 1;
		this.clmStoreUser = 1;this.clmStopNum = 1;this.clmNoPass = 1;this.clmToSend = 1;
		this.clmRemark = 1;this.clmBad = 1;this.clmMinNum = 1;
	}
	
	public int getClmId() {
		return clmId;
	}
	public void setClmId(int clmId) {
		this.clmId = clmId;
	}
	public int getClmUserId() {
		return clmUserId;
	}
	public void setClmUserId(int clmUserId) {
		this.clmUserId = clmUserId;
	}
	public int getClmFuncId() {
		return clmFuncId;
	}
	public void setClmFuncId(int clmFuncId) {
		this.clmFuncId = clmFuncId;
	}
	public int getClmCata() {
		return clmCata;
	}
	public void setClmCata(int clmCata) {
		this.clmCata = clmCata;
	}
	public int getClmCode() {
		return clmCode;
	}
	public void setClmCode(int clmCode) {
		this.clmCode = clmCode;
	}
	public int getClmName() {
		return clmName;
	}
	public void setClmName(int clmName) {
		this.clmName = clmName;
	}
	public int getClmSpec() {
		return clmSpec;
	}
	public void setClmSpec(int clmSpec) {
		this.clmSpec = clmSpec;
	}
	public int getClmSupply() {
		return clmSupply;
	}
	public void setClmSupply(int clmSupply) {
		this.clmSupply = clmSupply;
	}
	public int getClmUnit() {
		return clmUnit;
	}
	public void setClmUnit(int clmUnit) {
		this.clmUnit = clmUnit;
	}
	public int getClmLocation() {
		return clmLocation;
	}
	public void setClmLocation(int clmLocation) {
		this.clmLocation = clmLocation;
	}
	public int getClmAccount() {
		return clmAccount;
	}
	public void setClmAccount(int clmAccount) {
		this.clmAccount = clmAccount;
	}

	public int getClmLastDate() {
		return clmLastDate;
	}

	public void setClmLastDate(int clmLastDate) {
		this.clmLastDate = clmLastDate;
	}

	public int getClmTotal() {
		return clmTotal;
	}

	public void setClmTotal(int clmTotal) {
		this.clmTotal = clmTotal;
	}

	public int getClmToTest() {
		return clmToTest;
	}

	public void setClmToTest(int clmToTest) {
		this.clmToTest = clmToTest;
	}

	public int getClmArriveDate() {
		return clmArriveDate;
	}

	public void setClmArriveDate(int clmArriveDate) {
		this.clmArriveDate = clmArriveDate;
	}

	public int getClmStoreUser() {
		return clmStoreUser;
	}

	public void setClmStoreUser(int clmStoreUser) {
		this.clmStoreUser = clmStoreUser;
	}

	public int getClmStopNum() {
		return clmStopNum;
	}

	public void setClmStopNum(int clmStopNum) {
		this.clmStopNum = clmStopNum;
	}

	public int getClmNoPass() {
		return clmNoPass;
	}

	public void setClmNoPass(int clmNoPass) {
		this.clmNoPass = clmNoPass;
	}

	public int getClmToSend() {
		return clmToSend;
	}

	public void setClmToSend(int clmToSend) {
		this.clmToSend = clmToSend;
	}

	public int getClmRemark() {
		return clmRemark;
	}

	public void setClmRemark(int clmRemark) {
		this.clmRemark = clmRemark;
	}

	public int getClmBad() {
		return clmBad;
	}

	public void setClmBad(int clmBad) {
		this.clmBad = clmBad;
	}

	public int getClmMinNum() {
		return clmMinNum;
	}

	public void setClmMinNum(int clmMinNum) {
		this.clmMinNum = clmMinNum;
	}
	
	
}
