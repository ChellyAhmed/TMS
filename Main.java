import treatments.Injection;
import treatments.Pills;
import treatments.Therapy;
import treatments.Treatment;
import patients.Patient;
import java.util.*;

public class Main {
	public static void main(String[] rgs) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Hello, user.");
		System.out.println("We will start by setting your parameters");
		System.out.println("Please input your name: ");
		String name = stdin.nextLine();
		System.out.println("Please input your age: ");
		int age = stdin.nextInt();
		Patient patient = new Patient(name, age);
		System.out.println("The patient was successfully created!");
		System.out.println(patient); // the toString function in the Patient class uses a try catch exception bloc
		System.out.println("How many treatments does this patient have?");
		int n = stdin.nextInt();
		String choice, doctor, medicine_name, description, needleType, needleVolume, therapist;
		int nbTimes, nbDays, postponeDays;
		double cost;
		for (int i = 0; i < n; i++) {
			System.out.println("Treatment number: " + (i + 1));
			System.out.println("What's the name of the doctor who prescribed this treatment?");
			doctor = stdin.next();
			System.out.println("How many times a day should this treatment be taken?");
			nbTimes = stdin.nextInt();
			System.out.println("For how many days?");
			nbDays = stdin.nextInt();
			System.out.println(
					"Once this treatment is taken, how many days should the patient wait before taking it again?");
			postponeDays = stdin.nextInt();
			System.out.println("How much is this treatment going to cost the patient?");
			cost = stdin.nextDouble();
			System.out.println("What kind of treatment is it?\n1-Pills\n2-Injections\nelse-Physical therapy");
			choice = stdin.next();
			try {

				if (Integer.parseInt(choice) == 1) {
					System.out.println("What's the name of the pills?");
					medicine_name = stdin.next();
					System.out.println("Describe the pills:");
					description = stdin.next();
					patient.addTreatment(new Pills(doctor, nbTimes, nbDays, postponeDays, medicine_name, description));

				} else if (Integer.parseInt(choice) == 2) {
					System.out.println("What's the name of the injection?");
					medicine_name = stdin.next();
					System.out.println("Describe the injection:");
					description = stdin.next();
					System.out.println("What is the type of the needle used for this injection?");
					needleType = stdin.next();
					System.out.println("What is its volume?");
					needleVolume = stdin.next();
					patient.addTreatment(new Injection(doctor, nbTimes, nbDays, postponeDays, medicine_name,
							description, needleType, needleVolume));
				}
				else {
					throw new NumberFormatException() ;
				}
			} catch (NumberFormatException e) {
				System.out.println("What's the name of the therapist who will perform it?");
				therapist = stdin.next();
				patient.addTreatment(new Therapy(doctor, nbTimes, nbDays, postponeDays, therapist));
			} finally {// Finally bloc
				patient.getTreatments().get(patient.getTreatments().size()-1).setCost(cost); // This line was used in this
																							// non efficient way on
																							// purpose to call the "set"
																							// method, and the "get"
																							// method as the getters and
																							// setters were not
																							// frequently used in this
																							// project.

			}

		}
		System.out.println("We have registered all the treatments. Here is an overview of the patient: ");
		System.out.println(patient);
		System.out.println("Here is an overview of their treatments: ");
		patient.displayAllTreatments();
		stdin.close();
	}

}
