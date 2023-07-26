package test;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {

	public static List<String> generateCombinations(String[] arr) {
		List<String> result = new ArrayList<>();
		generateCombinationsHelper(arr, 0, new StringBuilder(), result);
		return result;
	}

	private static int generateCombinationsHelper(String[] arr, int index, StringBuilder current, List<String> result) {
		if (index == arr.length) {
			String combination = current.toString();
			result.add(combination);
			return combination.length();
		}

		int combinationsLength = 0;

		// Include the current string and move to the next index
		combinationsLength += generateCombinationsHelper(arr, index + 1, current.append(arr[index]), result);
		current.delete(current.length() - arr[index].length(), current.length()); // backtrack

		// Skip the current string and move to the next index
		combinationsLength += generateCombinationsHelper(arr, index + 1, current, result);

		return combinationsLength;
	}

	public static void main(String[] args) {
		String[] arr = { "", "@", "15" , "05","2000" };
		List<String> combinations = generateCombinations(arr);
		int totalCombinations = combinations.size();
		int x=0;
		// Print the combinations and their lengths
		for (String combination : combinations) {
			x++;
			System.out.println(x+ ". " +combination + " (length: " + combination.length() + ")");
		}

		System.out.println("Total number of combinations: " + totalCombinations);
	}
}
