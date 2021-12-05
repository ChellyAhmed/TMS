package treatments;

public class Therapy extends Treatment {
	private String therapist;
	public Therapy(String doctor, int nbTimes, int nbDays, int postponeDays, String therapist) {
		super(doctor, nbTimes, nbDays, postponeDays);
		this.therapist = therapist;
	}
	public String getTherapist() {
		return therapist;
	}
	public void setTherapist(String therapist) {
		this.therapist = therapist;
	}
	public String toString() {
		String s = super.toString();
		return (s + "\nThis physical therapy is being practiced by the physical therapist: "+ this.therapist);
		
		
		
	}

	
	
	
}
