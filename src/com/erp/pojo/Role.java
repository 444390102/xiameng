package pojo;

public class Role {
	private int rId;
	private String rName;

	private int rOrderBoard;
	private int rModelOrder;
	private int rModelOrderE;
	private int rModelOrderD;
	private int rClient;
	private int rClientE;
	private int rBusiCofm;
	private int rBusiCofmE;
	private int rBusiCheck;
	private int rBusiCheckE; /* 业务审核 */
	private int rPlanCheck;
	private int rPlanCheckE; /* 计划审核 */

	private int rPlanBoard;
	private int rModelPlan;
	private int rModelPlanE;
	private int rModelPlanD;
	private int rPlanBusiCofm;
	private int rPlanBusiCofmE;
	private int rReplace;
	private int rLaunManu;
	private int rLaunManuP;
	private int rLaunManuC; /* 下达生产计划 */
	private int rLaunPack;
	private int rLaunPackP;
	private int rLaunPackC; /* 下达包装计划 */

	private int rFactoryBoard;
	private int rFactoryBoardE;
	private int rCloseScan; /* 合箱扫码 */
	private int rTestScan; /* 检验扫码 */
	private int rPackScan; /* 包装扫码 */
	private int rInstoreScan; /* 入库扫码 */

	private int rMainStore; /* 整机仓库 */
	private int rHalfStore; /* 半成品库 */
	private int rMainIn; /* 成品入库 */
	private int rMartStore; /* 材料仓库 */
	private int rMartMana; /* 材料管理 */
	private int rMartIn; /* 材料入库 */
	private int rMartInTest; /* 材料入库-合格检验 */
	private int rMartInLimit; /* 材料入库-限定用户 */
	private int rMartOutAdd; /* 材料出库 */
	private int rMartOutDel; /* 材料出库 */
	private int rMartOutCofm; /* 材料出库 */

	private int rLogiBoard;
	private int rShipPlan;
	private int rShipPlanE; /* 安排发货 */
	private int rShipBusiCofm;
	private int rShipBusiCofmE; /* 发货业务确认 */
	private int rShipDispCheck;
	private int rShipDispCheckE; /* 发货调度审核 */
	private int rShipLogiCofm;
	private int rShipLogiCofmE; /* 发货物流确认 */
	private int rShipLogiToShip;
	private int rShipLogiToShipE; /* 待发货 */
	private int rShipScan; /* 发货扫码 */

	private int rSysMana; /* 权限管理 */
	
	private int rDelivCofm;
	private int rDelivRecofm;
	private int rDelivCheck;
	private int rDelivRecheck;
	private int rDelivAccount;
	private int rDelivReaccount;
	   
	private int rDelivmanaCofm;
	private int rDelivmanaEdit;
	private int rDelivmanaAdd;
	private int rDelivmanaImport;
	private int rDelivmanaDisable;
	private int rDelivmanaEnable;
	private int rDelivmanaUpdate;

	private String info;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public int getrOrderBoard() {
		return rOrderBoard;
	}

	public void setrOrderBoard(int rOrderBoard) {
		this.rOrderBoard = rOrderBoard;
	}

	public int getrModelOrder() {
		return rModelOrder;
	}

	public void setrModelOrder(int rModelOrder) {
		this.rModelOrder = rModelOrder;
	}

	public int getrModelOrderE() {
		return rModelOrderE;
	}

	public void setrModelOrderE(int rModelOrderE) {
		this.rModelOrderE = rModelOrderE;
	}

	public int getrModelOrderD() {
		return rModelOrderD;
	}

	public void setrModelOrderD(int rModelOrderD) {
		this.rModelOrderD = rModelOrderD;
	}

	public int getrClient() {
		return rClient;
	}

	public void setrClient(int rClient) {
		this.rClient = rClient;
	}

	public int getrClientE() {
		return rClientE;
	}

	public void setrClientE(int rClientE) {
		this.rClientE = rClientE;
	}

	public int getrBusiCofm() {
		return rBusiCofm;
	}

	public void setrBusiCofm(int rBusiCofm) {
		this.rBusiCofm = rBusiCofm;
	}

	public int getrBusiCofmE() {
		return rBusiCofmE;
	}

	public void setrBusiCofmE(int rBusiCofmE) {
		this.rBusiCofmE = rBusiCofmE;
	}

	public int getrBusiCheck() {
		return rBusiCheck;
	}

	public void setrBusiCheck(int rBusiCheck) {
		this.rBusiCheck = rBusiCheck;
	}

	public int getrBusiCheckE() {
		return rBusiCheckE;
	}

	public void setrBusiCheckE(int rBusiCheckE) {
		this.rBusiCheckE = rBusiCheckE;
	}

	public int getrPlanCheck() {
		return rPlanCheck;
	}

	public void setrPlanCheck(int rPlanCheck) {
		this.rPlanCheck = rPlanCheck;
	}

	public int getrPlanCheckE() {
		return rPlanCheckE;
	}

	public void setrPlanCheckE(int rPlanCheckE) {
		this.rPlanCheckE = rPlanCheckE;
	}

	public int getrPlanBoard() {
		return rPlanBoard;
	}

	public void setrPlanBoard(int rPlanBoard) {
		this.rPlanBoard = rPlanBoard;
	}

	public int getrModelPlan() {
		return rModelPlan;
	}

	public void setrModelPlan(int rModelPlan) {
		this.rModelPlan = rModelPlan;
	}

	public int getrModelPlanE() {
		return rModelPlanE;
	}

	public void setrModelPlanE(int rModelPlanE) {
		this.rModelPlanE = rModelPlanE;
	}

	public int getrModelPlanD() {
		return rModelPlanD;
	}

	public void setrModelPlanD(int rModelPlanD) {
		this.rModelPlanD = rModelPlanD;
	}

	public int getrPlanBusiCofm() {
		return rPlanBusiCofm;
	}

	public void setrPlanBusiCofm(int rPlanBusiCofm) {
		this.rPlanBusiCofm = rPlanBusiCofm;
	}

	public int getrPlanBusiCofmE() {
		return rPlanBusiCofmE;
	}

	public void setrPlanBusiCofmE(int rPlanBusiCofmE) {
		this.rPlanBusiCofmE = rPlanBusiCofmE;
	}

	public int getrReplace() {
		return rReplace;
	}

	public void setrReplace(int rReplace) {
		this.rReplace = rReplace;
	}

	public int getrLaunManu() {
		return rLaunManu;
	}

	public void setrLaunManu(int rLaunManu) {
		this.rLaunManu = rLaunManu;
	}

	public int getrLaunPack() {
		return rLaunPack;
	}

	public void setrLaunPack(int rLaunPack) {
		this.rLaunPack = rLaunPack;
	}

	public int getrFactoryBoard() {
		return rFactoryBoard;
	}

	public void setrFactoryBoard(int rFactoryBoard) {
		this.rFactoryBoard = rFactoryBoard;
	}

	public int getrFactoryBoardE() {
		return rFactoryBoardE;
	}

	public void setrFactoryBoardE(int rFactoryBoardE) {
		this.rFactoryBoardE = rFactoryBoardE;
	}

	public int getrCloseScan() {
		return rCloseScan;
	}

	public void setrCloseScan(int rCloseScan) {
		this.rCloseScan = rCloseScan;
	}

	public int getrTestScan() {
		return rTestScan;
	}

	public void setrTestScan(int rTestScan) {
		this.rTestScan = rTestScan;
	}

	public int getrPackScan() {
		return rPackScan;
	}

	public void setrPackScan(int rPackScan) {
		this.rPackScan = rPackScan;
	}

	public int getrInstoreScan() {
		return rInstoreScan;
	}

	public void setrInstoreScan(int rInstoreScan) {
		this.rInstoreScan = rInstoreScan;
	}

	public int getrMainStore() {
		return rMainStore;
	}

	public void setrMainStore(int rMainStore) {
		this.rMainStore = rMainStore;
	}

	public int getrHalfStore() {
		return rHalfStore;
	}

	public void setrHalfStore(int rHalfStore) {
		this.rHalfStore = rHalfStore;
	}

	public int getrMainIn() {
		return rMainIn;
	}

	public void setrMainIn(int rMainIn) {
		this.rMainIn = rMainIn;
	}

	public int getrMartStore() {
		return rMartStore;
	}

	public void setrMartStore(int rMartStore) {
		this.rMartStore = rMartStore;
	}

	public int getrMartMana() {
		return rMartMana;
	}

	public void setrMartMana(int rMartMana) {
		this.rMartMana = rMartMana;
	}

	public int getrMartIn() {
		return rMartIn;
	}

	public void setrMartIn(int rMartIn) {
		this.rMartIn = rMartIn;
	}
	
	public int getrMartInTest() {
		return rMartInTest;
	}

	public void setrMartInTest(int rMartInTest) {
		this.rMartInTest = rMartInTest;
	}

	public int getrMartOutAdd() {
		return rMartOutAdd;
	}

	public void setrMartOutAdd(int rMartOutAdd) {
		this.rMartOutAdd = rMartOutAdd;
	}

	public int getrMartOutDel() {
		return rMartOutDel;
	}

	public void setrMartOutDel(int rMartOutDel) {
		this.rMartOutDel = rMartOutDel;
	}

	public int getrMartOutCofm() {
		return rMartOutCofm;
	}

	public void setrMartOutCofm(int rMartOutCofm) {
		this.rMartOutCofm = rMartOutCofm;
	}

	public int getrLogiBoard() {
		return rLogiBoard;
	}

	public void setrLogiBoard(int rLogiBoard) {
		this.rLogiBoard = rLogiBoard;
	}

	public int getrShipPlan() {
		return rShipPlan;
	}

	public void setrShipPlan(int rShipPlan) {
		this.rShipPlan = rShipPlan;
	}

	public int getrShipPlanE() {
		return rShipPlanE;
	}

	public void setrShipPlanE(int rShipPlanE) {
		this.rShipPlanE = rShipPlanE;
	}

	public int getrShipBusiCofm() {
		return rShipBusiCofm;
	}

	public void setrShipBusiCofm(int rShipBusiCofm) {
		this.rShipBusiCofm = rShipBusiCofm;
	}

	public int getrShipBusiCofmE() {
		return rShipBusiCofmE;
	}

	public void setrShipBusiCofmE(int rShipBusiCofmE) {
		this.rShipBusiCofmE = rShipBusiCofmE;
	}

	public int getrShipDispCheck() {
		return rShipDispCheck;
	}

	public void setrShipDispCheck(int rShipDispCheck) {
		this.rShipDispCheck = rShipDispCheck;
	}

	public int getrShipDispCheckE() {
		return rShipDispCheckE;
	}

	public void setrShipDispCheckE(int rShipDispCheckE) {
		this.rShipDispCheckE = rShipDispCheckE;
	}

	public int getrShipLogiCofm() {
		return rShipLogiCofm;
	}

	public void setrShipLogiCofm(int rShipLogiCofm) {
		this.rShipLogiCofm = rShipLogiCofm;
	}

	public int getrShipLogiCofmE() {
		return rShipLogiCofmE;
	}

	public void setrShipLogiCofmE(int rShipLogiCofmE) {
		this.rShipLogiCofmE = rShipLogiCofmE;
	}

	public int getrShipLogiToShip() {
		return rShipLogiToShip;
	}

	public void setrShipLogiToShip(int rShipLogiToShip) {
		this.rShipLogiToShip = rShipLogiToShip;
	}

	public int getrShipLogiToShipE() {
		return rShipLogiToShipE;
	}

	public void setrShipLogiToShipE(int rShipLogiToShipE) {
		this.rShipLogiToShipE = rShipLogiToShipE;
	}

	public int getrShipScan() {
		return rShipScan;
	}

	public void setrShipScan(int rShipScan) {
		this.rShipScan = rShipScan;
	}

	public int getrSysMana() {
		return rSysMana;
	}

	public void setrSysMana(int rSysMana) {
		this.rSysMana = rSysMana;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getrLaunManuP() {
		return rLaunManuP;
	}

	public void setrLaunManuP(int rLaunManuP) {
		this.rLaunManuP = rLaunManuP;
	}

	public int getrLaunManuC() {
		return rLaunManuC;
	}

	public void setrLaunManuC(int rLaunManuC) {
		this.rLaunManuC = rLaunManuC;
	}

	public int getrLaunPackP() {
		return rLaunPackP;
	}

	public void setrLaunPackP(int rLaunPackP) {
		this.rLaunPackP = rLaunPackP;
	}

	public int getrLaunPackC() {
		return rLaunPackC;
	}

	public void setrLaunPackC(int rLaunPackC) {
		this.rLaunPackC = rLaunPackC;
	}

	public int getrMartInLimit() {
		return rMartInLimit;
	}

	public void setrMartInLimit(int rMartInLimit) {
		this.rMartInLimit = rMartInLimit;
	}

	public int getrDelivCofm() {
		return rDelivCofm;
	}

	public void setrDelivCofm(int rDelivCofm) {
		this.rDelivCofm = rDelivCofm;
	}

	public int getrDelivRecofm() {
		return rDelivRecofm;
	}

	public void setrDelivRecofm(int rDelivRecofm) {
		this.rDelivRecofm = rDelivRecofm;
	}

	public int getrDelivCheck() {
		return rDelivCheck;
	}

	public void setrDelivCheck(int rDelivCheck) {
		this.rDelivCheck = rDelivCheck;
	}

	public int getrDelivRecheck() {
		return rDelivRecheck;
	}

	public void setrDelivRecheck(int rDelivRecheck) {
		this.rDelivRecheck = rDelivRecheck;
	}

	public int getrDelivAccount() {
		return rDelivAccount;
	}

	public void setrDelivAccount(int rDelivAccount) {
		this.rDelivAccount = rDelivAccount;
	}

	public int getrDelivReaccount() {
		return rDelivReaccount;
	}

	public void setrDelivReaccount(int rDelivReaccount) {
		this.rDelivReaccount = rDelivReaccount;
	}

	public int getrDelivmanaCofm() {
		return rDelivmanaCofm;
	}

	public void setrDelivmanaCofm(int rDelivmanaCofm) {
		this.rDelivmanaCofm = rDelivmanaCofm;
	}

	public int getrDelivmanaEdit() {
		return rDelivmanaEdit;
	}

	public void setrDelivmanaEdit(int rDelivmanaEdit) {
		this.rDelivmanaEdit = rDelivmanaEdit;
	}

	public int getrDelivmanaAdd() {
		return rDelivmanaAdd;
	}

	public void setrDelivmanaAdd(int rDelivmanaAdd) {
		this.rDelivmanaAdd = rDelivmanaAdd;
	}

	public int getrDelivmanaImport() {
		return rDelivmanaImport;
	}

	public void setrDelivmanaImport(int rDelivmanaImport) {
		this.rDelivmanaImport = rDelivmanaImport;
	}

	public int getrDelivmanaDisable() {
		return rDelivmanaDisable;
	}

	public void setrDelivmanaDisable(int rDelivmanaDisable) {
		this.rDelivmanaDisable = rDelivmanaDisable;
	}

	public int getrDelivmanaEnable() {
		return rDelivmanaEnable;
	}

	public void setrDelivmanaEnable(int rDelivmanaEnable) {
		this.rDelivmanaEnable = rDelivmanaEnable;
	}

	public int getrDelivmanaUpdate() {
		return rDelivmanaUpdate;
	}

	public void setrDelivmanaUpdate(int rDelivmanaUpdate) {
		this.rDelivmanaUpdate = rDelivmanaUpdate;
	}

}
