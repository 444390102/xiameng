package pojo;

public class Column {
	private int clId;
	private int clUserId; /* 用户id */
	private int clFuncId; /* 功能 0-进度看板，1-合同订单台账，2-业务员确认，3-业务审核，4-计划审核，5-生产计划台账，6-下达生产计划，7-下达包装计划，8-生产进度台账，9-发货信息台账，10-安排发货，11-发货业务确认，12-发货调度审核，13-发货物流确认 */
	private int clOrderBusiCheck;  /*订单业务审核*/
	private int clOrderPlanCheck; /* 订单生产审核 */
	private int clShipDispCheck;  /*发货调度审核*/
	private int clPreShipTime;   /*预计发货日期*/
	private int clContrNo;   /*合同号*/
	private int clClientName;   /*客户名称*/
	private int clSpec;   /*规格型号*/
	private int clNum;   /*数量*/
	private int clBrakeV;   /*制动器电压*/
	private int clWheelSpec;   /*曳引轮规格*/
	private int clRoom;   /*机房*/
	private int clConvType;   /*变频器型号*/
	private int clEncType;   /*编码器型号*/
	private int clCabLen;   /*电缆*/
	private int clBcabLen;   /*闸线*/
	private int clPlateInfo;   /*铭牌*/
	private int clRemark;   /*备注*/
	private int clOrderDate;   /*订单日期*/
	private int clMainV;   /*主机电压*/
	private int clMainC;   /*主机颜色*/
	private int clBrakeType;   /*制动器型号*/
	private int clLeftRight;   /*左、右置*/
	private int clPackSpec;   /*包装箱、低托规格*/
	private int clWorkerNo;   /*工号*/
	private int clManufact;   /*制造商*/
	private int clClientArea;   /*客户区域*/
	private int clMagSpec; /* 磁钢规格 */
	private int clBearSup; /* 轴承供应商 */
	private int clManuDate; /* 投产日期 */
	private int clManuCode; /* 投产编号 */
	private int clPackDate; /* 包装日期 */
	private int clPackCode; /* 出厂编号 */
	private int clCloBox; /* 合箱 */
	private int clTestMain; /* 检验 */
	private int clPackMain; /* 包装 */
	private int clInstoreMain; /* 入库 */
	private int clLogiAddr; /* 收货地址 */
	private int clLogiCont; /* 联系人 */
	private int clLogiTel; /* 电话 */
	private int clRealShipTime; /* 实际发货时间 */
	private int clLogiComp; /* 承运公司 */
	private int clLogiCode; /* 快递单号 */
	private int clLogiFedb; /* 回执编码 */
	private int clProcess; /* 生产进度 */
	
	public Column() {
		super();
	}
	
	public Column(int clUserId, int clFuncId) {
		super();
		this.clUserId = clUserId;
		this.clFuncId = clFuncId;
		
		this.clOrderBusiCheck = 1;this.clOrderPlanCheck = 1;this.clShipDispCheck = 1;this.clPreShipTime = 1;
		this.clContrNo = 1;this.clClientName = 1;this.clSpec = 1;this.clNum = 1;
		this.clBrakeV = 1;this.clWheelSpec = 1;this.clRoom = 1;this.clConvType = 1;
		this.clEncType = 1;this.clCabLen = 1;this.clBcabLen = 1;this.clPlateInfo = 1;
		this.clRemark = 1;this.clOrderDate = 1;this.clMainV = 1;this.clMainC = 1;
		this.clBrakeType = 1;this.clLeftRight = 1;this.clPackSpec = 1;this.clWorkerNo = 1;
		this.clManufact = 1;this.clClientArea = 1;this.clMagSpec = 1;this.clBearSup = 1;
		this.clManuDate = 1;this.clManuCode = 1;this.clPackDate = 1;this.clPackCode = 1;
		this.clCloBox = 1;this.clTestMain = 1;this.clPackMain = 1;this.clInstoreMain = 1;
		this.clLogiAddr = 1;this.clLogiCont = 1;this.clLogiTel = 1;this.clRealShipTime = 1;
		this.clLogiComp = 1;this.clLogiCode = 1;this.clLogiFedb = 1;this.clProcess = 1;
	}
	public int getClId() {
		return clId;
	}
	public void setClId(int clId) {
		this.clId = clId;
	}
	public int getClUserId() {
		return clUserId;
	}
	public void setClUserId(int clUserId) {
		this.clUserId = clUserId;
	}
	public int getClFuncId() {
		return clFuncId;
	}
	public void setClFuncId(int clFuncId) {
		this.clFuncId = clFuncId;
	}
	public int getClPreShipTime() {
		return clPreShipTime;
	}
	public void setClPreShipTime(int clPreShipTime) {
		this.clPreShipTime = clPreShipTime;
	}
	public int getClContrNo() {
		return clContrNo;
	}
	public void setClContrNo(int clContrNo) {
		this.clContrNo = clContrNo;
	}
	public int getClClientName() {
		return clClientName;
	}
	public void setClClientName(int clClientName) {
		this.clClientName = clClientName;
	}
	public int getClSpec() {
		return clSpec;
	}
	public void setClSpec(int clSpec) {
		this.clSpec = clSpec;
	}
	public int getClNum() {
		return clNum;
	}
	public void setClNum(int clNum) {
		this.clNum = clNum;
	}
	public int getClBrakeV() {
		return clBrakeV;
	}
	public void setClBrakeV(int clBrakeV) {
		this.clBrakeV = clBrakeV;
	}
	public int getClWheelSpec() {
		return clWheelSpec;
	}
	public void setClWheelSpec(int clWheelSpec) {
		this.clWheelSpec = clWheelSpec;
	}
	public int getClRoom() {
		return clRoom;
	}
	public void setClRoom(int clRoom) {
		this.clRoom = clRoom;
	}
	public int getClConvType() {
		return clConvType;
	}
	public void setClConvType(int clConvType) {
		this.clConvType = clConvType;
	}
	public int getClEncType() {
		return clEncType;
	}
	public void setClEncType(int clEncType) {
		this.clEncType = clEncType;
	}
	public int getClCabLen() {
		return clCabLen;
	}
	public void setClCabLen(int clCabLen) {
		this.clCabLen = clCabLen;
	}
	public int getClBcabLen() {
		return clBcabLen;
	}
	public void setClBcabLen(int clBcabLen) {
		this.clBcabLen = clBcabLen;
	}
	public int getClPlateInfo() {
		return clPlateInfo;
	}
	public void setClPlateInfo(int clPlateInfo) {
		this.clPlateInfo = clPlateInfo;
	}
	public int getClRemark() {
		return clRemark;
	}
	public void setClRemark(int clRemark) {
		this.clRemark = clRemark;
	}
	public int getClOrderDate() {
		return clOrderDate;
	}
	public void setClOrderDate(int clOrderDate) {
		this.clOrderDate = clOrderDate;
	}
	public int getClMainV() {
		return clMainV;
	}
	public void setClMainV(int clMainV) {
		this.clMainV = clMainV;
	}
	public int getClMainC() {
		return clMainC;
	}
	public void setClMainC(int clMainC) {
		this.clMainC = clMainC;
	}
	public int getClBrakeType() {
		return clBrakeType;
	}
	public void setClBrakeType(int clBrakeType) {
		this.clBrakeType = clBrakeType;
	}
	public int getClLeftRight() {
		return clLeftRight;
	}
	public void setClLeftRight(int clLeftRight) {
		this.clLeftRight = clLeftRight;
	}
	public int getClPackSpec() {
		return clPackSpec;
	}
	public void setClPackSpec(int clPackSpec) {
		this.clPackSpec = clPackSpec;
	}
	public int getClWorkerNo() {
		return clWorkerNo;
	}
	public void setClWorkerNo(int clWorkerNo) {
		this.clWorkerNo = clWorkerNo;
	}
	public int getClManufact() {
		return clManufact;
	}
	public void setClManufact(int clManufact) {
		this.clManufact = clManufact;
	}
	public int getClClientArea() {
		return clClientArea;
	}
	public void setClClientArea(int clClientArea) {
		this.clClientArea = clClientArea;
	}

	public int getClOrderBusiCheck() {
		return clOrderBusiCheck;
	}

	public void setClOrderBusiCheck(int clOrderBusiCheck) {
		this.clOrderBusiCheck = clOrderBusiCheck;
	}

	public int getClOrderPlanCheck() {
		return clOrderPlanCheck;
	}

	public void setClOrderPlanCheck(int clOrderPlanCheck) {
		this.clOrderPlanCheck = clOrderPlanCheck;
	}

	public int getClShipDispCheck() {
		return clShipDispCheck;
	}

	public void setClShipDispCheck(int clShipDispCheck) {
		this.clShipDispCheck = clShipDispCheck;
	}

	public int getClMagSpec() {
		return clMagSpec;
	}

	public void setClMagSpec(int clMagSpec) {
		this.clMagSpec = clMagSpec;
	}

	public int getClBearSup() {
		return clBearSup;
	}

	public void setClBearSup(int clBearSup) {
		this.clBearSup = clBearSup;
	}

	public int getClManuDate() {
		return clManuDate;
	}

	public void setClManuDate(int clManuDate) {
		this.clManuDate = clManuDate;
	}

	public int getClManuCode() {
		return clManuCode;
	}

	public void setClManuCode(int clManuCode) {
		this.clManuCode = clManuCode;
	}

	public int getClPackDate() {
		return clPackDate;
	}

	public void setClPackDate(int clPackDate) {
		this.clPackDate = clPackDate;
	}

	public int getClPackCode() {
		return clPackCode;
	}

	public void setClPackCode(int clPackCode) {
		this.clPackCode = clPackCode;
	}

	public int getClCloBox() {
		return clCloBox;
	}

	public void setClCloBox(int clCloBox) {
		this.clCloBox = clCloBox;
	}

	public int getClTestMain() {
		return clTestMain;
	}

	public void setClTestMain(int clTestMain) {
		this.clTestMain = clTestMain;
	}

	public int getClPackMain() {
		return clPackMain;
	}

	public void setClPackMain(int clPackMain) {
		this.clPackMain = clPackMain;
	}

	public int getClInstoreMain() {
		return clInstoreMain;
	}

	public void setClInstoreMain(int clInstoreMain) {
		this.clInstoreMain = clInstoreMain;
	}

	public int getClLogiAddr() {
		return clLogiAddr;
	}

	public void setClLogiAddr(int clLogiAddr) {
		this.clLogiAddr = clLogiAddr;
	}

	public int getClLogiCont() {
		return clLogiCont;
	}

	public void setClLogiCont(int clLogiCont) {
		this.clLogiCont = clLogiCont;
	}

	public int getClLogiTel() {
		return clLogiTel;
	}

	public void setClLogiTel(int clLogiTel) {
		this.clLogiTel = clLogiTel;
	}

	public int getClRealShipTime() {
		return clRealShipTime;
	}

	public void setClRealShipTime(int clRealShipTime) {
		this.clRealShipTime = clRealShipTime;
	}

	public int getClLogiComp() {
		return clLogiComp;
	}

	public void setClLogiComp(int clLogiComp) {
		this.clLogiComp = clLogiComp;
	}

	public int getClLogiCode() {
		return clLogiCode;
	}

	public void setClLogiCode(int clLogiCode) {
		this.clLogiCode = clLogiCode;
	}

	public int getClLogiFedb() {
		return clLogiFedb;
	}

	public void setClLogiFedb(int clLogiFedb) {
		this.clLogiFedb = clLogiFedb;
	}

	public int getClProcess() {
		return clProcess;
	}

	public void setClProcess(int clProcess) {
		this.clProcess = clProcess;
	}
	
	
}
