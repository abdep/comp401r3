package fillin;

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
	
	/* FILL IN #1
	 * Make a public enum 'Color' representing the following choice of colors:
	 * blue, green, yellow, purple, silver, and red
	 */
	public enum Color {
		
	}
	
	/* FILL IN #2
	 * Make it so each crystal type corresponds to one of the colors you defined above.
	 */
	public enum Type {
		BONDAR,
		ILUM, 
		KATAK,
		LORDDIAN,
		RUBAT,
		RUUSAN,
		SIGIL,
		SYNTH;
		
		// HINT: you need a private instance variable here for the color
		// corresponding to the type
		
		// HINT: to make your instance variable work for enums, you need:
		// (1) a private constructor
		// (2) a getter so you can access the value
	}
	
	
	/* Getters and Setters */
	
	public Type getType() {
		return type;
	}
	
	/* FILL IN #2
	 * Make a getter for the color of the crystal
	 */
}
