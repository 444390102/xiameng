package pojo;

public class SubOrder {
	private long sId;
	private long sOrderId;
	private String sMagSpec;   /*磁钢规格*/
	private String sBearSup;   /*轴承供应商*/
	private String sManuCheck;   /*生产审核*/
	private int sManuCheckUser;   /*生产业务审核人员*/
	private int sManuCheckResult;   /*生产业务审核结果*/
	private User sManuCheckUserEntity;
	private String sPackCheck;   /*包装审核*/
	private int sPackCheckUser;   /*包装业务审核人员*/
	private int sPackCheckResult;   /*包装业务审核结果*/
	private User sPackCheckUserEntity;
	private String sManuDate;   /*投产日期*/
	private String sManuDateF;
	private String sManuDateT;
	private String sManuCode;   /*投产编号*/
	private String sPackDate;   /*包装日期*/
	private String sPackDateF;
	private String sPackDateT;
	private String sPackCode;   /*出产编号*/
	private String sCloBox;   /*合箱扫码*/
	private int sCloBoxUser;   /*合箱扫码人员*/
	private User sCloBoxUserEntity;
	private String sTestMain;   /*检验扫码*/
	private int sTestMainUser;   /*检验扫码人员*/
	private User sTestMainUserEntity;
	private String sPackMain;   /*包装扫码*/
	private int sPackMainUser;   /*包装扫码人员*/
	private User sPackMainUserEntity;
	private String sInstoreMain;   /*入库扫码*/
	private int sInstoreMainUser;   /*入库扫码人员*/
	private User sInstoreMainUserEntity;
	private String sInStore;   /*入库确认*/
	private int sInStoreUser;   /*入库确认人员*/
	private User sInStoreEntity;
	private int sPause;  /*暂停 0-正常，1-暂停*/
	private String sPauseComm;  /*暂停原因*/
	private int sLogiTransFrom;/*！代表当前在哪个厂！*/
	private int sLogiTransArea;
	private String sLogiAddr;   /*收货地址*/
	private String sLogiCont;   /*收货人*/
	private String sLogiTel;   /*联系电话*/
	private String sRealShipTime;   /*实际发货日期*/
	private String sRealShipTimeF;
	private String sRealShipTimeT;
	private String sLogiComp;   /*承运公司*/
	private String sLogiCode;   /*快递单号*/
	private String sLogiFedb;   /*回执编码*/
	private String sLogiTime;   /*实际发货时间*/
	private String sShipPlanCofm;   /*发货信息确认*/
	private int sShipPlanCofmUser;   /*发货信息确认人员*/
	private String sShipBusiCofm;   /*发货业务确认*/
	private int sShipBusiCofmUser;   /*发货业务确认人员*/
	private User sShipBusiCofmUserEntity;
	private String sShipDispCheck;   /*发货调度审核*/
	private int sShipDispCheckUser;   /*发货调度审核人员*/
	private int sShipDispCheckResult;   /*发货调度审核结果*/
	private User sShipDispCheckUserEntity;
	private String sShipLogiCofm;   /*发货物流确认*/
	private int sShipLogiCofmUser;   /*发货物流确认人员*/
	private String sShipLogiCofmCofm;   /*发货物流确认的确认*/
	private int sShipLogiCofmCofmUser;   /*发货物流确认的确认人员*/
	private User sShipLogiCofmUserEntity;
	private String sShipedScan;   /*发货扫码时间*/
	private int sShipedScanUser;   /*发货扫码人员*/
	private User sShipedScanUserEntity;
	private String sReplace;
	private int sRecheck;
	private int sRecheckLogi;
	
	private Order orderEntity;
	private String keyword;
	private String what;
	
	private Test testEntity;
	
	public SubOrder() {
		sManuCheckResult = -1;
		sPackCheckResult = -1;
		sShipDispCheckResult = -1;
	}
	
	public long getsId() {
		return sId;
	}
	public void setsId(long sId) {
		this.sId = sId;
	}
	public long getsOrderId() {
		return sOrderId;
	}
	public void setsOrderId(long sOrderId) {
		this.sOrderId = sOrderId;
	}
	public String getsMagSpec() {
		return sMagSpec;
	}
	public void setsMagSpec(String sMagSpec) {
		this.sMagSpec = sMagSpec;
	}
	public String getsBearSup() {
		return sBearSup;
	}
	public void setsBearSup(String sBearSup) {
		this.sBearSup = sBearSup;
	}
	public String getsManuCheck() {
		return sManuCheck;
	}
	public void setsManuCheck(String sManuCheck) {
		this.sManuCheck = sManuCheck;
	}
	public int getsManuCheckUser() {
		return sManuCheckUser;
	}
	public void setsManuCheckUser(int sManuCheckUser) {
		this.sManuCheckUser = sManuCheckUser;
	}
	public int getsManuCheckResult() {
		return sManuCheckResult;
	}
	public void setsManuCheckResult(int sManuCheckResult) {
		this.sManuCheckResult = sManuCheckResult;
	}
	public String getsPackCheck() {
		return sPackCheck;
	}
	public void setsPackCheck(String sPackCheck) {
		this.sPackCheck = sPackCheck;
	}
	public int getsPackCheckUser() {
		return sPackCheckUser;
	}
	public void setsPackCheckUser(int sPackCheckUser) {
		this.sPackCheckUser = sPackCheckUser;
	}
	public int getsPackCheckResult() {
		return sPackCheckResult;
	}
	public void setsPackCheckResult(int sPackCheckResult) {
		this.sPackCheckResult = sPackCheckResult;
	}
	public String getsManuDate() {
		return sManuDate;
	}
	public void setsManuDate(String sManuDate) {
		this.sManuDate = sManuDate;
	}
	public String getsManuCode() {
		return sManuCode;
	}
	public void setsManuCode(String sManuCode) {
		this.sManuCode = sManuCode;
	}
	public String getsPackDate() {
		return sPackDate;
	}
	public void setsPackDate(String sPackDate) {
		this.sPackDate = sPackDate;
	}
	public String getsPackCode() {
		return sPackCode;
	}
	public void setsPackCode(String sPackCode) {
		this.sPackCode = sPackCode;
	}
	public String getsCloBox() {
		return sCloBox;
	}
	public void setsCloBox(String sCloBox) {
		this.sCloBox = sCloBox;
	}
	public int getsCloBoxUser() {
		return sCloBoxUser;
	}
	public void setsCloBoxUser(int sCloBoxUser) {
		this.sCloBoxUser = sCloBoxUser;
	}
	public String getsTestMain() {
		return sTestMain;
	}
	public void setsTestMain(String sTestMain) {
		this.sTestMain = sTestMain;
	}
	public int getsTestMainUser() {
		return sTestMainUser;
	}
	public void setsTestMainUser(int sTestMainUser) {
		this.sTestMainUser = sTestMainUser;
	}
	public String getsPackMain() {
		return sPackMain;
	}
	public void setsPackMain(String sPackMain) {
		this.sPackMain = sPackMain;
	}
	public int getsPackMainUser() {
		return sPackMainUser;
	}
	public void setsPackMainUser(int sPackMainUser) {
		this.sPackMainUser = sPackMainUser;
	}
	public int getsPause() {
		return sPause;
	}
	public void setsPause(int sPause) {
		this.sPause = sPause;
	}
	public String getsPauseComm() {
		return sPauseComm;
	}
	public void setsPauseComm(String sPauseComm) {
		this.sPauseComm = sPauseComm;
	}
	public String getsLogiAddr() {
		return sLogiAddr;
	}
	public void setsLogiAddr(String sLogiAddr) {
		this.sLogiAddr = sLogiAddr;
	}
	public String getsLogiCont() {
		return sLogiCont;
	}
	public void setsLogiCont(String sLogiCont) {
		this.sLogiCont = sLogiCont;
	}
	public String getsLogiTel() {
		return sLogiTel;
	}
	public void setsLogiTel(String sLogiTel) {
		this.sLogiTel = sLogiTel;
	}
	public String getsLogiCode() {
		return sLogiCode;
	}
	public void setsLogiCode(String sLogiCode) {
		this.sLogiCode = sLogiCode;
	}
	public String getsLogiFedb() {
		return sLogiFedb;
	}
	public void setsLogiFedb(String sLogiFedb) {
		this.sLogiFedb = sLogiFedb;
	}
	public String getsLogiTime() {
		return sLogiTime;
	}
	public void setsLogiTime(String sLogiTime) {
		this.sLogiTime = sLogiTime;
	}
	public String getsShipBusiCofm() {
		return sShipBusiCofm;
	}
	public void setsShipBusiCofm(String sShipBusiCofm) {
		this.sShipBusiCofm = sShipBusiCofm;
	}
	public int getsShipBusiCofmUser() {
		return sShipBusiCofmUser;
	}
	public void setsShipBusiCofmUser(int sShipBusiCofmUser) {
		this.sShipBusiCofmUser = sShipBusiCofmUser;
	}
	public String getsShipDispCheck() {
		return sShipDispCheck;
	}
	public void setsShipDispCheck(String sShipDispCheck) {
		this.sShipDispCheck = sShipDispCheck;
	}
	public int getsShipDispCheckUser() {
		return sShipDispCheckUser;
	}
	public void setsShipDispCheckUser(int sShipDispCheckUser) {
		this.sShipDispCheckUser = sShipDispCheckUser;
	}
	public int getsShipDispCheckResult() {
		return sShipDispCheckResult;
	}
	public void setsShipDispCheckResult(int sShipDispCheckResult) {
		this.sShipDispCheckResult = sShipDispCheckResult;
	}
	public String getsShipLogiCofm() {
		return sShipLogiCofm;
	}
	public void setsShipLogiCofm(String sShipLogiCofm) {
		this.sShipLogiCofm = sShipLogiCofm;
	}
	public int getsShipLogiCofmUser() {
		return sShipLogiCofmUser;
	}
	public void setsShipLogiCofmUser(int sShipLogiCofmUser) {
		this.sShipLogiCofmUser = sShipLogiCofmUser;
	}
	public String getsShipedScan() {
		return sShipedScan;
	}
	public void setsShipedScan(String sShipedScan) {
		this.sShipedScan = sShipedScan;
	}
	public int getsShipedScanUser() {
		return sShipedScanUser;
	}
	public void setsShipedScanUser(int sShipedScanUser) {
		this.sShipedScanUser = sShipedScanUser;
	}
	public Order getOrderEntity() {
		return orderEntity;
	}
	public void setOrderEntity(Order orderEntity) {
		this.orderEntity = orderEntity;
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
	public User getsManuCheckUserEntity() {
		return sManuCheckUserEntity;
	}
	public void setsManuCheckUserEntity(User sManuCheckUserEntity) {
		this.sManuCheckUserEntity = sManuCheckUserEntity;
	}
	public User getsPackCheckUserEntity() {
		return sPackCheckUserEntity;
	}
	public void setsPackCheckUserEntity(User sPackCheckUserEntity) {
		this.sPackCheckUserEntity = sPackCheckUserEntity;
	}
	public User getsCloBoxUserEntity() {
		return sCloBoxUserEntity;
	}
	public void setsCloBoxUserEntity(User sCloBoxUserEntity) {
		this.sCloBoxUserEntity = sCloBoxUserEntity;
	}
	public User getsTestMainUserEntity() {
		return sTestMainUserEntity;
	}
	public void setsTestMainUserEntity(User sTestMainUserEntity) {
		this.sTestMainUserEntity = sTestMainUserEntity;
	}
	public User getsPackMainUserEntity() {
		return sPackMainUserEntity;
	}
	public void setsPackMainUserEntity(User sPackMainUserEntity) {
		this.sPackMainUserEntity = sPackMainUserEntity;
	}
	public User getsShipBusiCofmUserEntity() {
		return sShipBusiCofmUserEntity;
	}
	public void setsShipBusiCofmUserEntity(User sShipBusiCofmUserEntity) {
		this.sShipBusiCofmUserEntity = sShipBusiCofmUserEntity;
	}
	public User getsShipDispCheckUserEntity() {
		return sShipDispCheckUserEntity;
	}
	public void setsShipDispCheckUserEntity(User sShipDispCheckUserEntity) {
		this.sShipDispCheckUserEntity = sShipDispCheckUserEntity;
	}
	public User getsShipLogiCofmUserEntity() {
		return sShipLogiCofmUserEntity;
	}
	public void setsShipLogiCofmUserEntity(User sShipLogiCofmUserEntity) {
		this.sShipLogiCofmUserEntity = sShipLogiCofmUserEntity;
	}
	public User getsShipedScanUserEntity() {
		return sShipedScanUserEntity;
	}
	public void setsShipedScanUserEntity(User sShipedScanUserEntity) {
		this.sShipedScanUserEntity = sShipedScanUserEntity;
	}
	public String getsManuDateF() {
		return sManuDateF;
	}
	public void setsManuDateF(String sManuDateF) {
		this.sManuDateF = sManuDateF;
	}
	public String getsManuDateT() {
		return sManuDateT;
	}
	public void setsManuDateT(String sManuDateT) {
		this.sManuDateT = sManuDateT;
	}
	public String getsPackDateF() {
		return sPackDateF;
	}
	public void setsPackDateF(String sPackDateF) {
		this.sPackDateF = sPackDateF;
	}
	public String getsPackDateT() {
		return sPackDateT;
	}
	public void setsPackDateT(String sPackDateT) {
		this.sPackDateT = sPackDateT;
	}
	public String getsInStore() {
		return sInStore;
	}
	public void setsInStore(String sInStore) {
		this.sInStore = sInStore;
	}
	public int getsInStoreUser() {
		return sInStoreUser;
	}
	public void setsInStoreUser(int sInStoreUser) {
		this.sInStoreUser = sInStoreUser;
	}
	public User getsInStoreEntity() {
		return sInStoreEntity;
	}
	public void setsInStoreEntity(User sInStoreEntity) {
		this.sInStoreEntity = sInStoreEntity;
	}

	public String getsInstoreMain() {
		return sInstoreMain;
	}

	public void setsInstoreMain(String sInstoreMain) {
		this.sInstoreMain = sInstoreMain;
	}

	public int getsInstoreMainUser() {
		return sInstoreMainUser;
	}

	public void setsInstoreMainUser(int sInstoreMainUser) {
		this.sInstoreMainUser = sInstoreMainUser;
	}

	public User getsInstoreMainUserEntity() {
		return sInstoreMainUserEntity;
	}

	public void setsInstoreMainUserEntity(User sInstoreMainUserEntity) {
		this.sInstoreMainUserEntity = sInstoreMainUserEntity;
	}

	public String getsLogiComp() {
		return sLogiComp;
	}

	public void setsLogiComp(String sLogiComp) {
		this.sLogiComp = sLogiComp;
	}

	public String getsRealShipTime() {
		return sRealShipTime;
	}

	public void setsRealShipTime(String sRealShipTime) {
		this.sRealShipTime = sRealShipTime;
	}

	public int getsLogiTransArea() {
		return sLogiTransArea;
	}

	public void setsLogiTransArea(int sLogiTransArea) {
		this.sLogiTransArea = sLogiTransArea;
	}

	public int getsLogiTransFrom() {
		return sLogiTransFrom;
	}

	public void setsLogiTransFrom(int sLogiTransFrom) {
		this.sLogiTransFrom = sLogiTransFrom;
	}

	public String getsReplace() {
		return sReplace;
	}

	public void setsReplace(String sReplace) {
		this.sReplace = sReplace;
	}

	public int getsRecheck() {
		return sRecheck;
	}

	public void setsRecheck(int sRecheck) {
		this.sRecheck = sRecheck;
	}

	public String getsShipPlanCofm() {
		return sShipPlanCofm;
	}

	public void setsShipPlanCofm(String sShipPlanCofm) {
		this.sShipPlanCofm = sShipPlanCofm;
	}

	public int getsShipPlanCofmUser() {
		return sShipPlanCofmUser;
	}

	public void setsShipPlanCofmUser(int sShipPlanCofmUser) {
		this.sShipPlanCofmUser = sShipPlanCofmUser;
	}

	public String getsShipLogiCofmCofm() {
		return sShipLogiCofmCofm;
	}

	public void setsShipLogiCofmCofm(String sShipLogiCofmCofm) {
		this.sShipLogiCofmCofm = sShipLogiCofmCofm;
	}

	public int getsShipLogiCofmCofmUser() {
		return sShipLogiCofmCofmUser;
	}

	public void setsShipLogiCofmCofmUser(int sShipLogiCofmCofmUser) {
		this.sShipLogiCofmCofmUser = sShipLogiCofmCofmUser;
	}

	public String getsRealShipTimeF() {
		return sRealShipTimeF;
	}

	public void setsRealShipTimeF(String sRealShipTimeF) {
		this.sRealShipTimeF = sRealShipTimeF;
	}

	public String getsRealShipTimeT() {
		return sRealShipTimeT;
	}

	public void setsRealShipTimeT(String sRealShipTimeT) {
		this.sRealShipTimeT = sRealShipTimeT;
	}

	public Test getTestEntity() {
		return testEntity;
	}

	public void setTestEntity(Test testEntity) {
		this.testEntity = testEntity;
	}

	public int getsRecheckLogi() {
		return sRecheckLogi;
	}

	public void setsRecheckLogi(int sRecheckLogi) {
		this.sRecheckLogi = sRecheckLogi;
	}
	
	
}
