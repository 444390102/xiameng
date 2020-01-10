package pojo;

import java.util.List;

//import com.blp.util.TimeHelper;

public class DelivCost {
	
	private long id;
	private int area;	/*所属工厂 0-抚顺，1-浙江，2-佛山*/
	private int delivCata; /* 货运类别：默认0-物流运输 */
	private String logiFedb;  /*回执编码*/
	private String realShipTime;  /*实际发货日期*/
	private String realShipTimeF;  /*实际发货日期*/
	private String realShipTimeT;  /*实际发货日期*/
	private String logiComp;  /*承运公司*/
	private String fromCity;  /*发货城市*/
	private String toCity;  /*收货城市*/
	private float totalWeight;   /*主机总重*/
	private float price;   /*运费单价*/
	private float totalPrice;   /*运费*/
	private float floatPrice;   /*增减运费*/
	private String floatClaim;   /*运费调整说明*/
	private int createUser;  /*制单人*/
	private String createUserName;
	private String createTime;   /*制单时间*/
	private int cofmUser;  /*确认人*/
	private String cofmUserName;
	private int cofmResult;   /*确认结果*/
	private String cofmTime;   /*确认时间*/
	private int checkUser;  /*审核人*/
	private String checkUserName;
	private int checkResult;
	private String checkTime;   /*审核时间*/
	private int accountUser;  /*结算人*/
	private String accountUserName;
	private String accountTime;   /*结算时间*/
	private int accountResult;
	private String keyword;
	private int what;
	private int picNum;
	
	
	public String getClientArea(){
		String clientArea = "";
		if (this.delivMainList != null && this.delivMainList.size() > 0) {
			clientArea = delivMainList.get(0).getClientArea();
			for (DelivMain delivMain : delivMainList) {
				if (delivMain.getClientArea()!= null && 
						!delivMain.getClientArea().equals(clientArea)) {
					clientArea = "";
					break;
				}
			}
		}
		
		return clientArea;
	}
	
	public String getSimpleAccountTime() {
		if (this.accountTime == null) {
			return null;
		} else {
			return this.accountTime.substring(0,accountTime.lastIndexOf(":"));
		}
	}
	public String getSimpleCofmTime() {
		if (this.cofmTime == null) {
			return null;
		} else {
			return this.cofmTime.substring(0,cofmTime.lastIndexOf(":"));
		}
	}
	
	
	public String getSimpleCheckTime() {
		if (this.checkTime == null) {
			return null;
		} else {
			return this.checkTime.substring(0,checkTime.lastIndexOf(":"));
		}
	}
	
	public String getSimpleCreateTime() {
		if (this.createTime == null) {
			return null;
		} else {
			return this.createTime.substring(0,createTime.lastIndexOf(":"));
		}
	}
	
	public String getDelivCataStr() {
		return delivCata == 0 ? "物流运输" : "单独配送";
	}
	
	public String getCofmResultStr() {
		return checkResult == -1 ? "待确认" : "已确认";
	}
	
	public String getAreaName(){
		//0-抚顺，1-浙江，2-佛山
		return area == 0 ? "抚顺" : 
				area == 1 ? "浙江" : "佛山";
	}
	
	public String getCheckResultStr() {
		return checkResult == 0 ? "反审核" : 
			checkResult == 1 ? "已审核" : "未审核";
	}
	
	public String getAccountResultStr() {
		return accountResult == 0 ? "反结算" : 
			accountResult == 1 ? "已结算" : "未结算";
	}
	
	public int getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(int checkResult) {
		this.checkResult = checkResult;
	}

	public int getAccountResult() {
		return accountResult;
	}

	public void setAccountResult(int accountResult) {
		this.accountResult = accountResult;
	}

	private List<DelivMain> delivMainList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getDelivCata() {
		return delivCata;
	}

	public void setDelivCata(int delivCata) {
		this.delivCata = delivCata;
	}

	public String getLogiFedb() {
		return logiFedb;
	}

	public void setLogiFedb(String logiFedb) {
		this.logiFedb = logiFedb;
	}

	public String getRealShipTime() {
		return realShipTime;
	}

	public void setRealShipTime(String realShipTime) {
		this.realShipTime = realShipTime;
	}

	public String getRealShipTimeF() {
		return realShipTimeF;
	}

	public void setRealShipTimeF(String realShipTimeF) {
		this.realShipTimeF = realShipTimeF;
	}

	public String getRealShipTimeT() {
		return realShipTimeT;
	}

	public void setRealShipTimeT(String realShipTimeT) {
		this.realShipTimeT = realShipTimeT;
	}

	public String getLogiComp() {
		return logiComp;
	}

	public void setLogiComp(String logiComp) {
		this.logiComp = logiComp;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public float getTotalWeight() {
		return ((int)(totalWeight * 100)) / 100.0f;
	}

	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
	}

	public float getPrice() {
		return this.price;
	}
	
	public float getSortPrice() {
		return ((int)(price * 100)) / 100.0f;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getTotalPrice() {
		return ((int)(totalPrice * 100)) / 100.0f;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public float getFloatPrice() {
		return ((int)(floatPrice * 100)) / 100.0f;
	}

	public void setFloatPrice(float floatPrice) {
		this.floatPrice = floatPrice;
	}

	public String getFloatClaim() {
		return floatClaim;
	}

	public void setFloatClaim(String floatClaim) {
		this.floatClaim = floatClaim;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public int getCofmUser() {
		return cofmUser;
	}

	public void setCofmUser(int cofmUser) {
		this.cofmUser = cofmUser;
	}

	public int getCofmResult() {
		return cofmResult;
	}

	public void setCofmResult(int cofmResult) {
		this.cofmResult = cofmResult;
	}

	public String getCofmTime() {
		return cofmTime;
	}

	public void setCofmTime(String cofmTime) {
		this.cofmTime = cofmTime;
	}

	public int getCheckUser() {
		return checkUser;
	}

	public void setCheckUser(int checkUser) {
		this.checkUser = checkUser;
	}

	public String getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public int getAccountUser() {
		return accountUser;
	}

	public void setAccountUser(int accountUser) {
		this.accountUser = accountUser;
	}

	public String getAccountTime() {
		return accountTime;
	}

	public void setAccountTime(String accountTime) {
		this.accountTime = accountTime;
	}

	public List<DelivMain> getDelivMainList() {
		return delivMainList;
	}

	public void setDelivMainList(List<DelivMain> delivMainList) {
		this.delivMainList = delivMainList;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCofmUserName() {
		return cofmUserName;
	}

	public void setCofmUserName(String cofmUserName) {
		this.cofmUserName = cofmUserName;
	}

	public String getCheckUserName() {
		return checkUserName;
	}

	public void setCheckUserName(String checkUserName) {
		this.checkUserName = checkUserName;
	}

	public String getAccountUserName() {
		return accountUserName;
	}

	public void setAccountUserName(String accountUserName) {
		this.accountUserName = accountUserName;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getWhat() {
		return what;
	}

	public void setWhat(int what) {
		this.what = what;
	}

	public int getPicNum() {
		return picNum;
	}

	public void setPicNum(int picNum) {
		this.picNum = picNum;
	}
	
//	public String getToCityFilter() {
//		if (this.delivMainList == null || this.delivMainList.size() == 0) {
//			return this.toCity;
//		}
//		boolean isLikeCity = true;
//		for (DelivMain main : delivMainList) {
//			//如果主机的 收货地址不包含 核算单的收货地址
//			if (!main.getLogiAddr().contains(this.toCity)) {
//				isLikeCity = false;
//				break;
//			}
//		}
//		if (isLikeCity) {
//			return this.toCity;
//		} else {
//			return "";
//		}
//	}
	
	
}
