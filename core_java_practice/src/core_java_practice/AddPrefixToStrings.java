package core_java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddPrefixToStrings {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		
		String prefix = "fruit_";
		List<String> modifiedStrings = AddPrefixToStrings(strings, prefix);
		System.out.println("Modified Strings : " + modifiedStrings);
	}

	private static List<String> AddPrefixToStrings(List<String> strings, String prefix) {
		List<String> modifiedStrings = new ArrayList<>();
		for (String str : strings) {
			String modifiedString = prefix + str;
			modifiedStrings.add(modifiedString);
		}
		return modifiedStrings;
	}

}
