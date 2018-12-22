
public class Wilder {
	
	public String firstName;
	public boolean aware;
	
	public Wilder(String firstName, boolean aware) {
		this.firstName = firstName;
		this.aware =aware;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public boolean isAware() {
		return this.aware;
	}
	
	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	public String whoAmI() {
		
		if ( this.aware == true ) {
			return "Je m'appelle " + this.getFirstName() + " et je suis aware";
		}else {
			return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
		}
	}
        
}
