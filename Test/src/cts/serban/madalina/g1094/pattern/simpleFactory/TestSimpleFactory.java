package cts.serban.madalina.g1094.pattern.simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		Client Mary = new Client("Mary", TicketsFactory.getTicket(TicketTypes.CONCERT, "Concert"));
		Mary.setTicket(TicketsFactory.getTicket(TicketTypes.MUSEUM, "MSM"));
		
		System.out.println(Mary.name);
		
		Client Jack = new Client("Jack", TicketsFactory.getTicket(TicketTypes.MUSEUM, "Museum"));
		Client John = new Client("John", TicketsFactory.getTicket(TicketTypes.EVENT, "Event"));
		
	}

}
