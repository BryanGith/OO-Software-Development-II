package domein;

public class Comment extends Message {

	private int level;

	protected Comment(String msg, int level) {
		super(msg);
	}

	public void add(String msg) {
		Comment comment = new Comment(msg, 1);
		add(comment);
	}

	public String toString() {
		if (level == 0) {
			return String.format("\tLevel %d: %s", level, getMsg());
		}
		return String.format("\t\tLevel %d: %s", level, getMsg());

	}

}
