package treatments;

public class Medicine extends Treatment {
	
	protected String name;
	protected String description;
	public Medicine(String doctor, int nbTimes, int nbDays, int postponeDays, String name, String description) {
		super(doctor, nbTimes, nbDays, postponeDays);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String toString() {
		String s = super.toString();
		return (s+"This medicine's name: "+this.name +". this medicine's description is: "+this.description);
		
	}

}
