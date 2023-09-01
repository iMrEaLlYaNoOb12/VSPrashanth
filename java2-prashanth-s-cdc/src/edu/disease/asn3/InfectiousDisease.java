package edu.disease.asn3;

/**
 * 
 * InfectiousDisease is a sub-class of Disease, where it has a overriden method
 * getExamples() which return a String[]. The array contains infectious
 * diseases.
 *
 */
public class InfectiousDisease extends Disease {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This is a overriden method from Disease which return a String[]. The array
	 * contains infectious diseases.
	 * 
	 * @return String[]
	 */
	@Override
	public String[] getExamples() {
		String infectiousDisease[] = { "Chickenpox", "Diphtheria", "Influenza", "Influenza" };
		return infectiousDisease;
	}

}
