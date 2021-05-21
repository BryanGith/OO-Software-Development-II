package domein;

public class Comment extends Message {

	private int level;

	protected Comment(String msg, int level) {
		super(msg);
		this.level = level;
	}

	@Override
	public void add(String msg) {
		getComments().add(new Comment(msg, level + 1));
	}

	@Override
	public String toString() {
		String comment = "";

		for (int i = 0; i < level + 1; i++) {
			comment += "\t";
		}

		comment += String.format("Level %d: %s", level, getMessage());

		for (Comment c : getComments()) {
			comment += String.format("%n%s", c.toString());
		}

		return comment;
	}
}
