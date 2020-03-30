package WarmupChallenges;

public class CountingValleys {
	public static void main(String[] args) {
		String path = "UDDDUDUU";
		System.out.println(countingValleys(8, path));
	}
	
	/** Approach:
	 * ----------
	 * If we see a D, we are adding -1 to seaLevel.
	 * If we see a U, we are adding +1 to seaLevel.
	 * When the seaLevel is 0, we are checking what is that step....Is it D or U
	 * if it is U, we are counting that as valley...
	 * 
	 * 
	 * For a valley, when you are reaching seaLevel....last step would be U...
	 * For a Mountain, when you are reaching seaLevel....last step would be D...
	 * */
	public static int countingValleys(int n, String s) {
		int seaLevel = 0;
		int valleys = 0;
		for(int i = 0; i < n; i++) {
			char step = s.charAt(i);
			if(step == 'U') {
				seaLevel += 1;
			} else if(step == 'D') {
				seaLevel -= 1;
			}
			
			if(seaLevel == 0 && step == 'U') {
				valleys += 1;
			}
		}
		return valleys;
    }
}
