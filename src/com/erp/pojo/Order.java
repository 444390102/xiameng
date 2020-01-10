package pojo;

import java.util.ArrayList;

public class Order {
	private long id;
	private String createTime;
	private int orderType; /* 订单类型 0-整机，1-配件，2-预投 */
	private int orderArea; /* 订单所属工厂 0-抚顺，1-浙江，2-佛山 */
	private String busiCofm; /* 业务确认 */
	private long busiCofmUser; /* 业务确认人员 */
	private User busicofmUserEntity;
	private String busiCheck; /* 业务审核 */
	private long busiCheckUser; /* 业务审核人员 */
	private long busiCheckResult; /* 业务审核结果 */
	private User busiCheckUserEntity;
	private String planCheck; /* 生产审核 */
	private long planCheckUser; /* 业务审核人员 */
	private long planCheckResult; /* 业务审核结果 */
	private User planCheckUserEntity;
	private String preShipTime; /* 预计发货日期 */
	private String preShipTimeF; /* 预计发货日期 */
	private String preShipTimeT; /* 预计发货日期 */
	private String contrNo; /* 合同号 */
	private String clientName; /* 客户名称 */
	private String spec; /* 规格型号 */
	private String spec_1; /* 规格型号 */
	private String spec_2; /* 规格型号 */
	private String spec_3; /* 规格型号 */
	private int num; /* 数量 */
	private String brakeV; /* 制动器电压 */
	private String wheelSpec; /* 曳引轮规格 */
	private String room; /* 机房 */
	private String convType; /* 变频器型号 */
	private String encType; /* 编码器型号 */
	private String cabLen; /* 电缆 */
	private String bcabLen; /* 闸线 */
	private String plateInfo; /* 铭牌 */
	private String remark; /* 备注 */
	private String orderDate; /* 订单日期 */
	private String orderDateF; /* 订单日期 */
	private String orderDateT; /* 订单日期 */
	private String mainV; /* 主机电压 */
	private String mainC; /* 主机颜色 */
	private String brakeType; /* 制动器型号 */
	private String leftRight; /* 左、右置 */
	private String packSpec; /* 包装箱、低托规格 */
	private String workerNo; /* 工号 */
	private String manufact; /* 制造商 */
	private String clientArea; /* 客户区域 */
	private String keyword;
	private String what;
	private String groupbySpec;
	
	private int finish; /* 完成的数量 */
	
	private int oRecheck;
	
	private ArrayList<SubOrder> subOrderList;
	
	public Order() {
		busiCheckResult = -1;
		planCheckResult = -1;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public int getOrderArea() {
		return orderArea;
	}
	public void setOrderArea(int orderArea) {
		this.orderArea = orderArea;
	}
	public String getBusiCofm() {
		return busiCofm;
	}
	public void setBusiCofm(String busiCofm) {
		this.busiCofm = busiCofm;
	}
	public long getBusiCofmUser() {
		return busiCofmUser;
	}
	public void setBusiCofmUser(long busiCofmUser) {
		this.busiCofmUser = busiCofmUser;
	}
	public User getBusicofmUserEntity() {
		return busicofmUserEntity;
	}
	public void setBusicofmUserEntity(User busicofmUserEntity) {
		this.busicofmUserEntity = busicofmUserEntity;
	}
	public String getBusiCheck() {
		return busiCheck;
	}
	public void setBusiCheck(String busiCheck) {
		this.busiCheck = busiCheck;
	}
	public long getBusiCheckUser() {
		return busiCheckUser;
	}
	public void setBusiCheckUser(long busiCheckUser) {
		this.busiCheckUser = busiCheckUser;
	}
	public long getBusiCheckResult() {
		return busiCheckResult;
	}
	public void setBusiCheckResult(long busiCheckResult) {
		this.busiCheckResult = busiCheckResult;
	}
	public User getBusiCheckUserEntity() {
		return busiCheckUserEntity;
	}
	public void setBusiCheckUserEntity(User busiCheckUserEntity) {
		this.busiCheckUserEntity = busiCheckUserEntity;
	}
	public String getPlanCheck() {
		return planCheck;
	}
	public void setPlanCheck(String planCheck) {
		this.planCheck = planCheck;
	}
	public long getPlanCheckUser() {
		return planCheckUser;
	}
	public void setPlanCheckUser(long planCheckUser) {
		this.planCheckUser = planCheckUser;
	}
	public long getPlanCheckResult() {
		return planCheckResult;
	}
	public void setPlanCheckResult(long planCheckResult) {
		this.planCheckResult = planCheckResult;
	}
	public User getPlanCheckUserEntity() {
		return planCheckUserEntity;
	}
	public void setPlanCheckUserEntity(User planCheckUserEntity) {
		this.planCheckUserEntity = planCheckUserEntity;
	}
	public String getPreShipTime() {
		return preShipTime;
	}
	public void setPreShipTime(String preShipTime) {
		this.preShipTime = preShipTime;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBrakeV() {
		return brakeV;
	}
	public void setBrakeV(String brakeV) {
		this.brakeV = brakeV;
	}
	public String getWheelSpec() {
		return wheelSpec;
	}
	public void setWheelSpec(String wheelSpec) {
		this.wheelSpec = wheelSpec;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getConvType() {
		return convType;
	}
	public void setConvType(String convType) {
		this.convType = convType;
	}
	public String getEncType() {
		return encType;
	}
	public void setEncType(String encType) {
		this.encType = encType;
	}
	public String getCabLen() {
		return cabLen;
	}
	public void setCabLen(String cabLen) {
		this.cabLen = cabLen;
	}
	public String getBcabLen() {
		return bcabLen;
	}
	public void setBcabLen(String bcabLen) {
		this.bcabLen = bcabLen;
	}
	public String getPlateInfo() {
		return plateInfo;
	}
	public void setPlateInfo(String plateInfo) {
		this.plateInfo = plateInfo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getMainV() {
		return mainV;
	}
	public void setMainV(String mainV) {
		this.mainV = mainV;
	}
	public String getMainC() {
		return mainC;
	}
	public void setMainC(String mainC) {
		this.mainC = mainC;
	}
	public String getBrakeType() {
		return brakeType;
	}
	public void setBrakeType(String brakeType) {
		this.brakeType = brakeType;
	}
	public String getLeftRight() {
		return leftRight;
	}
	public void setLeftRight(String leftRight) {
		this.leftRight = leftRight;
	}
	public String getPackSpec() {
		return packSpec;
	}
	public void setPackSpec(String packSpec) {
		this.packSpec = packSpec;
	}
	public String getWorkerNo() {
		return workerNo;
	}
	public void setWorkerNo(String workerNo) {
		this.workerNo = workerNo;
	}
	public String getManufact() {
		return manufact;
	}
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}
	public String getClientArea() {
		return clientArea;
	}
	public void setClientArea(String clientArea) {
		this.clientArea = clientArea;
	}
	public String getPreShipTimeF() {
		return preShipTimeF;
	}
	public void setPreShipTimeF(String preShipTimeF) {
		this.preShipTimeF = preShipTimeF;
	}
	public String getPreShipTimeT() {
		return preShipTimeT;
	}
	public void setPreShipTimeT(String preShipTimeT) {
		this.preShipTimeT = preShipTimeT;
	}
	public String getOrderDateF() {
		return orderDateF;
	}
	public void setOrderDateF(String orderDateF) {
		this.orderDateF = orderDateF;
	}
	public String getOrderDateT() {
		return orderDateT;
	}
	public void setOrderDateT(String orderDateT) {
		this.orderDateT = orderDateT;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}

	public ArrayList<SubOrder> getSubOrderList() {
		return subOrderList;
	}

	public void setSubOrderList(ArrayList<SubOrder> subOrderList) {
		this.subOrderList = subOrderList;
	}

	public int getoRecheck() {
		return oRecheck;
	}

	public void setoRecheck(int oRecheck) {
		this.oRecheck = oRecheck;
	}

	public int getFinish() {
		return finish;
	}

	public void setFinish(int finish) {
		this.finish = finish;
	}
	
	public String getSpec_1() {
		return spec_1;
	}

	public void setSpec_1(String spec_1) {
		this.spec_1 = spec_1;
	}

	public String getSpec_2() {
		return spec_2;
	}

	public void setSpec_2(String spec_2) {
		this.spec_2 = spec_2;
	}

	public String getSpec_3() {
		return spec_3;
	}

	public void setSpec_3(String spec_3) {
		this.spec_3 = spec_3;
	}

	public String getGroupbySpec() {
		return groupbySpec;
	}

	public void setGroupbySpec(String groupbySpec) {
		this.groupbySpec = groupbySpec;
	}
	
}
