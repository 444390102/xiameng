package pojo;

public class DelivPic {
	
	private long id;
	private long delivId;
	private String fileName;
	private String originName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDelivId() {
		return delivId;
	}
	public void setDelivId(long delivId) {
		this.delivId = delivId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	
}
