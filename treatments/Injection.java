package treatments;

public class Injection extends Medicine {
	private String needleType;
	private String needleVolume;

	public Injection(String doctor, int nbTimes, int nbDays, int postponeDays, String name, String description) {
		super(doctor, nbTimes, nbDays, postponeDays, name,description);
	}

	public Injection(String doctor, int nbTimes, int nbDays, int postponeDays, String name, String description,
			String needleType, String needleVolume) {
		super(doctor, nbTimes, nbDays, postponeDays, name,description);
		this.needleType = needleType;
		this.needleVolume = needleVolume;
	}


	public String getNeedleType() {
		return needleType;
	}

	public String getNeedleVolume() {
		return needleVolume;
	}

	public void setNeedleVolume(String needleVolume) {
		this.needleVolume = needleVolume;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s+= ("\nthe type of this needle is: " + this.needleType ) ;
		s+= ("\nthe volume of this needle is: " + this.needleVolume) ;
		return s;
	}
}