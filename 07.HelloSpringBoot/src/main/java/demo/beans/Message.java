package demo.beans;

public class Message {

	private String text;

	public Message(String text) {
		super();
		this.text = text;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [text=" + text + "]";
	}
}
