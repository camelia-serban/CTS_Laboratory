package ro.ase.csie.cts.dp.chain;

public class Message {

	String destination;
	String text;
	int priority;
	
	
	public Message(String destination, String text, int priority) {
		super();
		this.destination = destination;
		this.text = text;
		this.priority = priority;
	}
	
}
