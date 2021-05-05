package ro.ase.cts.simpleFactory;

public class Client {
	
	String name;
	AbstractStyle style;
	
	public Client(String name, AbstractStyle style) {
		super();
		this.name = name;
		this.style = style;
	}
	
	public void setStyle(AbstractStyle style) {
		this.style = style;
	}
}
