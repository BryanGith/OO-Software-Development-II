package domein;

import java.util.ArrayList;
import java.util.List;

public abstract class Message {
	private String msg;
	private static List<Comment> comments = new ArrayList<>();

	public Message(String msg) {
		if (" ".equals(msg) || "\t".equals(msg)) {
			throw new IllegalArgumentException();
		}
		this.msg = msg;
	}

	public abstract void add(String msg);

	protected void add(Comment comment) {
		comments.add(comment);
	}

	public List<Comment> getComments() {
		return comments;

	}

	protected String getMsg() {
		return msg;
	}

	private void setMsg(String msg) {
		this.msg = msg;
	}

}
