package cts.serban.madalina.g1094.pattern.simpleFactory;

public class Client {
	
	String name;
	OnlineBooking ticket;
	
	public Client(String name, OnlineBooking ticket) {
		super();
		this.name = name;
		this.ticket = ticket;
	}
	
	public void setTicket(OnlineBooking ticket) {
		this.ticket = ticket;
	}
	
}
