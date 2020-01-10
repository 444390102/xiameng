package pojo;

import java.util.ArrayList;

public class MaterialMana {
	
	private int id;
	private int area;
	private String cata;
	private String code;
	private String name;
	private String spec;
	private String supply;
	private String unit;	

	private String createTime;	
	private String keyword;

	private int stop;
	private String stopNum;
	private String location;
	private String account;
	private String remarkManage; /* 备注 */
	private String bad; /* 备注 */
	private String minNum;
	private ArrayList<Material> MaterialinList;
	private int state;
	
	private int last_in_user;/* 某种材料最后填写入库单的操作人员 */
	private int qualified_user;/* 某种材料最后点击合格按钮的操作人员 */
	private String new_xuqiu_date; /* 最新的需求日期（截止日期） */
	private String new_qualified_date; /* 点合格的日期（入库日期） */
	private String last_user;
	private int last_in_user_lnfs;/* 某种材料最后填写入库单的操作人员 */
	private int qualified_user_lnfs;/* 某种材料最后点击合格按钮的操作人员 */
	private String new_xuqiu_date_lnfs; /* 最新的需求日期（截止日期） */
	private String new_qualified_date_lnfs; /* 点合格的日期（入库日期） */
	
	private int last_in_user_zj;/* 某种材料最后填写入库单的操作人员 */
	private int qualified_user_zj;/* 某种材料最后点击合格按钮的操作人员 */
	private String new_xuqiu_date_zj; /* 最新的需求日期（截止日期） */
	private String new_qualified_date_zj; /* 点合格的日期（入库日期） */
	
	private int last_in_user_fs;/* 某种材料最后填写入库单的操作人员 */
	private int qualified_user_fs;/* 某种材料最后点击合格按钮的操作人员 */
	private String new_xuqiu_date_fs; /* 最新的需求日期（截止日期） */
	private String new_qualified_date_fs; /* 点合格的日期（入库日期） */
	
	
	public int getLast_in_user() {
		return last_in_user;
	}

	public void setLast_in_user(int last_in_user) {
		this.last_in_user = last_in_user;
	}

	

	public int getQualified_user() {
		return qualified_user;
	}

	public void setQualified_user(int qualified_user) {
		this.qualified_user = qualified_user;
	}

	public String getNew_xuqiu_date() {
		return new_xuqiu_date;
	}

	public void setNew_xuqiu_date(String new_xuqiu_date) {
		this.new_xuqiu_date = new_xuqiu_date;
	}

	public String getNew_qualified_date() {
		return new_qualified_date;
	}

	public void setNew_qualified_date(String new_qualified_date) {
		this.new_qualified_date = new_qualified_date;
	}

	public String getLast_user() {
		return last_user;
	}

	public void setLast_user(String last_user) {
		this.last_user = last_user;
	}

	public String getMinNum() {
		return minNum;
	}

	public void setMinNum(String minNum) {
		this.minNum = minNum;
	}

	public String getRemarkManage() {
		return remarkManage;
	}

	public void setRemarkManage(String remarkManage) {
		this.remarkManage = remarkManage;
	}

	public String getBad() {
		return bad;
	}

	public void setBad(String bad) {
		this.bad = bad;
	}

	public int getStop() {
		return stop;
	}

	public void setStop(int stop) {
		this.stop = stop;
	}

	

	

	public String getStopNum() {
		return "".equals(stopNum)?null:stopNum;
	}

	public void setStopNum(String stopNum) {
		this.stopNum = stopNum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public ArrayList<Material> getMaterialinList() {
		return MaterialinList;
	}

	public void setMaterialinList(ArrayList<Material> materialinList) {
		MaterialinList = materialinList;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCata() {
		return cata;
	}

	public void setCata(String cata) {
		this.cata = cata;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
//	@Override
	public String toString() {
		return this.cata + " : " + this.code + " : " + this.supply + " : " + this.account;
	}

	public int getLast_in_user_lnfs() {
		return last_in_user_lnfs;
	}

	public void setLast_in_user_lnfs(int last_in_user_lnfs) {
		this.last_in_user_lnfs = last_in_user_lnfs;
	}

	public int getQualified_user_lnfs() {
		return qualified_user_lnfs;
	}

	public void setQualified_user_lnfs(int qualified_user_lnfs) {
		this.qualified_user_lnfs = qualified_user_lnfs;
	}

	public String getNew_xuqiu_date_lnfs() {
		return new_xuqiu_date_lnfs;
	}

	public void setNew_xuqiu_date_lnfs(String new_xuqiu_date_lnfs) {
		this.new_xuqiu_date_lnfs = new_xuqiu_date_lnfs;
	}

	public String getNew_qualified_date_lnfs() {
		return new_qualified_date_lnfs;
	}

	public void setNew_qualified_date_lnfs(String new_qualified_date_lnfs) {
		this.new_qualified_date_lnfs = new_qualified_date_lnfs;
	}

	public int getLast_in_user_zj() {
		return last_in_user_zj;
	}

	public void setLast_in_user_zj(int last_in_user_zj) {
		this.last_in_user_zj = last_in_user_zj;
	}

	public int getQualified_user_zj() {
		return qualified_user_zj;
	}

	public void setQualified_user_zj(int qualified_user_zj) {
		this.qualified_user_zj = qualified_user_zj;
	}

	public String getNew_xuqiu_date_zj() {
		return new_xuqiu_date_zj;
	}

	public void setNew_xuqiu_date_zj(String new_xuqiu_date_zj) {
		this.new_xuqiu_date_zj = new_xuqiu_date_zj;
	}

	public String getNew_qualified_date_zj() {
		return new_qualified_date_zj;
	}

	public void setNew_qualified_date_zj(String new_qualified_date_zj) {
		this.new_qualified_date_zj = new_qualified_date_zj;
	}

	public int getLast_in_user_fs() {
		return last_in_user_fs;
	}

	public void setLast_in_user_fs(int last_in_user_fs) {
		this.last_in_user_fs = last_in_user_fs;
	}

	public int getQualified_user_fs() {
		return qualified_user_fs;
	}

	public void setQualified_user_fs(int qualified_user_fs) {
		this.qualified_user_fs = qualified_user_fs;
	}

	public String getNew_xuqiu_date_fs() {
		return new_xuqiu_date_fs;
	}

	public void setNew_xuqiu_date_fs(String new_xuqiu_date_fs) {
		this.new_xuqiu_date_fs = new_xuqiu_date_fs;
	}

	public String getNew_qualified_date_fs() {
		return new_qualified_date_fs;
	}

	public void setNew_qualified_date_fs(String new_qualified_date_fs) {
		this.new_qualified_date_fs = new_qualified_date_fs;
	}
	
	
	
}
