package Practice_Problrm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistinctNumberCount {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 5, 6 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			int count = 0;
			for (int j : arr) {
				if (i == j) {
					count++;
				}
				map.put(i, count);
			}
		}
		Set<Integer> numSet = new HashSet<Integer>();
		for (Integer key : map.keySet()) {
			numSet.add(map.get(key));
		}
		// printing of set type 1
		numSet.forEach(System.out::println);
		// printing of set type 2
		for (Integer element : numSet) {
			System.out.println(element);
		}

	}

}
