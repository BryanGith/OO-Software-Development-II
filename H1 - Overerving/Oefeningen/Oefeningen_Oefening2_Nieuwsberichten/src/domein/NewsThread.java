package domein;

public class NewsThread extends Message {

	public NewsThread(String msg) {
		super(msg);
	}

	@Override
	public void add(String msg) {
		add(new Comment(msg, 0));
	}

	@Override
	public String toString() {
		String string = String.format("%s", getMessage());

		for (Comment c : getComments()) {
			string += String.format("%n%s", c.toString());
		}

		return string;
	}
}