package com.java.examples.permutation;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kenshin579
 */
@Slf4j
public class StringPermutation {

	public static ArrayList<String> getPermutatedStringAsList(String str) {
		ArrayList<String> temp = new ArrayList<>();

		if (str.length() == 1) {
			temp.add(str);
			log.info("str: {} temp: {}", str, temp);
			//			return temp;
		} else {
			char firstChar = str.charAt(0);
			String restStr = str.substring(1);

			log.info("restStr: {}", restStr);
			ArrayList<String> permutedStr = getPermutatedStringAsList(restStr);

			for (String each : permutedStr) {
				log.info("{}|{}", firstChar, each);
				List<String> additions = insertCharAtString(firstChar, each);
				temp.addAll(additions);
			}
		}

		return temp;
	}

	private static List<String> insertCharAtString(char firstChar,
												   String each) {
		ArrayList<String> temp = new ArrayList<>();

		for (int i = 0; i <= each.length(); i++) {
			String newStr = each.substring(0, i) + firstChar + each.substring(i);

			temp.add(newStr);
		}

		return temp;
	}

	public static void permuteStrWithPrefixStr(String str) {
		permuteStrWithPrefixStr("", str);
	}

	private static void permuteStrWithPrefixStr(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			log.info(prefix);
		else {
			for (int i = 0; i < n; i++) {
				String prefixStr = prefix + str.charAt(i);
				String postStr = str.substring(0, i) + str.substring(i + 1, n);
				log.info("[{}]|[{}] => [{}]+[{}] | [{}]+[{}]",
						prefixStr, postStr, prefix, str.charAt(i),
					    str.substring(0, i), str.substring(i+1, n));

				permuteStrWithPrefixStr(prefixStr, postStr);
			}
		}
	}

	/**
	 * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
	 * <p>
	 * todo : 이거 잘 이해가 안됨 (1/2)
	 * https://www.youtube.com/watch?v=GuTPwotSdYw
	 */
	public static void printPermutedString(String str) {
		permute(str, 0, str.length() - 1);
	}

	public static int methodRunCount = 0;
	public static void permute(String str, int startIndex, int endIndex) {
		log.info("{}.START str:{} s:{} e:{}", methodRunCount++, str, startIndex, endIndex);
		if (startIndex == endIndex)
			log.info(str);
		else {
			for (int i = startIndex; i <= endIndex; i++) {
				log.info(" str:{} s:{} i:{}", str, startIndex, i);
				String str1 = swap(str, startIndex, i); //
				log.info(" str1:{} {} <-> {} s:{} i:{}", str1, str1.charAt(startIndex), str1.charAt(i), startIndex, i);
				permute(str1, startIndex + 1, endIndex); //다음 char를 선택해라
				String str2 = swap(str1, startIndex, i); //이것의 역할은 뭔가?
				log.info(" str2:{} {} <-> {} s:{} i:{}", str2, str2.charAt(startIndex), str2.charAt(i), startIndex, i);
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
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
