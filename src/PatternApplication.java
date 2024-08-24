
public class PatternApplication {

	public static void main(String[] args) {
		
		// Displays the first pattern
		int numRows = 6;
		
		for(int currentRow = 1; currentRow <= numRows; currentRow++) {
			for(int numStars = 1; numStars <= currentRow; numStars++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Displays the second pattern
		System.out.println();
		numRows = 5;
		
		for(int currentRow = 1; currentRow <= numRows; currentRow++) {
			for(int numStars = currentRow; numStars <= numRows; numStars++) {
				System.out.print("  ");
			}
			for(int numStars = 1; numStars < currentRow; numStars++) {
				System.out.print("* ");
			}
			for(int numStars = 1; numStars <= currentRow; numStars++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
