import javax.swing.JOptionPane;

public class TestJobApplicants {

	public static void main(String[] args) {
		
		// Creates and initializes 3 JobApplicant objects using user input
		JobApplicant applicant_one = createJobApplicant();
		JobApplicant applicant_two = createJobApplicant();
		JobApplicant applicant_three = createJobApplicant();
		
		displayApplicantDetails(applicant_one);
		displayApplicantDetails(applicant_two);
		displayApplicantDetails(applicant_three);
	}
	
	public static boolean determineYesOrNo(int choice) {
		
		return choice == JOptionPane.YES_OPTION;
	}
	
	public static JobApplicant createJobApplicant() {
		
		String applicantName = JOptionPane.showInputDialog(null, "Enter the applicants name", "Applicant Creation", 1);
		String applicantPhoneNumber = JOptionPane.showInputDialog(null, "Enter the applicants phone number", "Applicant Creation", 1);
		boolean hasWordProcessingSkill = determineYesOrNo(JOptionPane.showConfirmDialog(null, "Does the applicant have word processing skills?", "Applicant Creation", JOptionPane.YES_NO_OPTION));
		boolean hasSpreadsheetsSkill = determineYesOrNo(JOptionPane.showConfirmDialog(null, "Does the applicant have spreadsheet skills?", "Applicant Creation", JOptionPane.YES_NO_OPTION));
		boolean hasDatabasesSkill = determineYesOrNo(JOptionPane.showConfirmDialog(null, "Does the applicant have database skills?", "Applicant Creation", JOptionPane.YES_NO_OPTION));
		boolean hasGraphicsSkill = determineYesOrNo(JOptionPane.showConfirmDialog(null, "Does the applicant have graphics skills?", "Applicant Creation", JOptionPane.YES_NO_OPTION));
		
		return new JobApplicant(applicantName, applicantPhoneNumber, hasWordProcessingSkill, hasSpreadsheetsSkill, hasDatabasesSkill, hasGraphicsSkill); 
	}
	
	public static boolean determineIfApplicantIsQualified(JobApplicant applicant) {
		
		int numSkills = 0;
		
		if(applicant.hasWordProcessingSkill()) {
			numSkills += 1;
		}
		if(applicant.hasSpreadsheetsSkill()) {
			numSkills += 1;
		}
		if(applicant.hasDatabasesSkill()) {
			numSkills += 1;
		}
		if(applicant.hasGraphicsSkill()) {
			numSkills += 1;
		}
		
		return numSkills >= 3;
	}
	
	public static void displayApplicantDetails(JobApplicant applicant) {
		
		String applicantQualificationMessage = "";
		
		if(determineIfApplicantIsQualified(applicant)) {
			applicantQualificationMessage = "Applicant is qualified";
		}
		else {
			applicantQualificationMessage = "Applicant is not qualified";
		}
		
		JOptionPane.showMessageDialog(null, "Name: " + applicant.getName() + "\nPhone Number: " + applicant.getPhoneNumber()
									  + "\n" + applicantQualificationMessage);
	}
}
