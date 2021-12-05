package treatments;

public abstract class Treatment {
	
	protected static int count = 0;
	protected int id;
	protected double cost;
	protected String doctor;
	protected int nbTimes; //How many times this medicine will be taken each day.
	protected int nbDays; //How many days?
	protected int postponeDays; //Once it is taken a day, how many days to wait before taking it again? (0 = take it everyday)
	
	//Constructors
	Treatment(){
		id = ++count; 
	}
	public Treatment(String doctor, int nbTimes, int nbDays, int postponeDays) {
		this.doctor = doctor;
		this.nbTimes = nbTimes;
		this.nbDays = nbDays;
		this.postponeDays = postponeDays;
		id = ++count;  
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public double getCost() {
		return cost;
	}
	public String getDoctor() {
		return doctor;
	}
	public int getNbDays() {
		return nbDays;
	}
	public int getNbTimes() {
		return nbTimes;
	}
	public int getPostponeDays() {
		return postponeDays;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setNbDays(int nbDays) {
		this.nbDays = nbDays;
	}
	public void setNbTimes(int nbTimes) {
		this.nbTimes = nbTimes;
	}
	public void setPostponeDays(int postponeDays) {
		this.postponeDays = postponeDays;
	}

	public String getFrequency() {
		String a = new String();
		if(nbTimes == 1) {
			a = "once" ;
		}
		else {
			a = nbTimes + " times" ;
		}
		String b;
		if(nbDays == 1) {
			b = "1 day" ;
		}
		else {
			b = nbDays + " days" ;
		}
		String c; 
		if(postponeDays == 0) {
			c = "" ;
		}
		else if (postponeDays == 1) {
			c = "However, If it is taken one day, the patient should wait 1 day before taking it again.";
		}
		else {
			c = "However, If it is taken one day, the patient should wait "+postponeDays+" days before taking it again.";			
		}	 
		return "This treatment should be taken "+a+" a day, for a period of "+b+". "+c;
	}
	public String toString() {
		return "Treatment id: "+id+"\n" + "cost"+cost+"\n" +"Treatment prescribed by dr: "+doctor+"\n" + this.getFrequency();
	}
}
