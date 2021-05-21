package domein;

import java.util.ArrayList;
import java.util.List;

public abstract class Message {
	private String msg;
	private List<Comment> comments;

	public Message(String msg) {
		setMessage(msg);
	}

	private void setMessage(String msg) {
		if (msg == null || msg.isBlank()) {
			throw new IllegalArgumentException("Een leeg bericht is niet toegestaan!");
		}

		this.msg = msg;
	}

	protected String getMessage() {
		return msg;
	}

	public List<Comment> getComments() {
		if (comments == null)
			comments = new ArrayList<>();

		return comments;
	}

	public abstract void add(String msg);

	protected void add(Comment comment) {
		getComments().add(comment);
	}
}
