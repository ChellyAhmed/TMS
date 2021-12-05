package patients;

import java.util.*;
import treatments.Treatment;

public class Patient {
	private static int count = 0;
	private int id;

	private String name;
	private int age;
	private ArrayList<Treatment> treatments;

	public Patient() {
		id =  ++count;

	}

	public Patient(String name, int age) {
		super();
		this.id = ++count;
		this.name = name;
		this.age = age;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<Treatment> getTreatments() {
		return treatments;
	}

	public void addTreatment(Treatment newTreatment) {
		if (!(this.treatments == null)) {
			this.treatments.add(newTreatment);			
		}
		else {			
			this.treatments = new ArrayList<>(Arrays. asList(newTreatment));
		}
		System.out.println("Treatment successfully added. The patient has " + treatments.size() + "Treatments");
	}

	public void setTreatments(ArrayList<Treatment> treatments) {
		this.treatments = treatments;
	}
	
	public void displayAllTreatments() {
		
		if(this.treatments != null) {
			this.treatments.forEach((n) -> System.out.println(n));
			
		}
		else {
			System.out.println("This patietn has no treatments.");
		}
		
	}

	public String toString() {
		String s = new String();
		try {
			s = "The ID of this patient is: " + this.id;
			s += "\nThe name of this patient is: " + this.name;
			s += "\nThe age of this patient is: " + this.age;
			s += "\nThis patient has " + this.treatments.size() + "Treatments"; // This line throws a NullPointerException when the
																	// patient does not have any treatments.

			for (Treatment treatment : treatments) {
				treatment.toString();
			}
		} catch (NullPointerException e) {
			s = "The ID of this patient is: " + this.id;
			s += "\nThe name of this patient is: " + this.name;
			s += "\nThe age of this patient is: " + this.age;
			s += "\nThis patient has no treatments at all.";
		}
		return s;
	}

}
