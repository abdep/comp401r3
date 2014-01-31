package solutions;

// A class with two nested enum classes
public class PowerCrystal {
	
	/* Instance Variables */
	private Type type;
	// no color here!
	
	/* Constructors */
	public PowerCrystal(Type type) {
		this.type = type;
	}
	
	/* Nested Class Definitions */
	
	public enum Color {
		BLUE, 
		GREEN, 
		YELLOW, 
		PURPLE,
		SILVER,
		RED;
		
		// No instance variables -- don't need a constructor here
	}
	
	
	public enum Type {
		BONDAR (Color.GREEN), // We use the enum name to access the variable. Why?
		ILUM (Color.GREEN), 
		KATAK (Color.BLUE),
		LORDDIAN (Color.YELLOW),
		RUBAT (Color.PURPLE),
		RUUSAN (Color.BLUE),
		SIGIL (Color.SILVER),
		SYNTH (Color.RED);
		
		private Color color; // an enum within an enum? What?
		
		// Remember, an enum uses only private constructors
		private Type(Color color) {
			this.color = color;
		}
		
		// Don't forget this!
		public Color getColor() {
			return color;
		}
	}
	
	/* Getters and Setters */
	public Type getType() {
		return type;
	}
	
	// A little tricky
	public Color getColor() {
		return type.getColor();
	}
}
