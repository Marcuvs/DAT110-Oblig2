package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

    public UnsubscribeMsg(String user, String topic) {
    	super(MessageType.UNSUBSCRIBE, user);
    	this.topic = topic;
    }

	// TODO:
	// Implement object variables - a topic is required
    private String topic;
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
    public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "SubscribeMsg [topic=" + topic + "]" + super.toString();
	}
}
