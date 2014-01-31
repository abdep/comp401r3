Recitation 3
=========
####by Brian Cristante

Consider the following code for a coin in US currency:

	public class Coin {		String name;		int value; // in cents		public Coin(String name, int value) {			this.name = name;			this.value = value;		}	}

Users could make reasonable coins:
	new Coin(“dime”, 10)but they could also make nonsense:
	new Coin(“noncents”, 22)or worse:
	new Coin(“quarter”, 62)How can we restrict our options to a finite set of values?  
## enums
An enum (short for “enumeration”) is a special kind of class that contains a finite number of variables that are
* static* public* finalby default.Let’s see how this is useful:	public class Coin {		Name name; // We’ll define the “Name” type as an enum below		int value;		// We could put this in its own file if we wanted		public enum Name {			PENNY,			NICKEL,			DIME,			QUARTER;		}		public Coin(Name name, int value) {			this.name = name;			this.value = value;		}	}Now, we can say things like	new Coin(Name.QUARTER, 25)What if we want to restrict the values as well? We can do this easily in enums also:
	public class Coin {
    	Name name; // We’ll define the Name type as an enum below
    
    	public enum Name {
        	PENNY(1),
	        NICKEL(5),
    	    DIME(10),
        	QUARTER(25);

	        private int value; // move value inside the enum

    	    // Enums use private constructor
        	private Name(int value) {
            	this.value = value;
        	}
        
        	public int getValue() {
        		return value;
        	}
    	}

    	public Coin(Name name) {
        	this.name = name;
    	}
    
	}Then we can get a predifined value like this
	new Coin(Name.DIME).name.getValue()OK, let's start to fill in the practice program.