package WarmupChallenges;

public class RepeatedString {
	
	public static void main(String[] args) {
		String s = "aba";
		System.out.println(repeatedString(s, 10));
	}
	
	private static long repeatedString(String s, long n) {
		long stringLength = s.length();
		long dividend = n / stringLength;
		long remainder = n % stringLength;
		long occurenceOfAInCompleteString = countOccurences(s, 'a');
		String subString = s.substring(0, (int)remainder);
		return (dividend * occurenceOfAInCompleteString) + countOccurences(subString, 'a'); 
    }
	
	private static long countOccurences(String s, char ch) {
		long count = 0;
		for(int index = 0; index < s.length(); index++) {
			if(s.charAt(index) == ch) {
				count += 1;
			}
		}
		return count;
	}
}
