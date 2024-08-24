import javax.swing.JOptionPane;

public class CellPhoneService {

	public static void main(String[] args) {
		
		// Gets talk and text minutes needed and data needed from the user
		int user_talk_minutes_needed = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minutes needed"));
		int user_text_messages_needed = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the messages needed"));
		int user_gigabytes_of_data_needed = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the gigabytes of data needed"));
		
		// Recommends the best plan for the user
		recommendPhonePlan(user_talk_minutes_needed, user_text_messages_needed, user_gigabytes_of_data_needed);
	}
	
	public static void recommendPhonePlan(int talk_minutes_needed, int text_messages_needed, int gigabytes_of_data_needed) {
		
		String phone_plan_recommendation = "";
		String data_plan_recommendation = "";
		
		if(talk_minutes_needed < 500) {
			if(text_messages_needed == 0 && gigabytes_of_data_needed == 0) {
				phone_plan_recommendation = "Plan A at $49 per month";
			}
			else {
				phone_plan_recommendation = "Plan B at $55 per month";
			}
		}
		
		if(talk_minutes_needed >= 500 && gigabytes_of_data_needed == 0) {
			if(text_messages_needed <= 100) {
				phone_plan_recommendation = "Plan C for up to 100 text messages at $61 per month";
			}
			else {
				phone_plan_recommendation = "Plan D for 100 text messages or more at $70 per month";
			}
		}
		
		if(gigabytes_of_data_needed <= 3) {
			data_plan_recommendation = "Plan E for up to 3 gigabytes at $79 per month";
		}
		else {
			data_plan_recommendation = "Plan F for 3 gigabytes or more at $87 per month";
		}
		
		JOptionPane.showMessageDialog(null, phone_plan_recommendation, "Phone Plan Recommendation", 1);
		JOptionPane.showMessageDialog(null, data_plan_recommendation, "Data Plan Recommendation", 1);
		
	}

}
