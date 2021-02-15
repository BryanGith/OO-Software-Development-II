package domein;

public class Message {
	private String msg;

	public Message(String msg) {
		this.msg = msg;
	}

	public void add(String msg) {

	}

	protected void add(Comment comment) {

	}

	public Comment getComments() {
		return null;

	}

	protected String getMsg() {
		return msg;
	}

	private void setMsg(String msg) {
		this.msg = msg;
	}

}
