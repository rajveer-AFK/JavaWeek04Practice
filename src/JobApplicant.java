
public class JobApplicant {
	
	private String name;
	private String phoneNumber;
	private boolean hasWordProcessingSkill;
	private boolean hasSpreadsheetsSkill;
	private boolean hasDatabasesSkill;
	private boolean hasGraphicsSkill;
	
	public JobApplicant(String name, String phone_number, boolean word_processing_skill, boolean has_spreadsheets_skill, boolean databases_skill, boolean graphics_skill) {
		this.name = name;
		this.phoneNumber = phone_number;
		hasWordProcessingSkill = word_processing_skill;
		hasSpreadsheetsSkill = has_spreadsheets_skill;
		hasDatabasesSkill = databases_skill;
		hasGraphicsSkill = graphics_skill;
	}
	
	// Getters for all fields
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public boolean hasWordProcessingSkill() {
		return hasWordProcessingSkill;
	}
	
	public boolean hasSpreadsheetsSkill() {
		return hasSpreadsheetsSkill;
	}

	public boolean hasDatabasesSkill() {
		return hasDatabasesSkill;
	}

	public boolean hasGraphicsSkill() {
		return hasGraphicsSkill;
	}
	
	
}
