package cts.serban.madalina.g1094.pattern.simpleFactory;

public class Concert extends OnlineBooking{

	public Concert(String eventName, int price) {
		super(eventName, price);
	}
	
	public Concert() {
		super("Concert", 200);
	}


	@Override
	public String getType() {
		return this.eventName;
	}

}
