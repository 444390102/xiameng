package pojo;

public class Test {
	
	private String id;
	
	private long tId;
	 private String tDate;/* 日期 */
	 private String tTime;/*时间 */
	 private String tManuCode;/*投产编号 */
	 private String tMagCode;/*磁钢号 */
	 private String tEncType;/* 编码器号*/
	 private String tBrakeCode;/*制动器号 */
	 private String tBrakeCode2;/*制动器号2 */
	 private String tBaseCode;/* 机座号*/
	 private String tBrakeWheelCode;/* 制动轮号*/
	 private String tWheelCode;/*曳引轮号 */
	 private String tStatorCode;/* 定子号*/
	 private String tBrakeStove;/*制动轮炉号 */
	 private String tRopeJump;/*绳轮法向跳动 */
	 private String tBrakeJump;/*制动轮径向跳动 */
	 private String tEncJump;/* 编码器径向跳动*/
	 private String tArmtJoint;/*电枢与衔铁间隙 */
	 private String tBrakeGap;/*开闸间隙 */
	 private String tOpenV;/* 开启电压*/
	 private String tReleaseV;/* 释放电压*/
	 private String tBaseStove;/*机座炉号 */
	 private String tWheelStove;/*曳引轮炉号 */
	 private String tLowV;/*最低触发电压 */
	 private String tHighV;/*最高释放电压 */
	 private String tWorkLen;/*工作行程 */
	 private String tBaseFlat;/*机座地脚平整 */
	 private String tBackWheel;/*后轴与后盖之间垂直度（跳动） */
	 private String tMotorSpec;/*电机规格 */
	 private String tLrSwitch;/*双侧微动开关检测结论 */
	 private String tLSwitch;/*左微动开关检测结论 */
	 private String tRSwitch;/*右微动开关检测结论 */
	 private String tAngle;/*角度值 */
	 private String tLrBbkTest;/*双侧抱闸检测结论 */
	 private String tLBbkTest;/*左抱闸检测结论 */
	 private String tRBbkTest;/*右抱闸检测结论 */
	 private String tLrBkTest;/*双侧制动器响应时间检测结论 */
	 private String tLBkTest;/*左侧制动器响应时间检测结论 */
	 private String tRBkTest;/*右侧制动器响应时间检测结论 */
	 private String tRotateC;/*正转输出电流 */
	 private String tRrotateC;/*反转输出电流 */
	 private String tRotateV;/*正转输出线电压 */
	 private String tRrotateV;/*反转输出线电压 */
	 private String test;/* 检测结论*/
	 private String tCreateTime;/*记录生成日期（外部调用不需要设置） */
	 
	 private String tBearing1;/*轴承编码1*/
	 private String tBearing2;/*轴承编码2*/
	 private String tBearing3;/*轴承编码3*/
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long gettId() {
		return tId;
	}
	public void settId(long tId) {
		this.tId = tId;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	public String gettTime() {
		return tTime;
	}
	public void settTime(String tTime) {
		this.tTime = tTime;
	}
	public String gettManuCode() {
		return tManuCode;
	}
	public void settManuCode(String tManuCode) {
		this.tManuCode = tManuCode;
	}
	public String gettMagCode() {
		return tMagCode;
	}
	public void settMagCode(String tMagCode) {
		this.tMagCode = tMagCode;
	}
	public String gettEncType() {
		return tEncType;
	}
	public void settEncType(String tEncType) {
		this.tEncType = tEncType;
	}
	public String gettBrakeCode() {
		return tBrakeCode;
	}
	public void settBrakeCode(String tBrakeCode) {
		this.tBrakeCode = tBrakeCode;
	}
	public String gettBrakeCode2() {
		return tBrakeCode2;
	}
	public void settBrakeCode2(String tBrakeCode2) {
		this.tBrakeCode2 = tBrakeCode2;
	}
	public String gettBaseCode() {
		return tBaseCode;
	}
	public void settBaseCode(String tBaseCode) {
		this.tBaseCode = tBaseCode;
	}
	public String gettBrakeWheelCode() {
		return tBrakeWheelCode;
	}
	public void settBrakeWheelCode(String tBrakeWheelCode) {
		this.tBrakeWheelCode = tBrakeWheelCode;
	}
	public String gettWheelCode() {
		return tWheelCode;
	}
	public void settWheelCode(String tWheelCode) {
		this.tWheelCode = tWheelCode;
	}
	public String gettStatorCode() {
		return tStatorCode;
	}
	public void settStatorCode(String tStatorCode) {
		this.tStatorCode = tStatorCode;
	}
	public String gettBrakeStove() {
		return tBrakeStove;
	}
	public void settBrakeStove(String tBrakeStove) {
		this.tBrakeStove = tBrakeStove;
	}
	public String gettRopeJump() {
		return tRopeJump;
	}
	public void settRopeJump(String tRopeJump) {
		this.tRopeJump = tRopeJump;
	}
	public String gettBrakeJump() {
		return tBrakeJump;
	}
	public void settBrakeJump(String tBrakeJump) {
		this.tBrakeJump = tBrakeJump;
	}
	public String gettEncJump() {
		return tEncJump;
	}
	public void settEncJump(String tEncJump) {
		this.tEncJump = tEncJump;
	}
	public String gettArmtJoint() {
		return tArmtJoint;
	}
	public void settArmtJoint(String tArmtJoint) {
		this.tArmtJoint = tArmtJoint;
	}
	public String gettBrakeGap() {
		return tBrakeGap;
	}
	public void settBrakeGap(String tBrakeGap) {
		this.tBrakeGap = tBrakeGap;
	}
	public String gettOpenV() {
		return tOpenV;
	}
	public void settOpenV(String tOpenV) {
		this.tOpenV = tOpenV;
	}
	public String gettReleaseV() {
		return tReleaseV;
	}
	public void settReleaseV(String tReleaseV) {
		this.tReleaseV = tReleaseV;
	}
	public String gettBaseStove() {
		return tBaseStove;
	}
	public void settBaseStove(String tBaseStove) {
		this.tBaseStove = tBaseStove;
	}
	public String gettWheelStove() {
		return tWheelStove;
	}
	public void settWheelStove(String tWheelStove) {
		this.tWheelStove = tWheelStove;
	}
	public String gettLowV() {
		return tLowV;
	}
	public void settLowV(String tLowV) {
		this.tLowV = tLowV;
	}
	public String gettHighV() {
		return tHighV;
	}
	public void settHighV(String tHighV) {
		this.tHighV = tHighV;
	}
	public String gettWorkLen() {
		return tWorkLen;
	}
	public void settWorkLen(String tWorkLen) {
		this.tWorkLen = tWorkLen;
	}
	public String gettBaseFlat() {
		return tBaseFlat;
	}
	public void settBaseFlat(String tBaseFlat) {
		this.tBaseFlat = tBaseFlat;
	}
	public String gettBackWheel() {
		return tBackWheel;
	}
	public void settBackWheel(String tBackWheel) {
		this.tBackWheel = tBackWheel;
	}
	public String gettMotorSpec() {
		return tMotorSpec;
	}
	public void settMotorSpec(String tMotorSpec) {
		this.tMotorSpec = tMotorSpec;
	}
	public String gettLrSwitch() {
		return tLrSwitch;
	}
	public void settLrSwitch(String tLrSwitch) {
		this.tLrSwitch = tLrSwitch;
	}
	public String gettLSwitch() {
		return tLSwitch;
	}
	public void settLSwitch(String tLSwitch) {
		this.tLSwitch = tLSwitch;
	}
	public String gettRSwitch() {
		return tRSwitch;
	}
	public void settRSwitch(String tRSwitch) {
		this.tRSwitch = tRSwitch;
	}
	public String gettAngle() {
		return tAngle;
	}
	public void settAngle(String tAngle) {
		this.tAngle = tAngle;
	}
	public String gettLrBbkTest() {
		return tLrBbkTest;
	}
	public void settLrBbkTest(String tLrBbkTest) {
		this.tLrBbkTest = tLrBbkTest;
	}
	public String gettLBbkTest() {
		return tLBbkTest;
	}
	public void settLBbkTest(String tLBbkTest) {
		this.tLBbkTest = tLBbkTest;
	}
	public String gettRBbkTest() {
		return tRBbkTest;
	}
	public void settRBbkTest(String tRBbkTest) {
		this.tRBbkTest = tRBbkTest;
	}
	public String gettLrBkTest() {
		return tLrBkTest;
	}
	public void settLrBkTest(String tLrBkTest) {
		this.tLrBkTest = tLrBkTest;
	}
	public String gettLBkTest() {
		return tLBkTest;
	}
	public void settLBkTest(String tLBkTest) {
		this.tLBkTest = tLBkTest;
	}
	public String gettRBkTest() {
		return tRBkTest;
	}
	public void settRBkTest(String tRBkTest) {
		this.tRBkTest = tRBkTest;
	}
	public String gettRotateC() {
		return tRotateC;
	}
	public void settRotateC(String tRotateC) {
		this.tRotateC = tRotateC;
	}
	public String gettRrotateC() {
		return tRrotateC;
	}
	public void settRrotateC(String tRrotateC) {
		this.tRrotateC = tRrotateC;
	}
	public String gettRotateV() {
		return tRotateV;
	}
	public void settRotateV(String tRotateV) {
		this.tRotateV = tRotateV;
	}
	public String gettRrotateV() {
		return tRrotateV;
	}
	public void settRrotateV(String tRrotateV) {
		this.tRrotateV = tRrotateV;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String gettCreateTime() {
		return tCreateTime;
	}
	public void settCreateTime(String tCreateTime) {
		this.tCreateTime = tCreateTime;
	}
	public String gettBearing1() {
		return tBearing1;
	}
	public void settBearing1(String tBearing1) {
		this.tBearing1 = tBearing1;
	}
	public String gettBearing2() {
		return tBearing2;
	}
	public void settBearing2(String tBearing2) {
		this.tBearing2 = tBearing2;
	}
	public String gettBearing3() {
		return tBearing3;
	}
	public void settBearing3(String tBearing3) {
		this.tBearing3 = tBearing3;
	}
	 
	 
	 
	
}
