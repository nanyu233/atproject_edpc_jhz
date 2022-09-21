package activetech.hospital.action;

public class Users {

	private String id;
	private String text;
	private String selected;
	
	
	public Users(String id, String text, String selected) {
		super();
		this.id = id;
		this.text = text;
		this.selected = selected;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSelected() {
		return selected;
	}
	public void setSelected(String selected) {
		this.selected = selected;
	}
	
	
	
}
