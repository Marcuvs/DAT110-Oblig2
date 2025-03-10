package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		Client disClient = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
		
		// - connect to the broker - use "display" as the username
		disClient.connect();
		// - create the temperature topic on the broker
		String topic = "temperature";
		disClient.createTopic(topic);
		// - subscribe to the topic
		disClient.subscribe(topic);
		// - receive messages on the topic
		PublishMsg m;
		for(int i = 0; i<COUNT; i++) {
			m = null;
			do {
				m = (PublishMsg) disClient.receive();
			} while(m == null);
			System.out.println("READING: " + m.getMessage());
		}
		// - unsubscribe from the topic
		disClient.unsubscribe(topic);
		// - disconnect from the broker
		disClient.disconnect();
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
	}
}
