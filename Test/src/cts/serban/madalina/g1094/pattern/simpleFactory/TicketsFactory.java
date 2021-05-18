package cts.serban.madalina.g1094.pattern.simpleFactory;

public class TicketsFactory {

	public static OnlineBooking getTicket(TicketTypes type, String description) {
		
		OnlineBooking ticket = null;
		
		switch(type) {
		case CONCERT:
			ticket = new Concert();
			break;
		case MUSEUM:
			ticket = new Museum("Museum", 150);
			break;
		case EVENT:
			ticket = new Event("Event", 250);
			break;
		default:
			throw new UnsupportedOperationException("Type not found");			
		}
					
		return ticket;
	}
	
}
