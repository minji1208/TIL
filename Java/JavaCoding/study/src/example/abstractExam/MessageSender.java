package example.abstractExam;

public abstract class MessageSender {
	private String title;
	private String senderName;
	
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	
	public abstract void sendMessage(String recipient);
}
