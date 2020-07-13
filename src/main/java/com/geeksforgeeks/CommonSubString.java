package com.geeksforgeeks;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * todo : 다시 확인이 필요함
 * https://www.geeksforgeeks.org/print-longest-common-substring/
 * https://en.wikipedia.org/wiki/Longest_common_substring_problem
 */
@Slf4j
public class CommonSubString {
	public static String getStr(String n, String n2) {
		Set<String> set = new HashSet();

		//모든 substring을 생성함
		for (int i = 0; i < n2.length(); i++) {
			for (int j = i; j < n2.length(); j++) {
				set.add(n2.substring(i, j + 1));
			}
		}

		log.info("{}", set);

		int max = 0;
		String maxStr = "";
		for (String key : set) {
			if (n.contains(key) && max < key.length()) {
				maxStr = key;
				max = key.length();
			}
		}
		return maxStr;
	}

	static int LCSubStr(String str1, String str2) {
		char[] X = str1.toCharArray();
		char[] Y = str2.toCharArray();
		int m = X.length;
		int n = Y.length;

		int LCStuff[][] = new int[m + 1][n + 1];
		int result = 0;  // To store length of the longest common substring

		// Following steps build LCSuff[m+1][n+1] in bottom up fashion
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					LCStuff[i][j] = 0;
				else if (X[i - 1] == Y[j - 1]) {
					LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
					result = Integer.max(result, LCStuff[i][j]);
				} else
					LCStuff[i][j] = 0;
			}
		}
		return result;
	}
}
