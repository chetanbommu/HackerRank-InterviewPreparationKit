package WarmupChallenges;

public class JumpingOnTheClouds {
	
	public static void main(String[] args) {
		int[] clouds = {0, 0, 1, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(clouds));
	}
	
	private static int jumpingOnClouds(int[] c) {
		int minimumNumberOfSteps = 0;
		int currentStep = 0;
		int lastStep = c.length - 1;
		
		while(currentStep != lastStep) {
			if(currentStep+2 <= lastStep && c[currentStep + 2] == 0) {
				currentStep = currentStep + 2;
			} else {
				/* No need to check if this step is 0. 
				 * Because we are told there is always a solution.  
				 * If 2nd step from current is not 0, then next step should definitely be 0. i.e.,safe cloud.
				 * */
				currentStep = currentStep + 1;
			}
			minimumNumberOfSteps += 1;
		}
		return minimumNumberOfSteps;
    }
}
