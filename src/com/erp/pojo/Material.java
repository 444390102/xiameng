package pojo;

public class Material {
	
	private String minNumSx; /* 筛选最小库存数 */
	private int id;
	private int mmid;
	private int userId;
	private int total;
	private int totest;
	private int pass;
	private int nopass;
	private int inout;
	private String inoutDate;
	private String inoutDateF; /* 开始日期 */
	private String inoutDateT; /* 结束日期 */
	private String inDateF; /* 入库开始日期 */
	private String inDateT; /* 入库结束日期 */
	private String xuqiuDate; /* 需求日期 */
	private String daohuoDate; /* 到货日期 */
	private String createTime;
	private String keywordIn;
	private String remark; /* 备注 */
	private String what;
	private MaterialMana materialManaEntity;
	private int ckTotal;
	private int ckTotext;
	private User user;
	private String lastInAcc;
	
	private String zeroNumSx;/* 筛选为零库存 */
	
	
	
	
	public String getZeroNumSx() {
		return zeroNumSx;
	}
	public void setZeroNumSx(String zeroNumSx) {
		this.zeroNumSx = zeroNumSx;
	}
	public String getInDateF() {
		return inDateF;
	}
	public void setInDateF(String inDateF) {
		this.inDateF = inDateF;
	}
	public String getInDateT() {
		return inDateT;
	}
	public void setInDateT(String inDateT) {
		this.inDateT = inDateT;
	}
	public String getXuqiuDate() {
		return xuqiuDate;
	}
	public void setXuqiuDate(String xuqiuDate) {
		this.xuqiuDate = xuqiuDate;
	}
	public String getDaohuoDate() {
		return daohuoDate;
	}
	public void setDaohuoDate(String daohuoDate) {
		this.daohuoDate = daohuoDate;
	}
	public String getMinNumSx() {
		return minNumSx;
	}
	public void setMinNumSx(String minNumSx) {
		this.minNumSx = minNumSx;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getCkTotal() {
		return ckTotal;
	}
	public void setCkTotal(int ckTotal) {
		this.ckTotal = ckTotal;
	}
	public int getCkTotext() {
		return ckTotext;
	}
	public void setCkTotext(int ckTotext) {
		this.ckTotext = ckTotext;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMmid() {
		return mmid;
	}
	public void setMmid(int mmid) {
		this.mmid = mmid;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotest() {
		return totest;
	}
	public void setTotest(int totest) {
		this.totest = totest;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public int getNopass() {
		return nopass;
	}
	public void setNopass(int nopass) {
		this.nopass = nopass;
	}
	public int getInout() {
		return inout;
	}
	public void setInout(int inout) {
		this.inout = inout;
	}
	public String getInoutDate() {
		return inoutDate;
	}
	public void setInoutDate(String inoutDate) {
		this.inoutDate = inoutDate;
	}
	public String getInoutDateF() {
		return inoutDateF;
	}
	public void setInoutDateF(String inoutDateF) {
		this.inoutDateF = inoutDateF;
	}
	public String getInoutDateT() {
		return inoutDateT;
	}
	public void setInoutDateT(String inoutDateT) {
		this.inoutDateT = inoutDateT;
	}
	public String getKeywordIn() {
		return keywordIn;
	}
	public void setKeywordIn(String keywordIn) {
		this.keywordIn = keywordIn;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	public MaterialMana getMaterialManaEntity() {
		return materialManaEntity;
	}
	public void setMaterialManaEntity(MaterialMana materialManaEntity) {
		this.materialManaEntity = materialManaEntity;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastInAcc() {
		return lastInAcc;
	}
	public void setLastInAcc(String lastInAcc) {
		this.lastInAcc = lastInAcc;
	}
	
	
	
}
