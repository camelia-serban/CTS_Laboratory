package ro.ase.cts.simpleFactory;

public class StylesFactory {

	public static AbstractStyle getStyle(StylesType type, String description) {
		
		AbstractStyle style = null;
		
		switch(type) {
		case CUT_CREASE:
			style = new Cut_Crease("Cut-crease makeup", 180);
			break;
		case SMOKEY_EYES:
			style = new Smokey_Eyes("Smokey eyes", 160);
			break;
		case BALAYAGE:
			style = new Balayage();
			break;
		case LIGHT_CURLS:
			style = new Light_curls();
			break;
		default:
			throw new UnsupportedOperationException("Style no covered");
		}
		return style;
	}
	
}
