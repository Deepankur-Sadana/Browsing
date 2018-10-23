package models;

public class NodeData {
	String id;
	
	//keeping generic data as of now
	Object otherDetails;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Object getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(Object otherDetails) {
		this.otherDetails = otherDetails;
	}

}
