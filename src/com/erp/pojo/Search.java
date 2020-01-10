package pojo;

public class Search {
	private int srId;
	private int srUserId; /* 用户id */
	private int srFuncId; /* 功能 0-进度看板，1-合同订单台账，2-业务员确认，3-业务审核，4-计划审核，5-生产计划台账，6-下达生产计划，7-下达包装计划，8-生产进度台账，9-发货信息台账，10-安排发货，11-发货业务确认，12-发货调度审核，13-发货物流确认，14-模板管理（订单），15-模板管理（计划），16-拆机置换，17-整机仓库 */
	private int srPreShipTime;   /*预计发货日期*/
	private int srRealShipTime;   /*预计发货日期*/
	private int srContrNo;   /*合同号*/
	private int srClientName;   /*客户名称*/
	private int srSpec;   /*规格型号*/
	private int srBrakeV;   /*制动器电压*/
	private int srWheelSpec;   /*曳引轮规格*/
	private int srRoom;   /*机房*/
	private int srConvType;   /*变频器型号*/
	private int srEncType;   /*编码器型号*/
	private int srCabLen;   /*电缆*/
	private int srBcabLen;   /*闸线*/
	private int srPlateInfo;   /*铭牌*/
	private int srRemark;   /*备注*/
	private int srOrderDate;   /*订单日期*/
	private int srMainV;   /*主机电压*/
	private int srMainC;   /*主机颜色*/
	private int srBrakeType;   /*制动器型号*/
	private int srLeftRight;   /*左、右置*/
	private int srPackSpec;   /*包装箱、低托规格*/
	private int srWorkerNo;   /*工号*/
	private int srManufact;   /*制造商*/
	private int srClientArea;   /*客户区域*/
	private int srMagSpec;   /*磁钢规格*/
	private int srBearSup;   /*轴承供应商*/
	private int srManuDate;   /*投产日期*/
	private int srPackDate;   /*包装日期*/
	
	private int srCloBox;
	private int srTestMain;
	private int srPackMain;
	private int srInstoreMain;
	   
	private int srLogiAddr;
	private int srLogiCont;
	private int srLogiTel;
	private int srLogiComp;
	private int srLogiCode;
	private int srLogiFedb;
	
	public Search() {
		super();
	}
	
	public Search(int srUserId, int srFuncId) {
		super();
		this.srUserId = srUserId;
		this.srFuncId = srFuncId;
		
		this.srPreShipTime = 1;this.srRealShipTime = 1;this.srContrNo = 1;this.srClientName = 1;
		this.srSpec = 1;this.srBrakeV = 1;this.srWheelSpec = 1;this.srRoom = 1;
		this.srConvType = 1;this.srEncType = 1;this.srCabLen = 1;this.srBcabLen = 1;
		this.srPlateInfo = 1;this.srRemark = 1;this.srOrderDate = 1;this.srMainV = 1;
		this.srMainC = 1;this.srBrakeType = 1;this.srLeftRight = 1;this.srPackSpec = 1;
		this.srWorkerNo = 1;this.srManufact = 1;this.srClientArea = 1;this.srMagSpec = 1;
		this.srBearSup = 1;this.srManuDate = 1;this.srPackDate = 1;
		
		this.srCloBox = 1;this.srTestMain = 1;this.srPackMain = 1;this.srInstoreMain = 1;
		
		this.srLogiAddr = 1;this.srLogiCont = 1;this.srLogiTel = 1;this.srLogiComp = 1;
		this.srLogiCode = 1;this.srLogiFedb = 1;
	}
	
	public int getSrId() {
		return srId;
	}
	public void setSrId(int srId) {
		this.srId = srId;
	}
	public int getSrUserId() {
		return srUserId;
	}
	public void setSrUserId(int srUserId) {
		this.srUserId = srUserId;
	}
	public int getSrFuncId() {
		return srFuncId;
	}
	public void setSrFuncId(int srFuncId) {
		this.srFuncId = srFuncId;
	}
	public int getSrPreShipTime() {
		return srPreShipTime;
	}
	public void setSrPreShipTime(int srPreShipTime) {
		this.srPreShipTime = srPreShipTime;
	}
	public int getSrContrNo() {
		return srContrNo;
	}
	public void setSrContrNo(int srContrNo) {
		this.srContrNo = srContrNo;
	}
	public int getSrClientName() {
		return srClientName;
	}
	public void setSrClientName(int srClientName) {
		this.srClientName = srClientName;
	}
	public int getSrSpec() {
		return srSpec;
	}
	public void setSrSpec(int srSpec) {
		this.srSpec = srSpec;
	}
	public int getSrBrakeV() {
		return srBrakeV;
	}
	public void setSrBrakeV(int srBrakeV) {
		this.srBrakeV = srBrakeV;
	}
	public int getSrWheelSpec() {
		return srWheelSpec;
	}
	public void setSrWheelSpec(int srWheelSpec) {
		this.srWheelSpec = srWheelSpec;
	}
	public int getSrRoom() {
		return srRoom;
	}
	public void setSrRoom(int srRoom) {
		this.srRoom = srRoom;
	}
	public int getSrConvType() {
		return srConvType;
	}
	public void setSrConvType(int srConvType) {
		this.srConvType = srConvType;
	}
	public int getSrEncType() {
		return srEncType;
	}
	public void setSrEncType(int srEncType) {
		this.srEncType = srEncType;
	}
	public int getSrCabLen() {
		return srCabLen;
	}
	public void setSrCabLen(int srCabLen) {
		this.srCabLen = srCabLen;
	}
	public int getSrBcabLen() {
		return srBcabLen;
	}
	public void setSrBcabLen(int srBcabLen) {
		this.srBcabLen = srBcabLen;
	}
	public int getSrPlateInfo() {
		return srPlateInfo;
	}
	public void setSrPlateInfo(int srPlateInfo) {
		this.srPlateInfo = srPlateInfo;
	}
	public int getSrRemark() {
		return srRemark;
	}
	public void setSrRemark(int srRemark) {
		this.srRemark = srRemark;
	}
	public int getSrOrderDate() {
		return srOrderDate;
	}
	public void setSrOrderDate(int srOrderDate) {
		this.srOrderDate = srOrderDate;
	}
	public int getSrMainV() {
		return srMainV;
	}
	public void setSrMainV(int srMainV) {
		this.srMainV = srMainV;
	}
	public int getSrMainC() {
		return srMainC;
	}
	public void setSrMainC(int srMainC) {
		this.srMainC = srMainC;
	}
	public int getSrBrakeType() {
		return srBrakeType;
	}
	public void setSrBrakeType(int srBrakeType) {
		this.srBrakeType = srBrakeType;
	}
	public int getSrLeftRight() {
		return srLeftRight;
	}
	public void setSrLeftRight(int srLeftRight) {
		this.srLeftRight = srLeftRight;
	}
	public int getSrPackSpec() {
		return srPackSpec;
	}
	public void setSrPackSpec(int srPackSpec) {
		this.srPackSpec = srPackSpec;
	}
	public int getSrWorkerNo() {
		return srWorkerNo;
	}
	public void setSrWorkerNo(int srWorkerNo) {
		this.srWorkerNo = srWorkerNo;
	}
	public int getSrManufact() {
		return srManufact;
	}
	public void setSrManufact(int srManufact) {
		this.srManufact = srManufact;
	}
	public int getSrClientArea() {
		return srClientArea;
	}
	public void setSrClientArea(int srClientArea) {
		this.srClientArea = srClientArea;
	}

	public int getSrMagSpec() {
		return srMagSpec;
	}

	public void setSrMagSpec(int srMagSpec) {
		this.srMagSpec = srMagSpec;
	}

	public int getSrBearSup() {
		return srBearSup;
	}

	public void setSrBearSup(int srBearSup) {
		this.srBearSup = srBearSup;
	}

	public int getSrManuDate() {
		return srManuDate;
	}

	public void setSrManuDate(int srManuDate) {
		this.srManuDate = srManuDate;
	}

	public int getSrPackDate() {
		return srPackDate;
	}

	public void setSrPackDate(int srPackDate) {
		this.srPackDate = srPackDate;
	}

	public int getSrCloBox() {
		return srCloBox;
	}

	public void setSrCloBox(int srCloBox) {
		this.srCloBox = srCloBox;
	}

	public int getSrTestMain() {
		return srTestMain;
	}

	public void setSrTestMain(int srTestMain) {
		this.srTestMain = srTestMain;
	}

	public int getSrPackMain() {
		return srPackMain;
	}

	public void setSrPackMain(int srPackMain) {
		this.srPackMain = srPackMain;
	}

	public int getSrInstoreMain() {
		return srInstoreMain;
	}

	public void setSrInstoreMain(int srInstoreMain) {
		this.srInstoreMain = srInstoreMain;
	}

	public int getSrLogiAddr() {
		return srLogiAddr;
	}

	public void setSrLogiAddr(int srLogiAddr) {
		this.srLogiAddr = srLogiAddr;
	}

	public int getSrLogiCont() {
		return srLogiCont;
	}

	public void setSrLogiCont(int srLogiCont) {
		this.srLogiCont = srLogiCont;
	}

	public int getSrLogiTel() {
		return srLogiTel;
	}

	public void setSrLogiTel(int srLogiTel) {
		this.srLogiTel = srLogiTel;
	}

	public int getSrLogiComp() {
		return srLogiComp;
	}

	public void setSrLogiComp(int srLogiComp) {
		this.srLogiComp = srLogiComp;
	}

	public int getSrLogiCode() {
		return srLogiCode;
	}

	public void setSrLogiCode(int srLogiCode) {
		this.srLogiCode = srLogiCode;
	}

	public int getSrLogiFedb() {
		return srLogiFedb;
	}

	public void setSrLogiFedb(int srLogiFedb) {
		this.srLogiFedb = srLogiFedb;
	}

	public int getSrRealShipTime() {
		return srRealShipTime;
	}

	public void setSrRealShipTime(int srRealShipTime) {
		this.srRealShipTime = srRealShipTime;
	}
	
}
