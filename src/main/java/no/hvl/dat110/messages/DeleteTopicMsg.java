package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker // Create???

    public DeleteTopicMsg(String user, String topic) {
    	this.user = user;
    	this.topic = topic;
    }

	// TODO:
	// Implement object variables - a topic is required
    private String user;
    private String topic;
    
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
    public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		return "CreateTopicMsg [user=" + user + ", topic=" + topic + "]";
	}
}
