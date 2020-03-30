package WarmupChallenges;

import java.util.HashMap;
import java.util.Map.Entry;

public class SockMerchant {
	public static void main(String[] args) {
		int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(9, socks));
	}
	
	public static int sockMerchant(int n, int[] array) {
		int noOfPairs = 0;
		HashMap<Integer, Integer> lookup = new HashMap<>();
		for(int i = 0; i < n; i++) {
			lookup.put(array[i], lookup.getOrDefault(array[i], 0) + 1);
		}
		
		for(Entry<Integer, Integer> entry: lookup.entrySet()) {
			int value = lookup.get(entry.getKey());
			noOfPairs += value/2;
		}
		return noOfPairs;
    }
}
