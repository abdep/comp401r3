package fillin;

import fillin.PowerCrystal.Color;
import fillin.PowerCrystal.Type;

/** This was the formal weapon of a Jedi Knight. 
 * Not as clumsy or random as a blaster. More skill than simple sight was required for its use. 
 * An elegant weapon. It was a symbol as well. 
 * Anyone can use a blaster or a fusioncutter -- 
 * but to use a lightsaber well was a mark of someone a cut above the ordinary."
 */
public class Lightsaber {
	
	/* Instance Variables */
	
	private int bladeLength; // in centimeters
	private PowerCrystal crystal;
	private boolean on = false;
	
	
	/* Constructors */
	
	// Full constructor
	public Lightsaber(int length, PowerCrystal crystal) {
		this.bladeLength = length;
		this.crystal = crystal;
	}
	
	public Lightsaber(PowerCrystal crystal) {
		this();
		this.crystal = crystal;
	}
	
	// Default constructor
	public Lightsaber() {
		this(145, new PowerCrystal(Type.ILUM)); // a pretty typical spec for a lightsaber
	}
	
	
	/* Getters and Setters */
	
	public int getLength() {
		return bladeLength;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void turnOn() {
		if (!on)
			on = true;
	}
	
	public void turnOff() {
		if (on)
			on = false;
	}
	
	/* FILL IN #4
	 * Make a getter for the color of your lightsaber
	 */
	/*public Color getColor() {
		
	}*/
	
	public Type getCrystalType() {
		return crystal.getType();
	}
}
