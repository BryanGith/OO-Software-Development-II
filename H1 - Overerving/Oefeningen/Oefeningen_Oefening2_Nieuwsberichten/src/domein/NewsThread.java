package domein;

public class NewsThread extends Message {

	public NewsThread(String msg) {
		super(msg);
	}

	public void add(String msg) {
		Comment comment = new Comment(msg, 0);
		add(comment);
	}

	@Override
	public String toString() {
		String res = getMsg();
		for (Comment comment : getComments()) {
			res += "\n";
			res += comment;
		}
		return res;
	}

}
