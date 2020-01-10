package pojo;

import java.io.Serializable;

public class User implements Serializable {
	
	private int id;
	private String acc;
	private String pwd;
	private Integer roleId;
	private int area;
	private Role role;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	//0-抚顺，1-佛山，2-湖州
	public String getAreaStr() {
		return area == 0 ? "抚顺市" :
			area == 1 ? "湖州市" : "佛山市";
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public void setId(int id) {
		this.id = id;
	}
}
