package com.java.examples.permutation;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * @author kenshin579
 */
@Slf4j
public class StringPermutation {

	public static ArrayList<String> permuteStr1(String str) {
		ArrayList<String> temp = new ArrayList<String>();

		if (str.length() == 1) {
			System.out.println("one: " + str);
			temp.add(str);
			//			return temp;
		} else {
			char firstChar = str.charAt(0);
			String restStr = str.substring(1);

			System.out.format("restStr: %s\n", restStr);
			ArrayList<String> permutedStr = permuteStr1(restStr);

			for (String each : permutedStr) {
				System.out.format("%c|%s\n", firstChar, each);
				ArrayList<String> additions = insertCharAtString(firstChar, each);
				temp.addAll(additions);
			}
		}

		return temp;
	}

	private static ArrayList<String> insertCharAtString(char firstChar,
			String each) {
		ArrayList<String> temp = new ArrayList<String>();

		for (int i = 0; i <= each.length(); i++) {
			String newStr = each.substring(0, i) + firstChar + each.substring(i);

			temp.add(newStr);
		}

		return temp;
	}

	public static void permuteStr3(String str) {
		permuteStr3("", str);
	}

	private static void permuteStr3(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++) {
				String prefixStr = prefix + str.charAt(i);
				String postStr = str.substring(0, i) + str.substring(i + 1, n);
				//	    		System.out.format("[%s]|[%s] => [%s]+[%c] | [%s]+[%s]\n", prefixStr, postStr, prefix, str.charAt(i),
				//	    				str.substring(0, i), str.substring(i+1, n));

				permuteStr3(prefixStr, postStr);
			}
		}
	}

	public static void main(String[] args) {
		//
		System.out.println("-------------------------------");
		ArrayList<String> result = new ArrayList<String>();

		//		result = permuteString("A");
		//		result = permuteString("BC");
		//		result = permuteStr5("ABC");

		System.out.println("-------------------------------");
		for (String str : result) {
			System.out.println(str);
		}

		System.out.println("-------------------------------");
		//		swappingPermute("C");
		//		swappingPermute("BC");
		//        swappingPermute("ABC");

	}

	/**
	 * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
	 * <p>
	 * permutation function
	 *
	 * @param str string to calculate permutation for
	 * @param l   starting index
	 * @param r   end index
	 */
	public void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				log.info("str:{} l:{} - i:{}", str, l, i);
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 *
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
