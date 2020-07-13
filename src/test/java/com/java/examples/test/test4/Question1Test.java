package com.java.examples.test.test4;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class Question1Test {
	private int[] priceArray;

	@Before
	public void setUp() throws Exception {
		int maxPriceCount = 4000;

		//가격정보 배열
		priceArray = new int[maxPriceCount];
		for (int priceArrayIdx = 1; priceArrayIdx < maxPriceCount; priceArrayIdx++) {
			priceArray[priceArrayIdx - 1] = priceArrayIdx * 1000;
		}
	}

	@Test
	public void getSearchPriceArrayIndex() {
		int searchPrice = 690000;
		assertThat(Question1.getSearchPriceArrayIndex_binarySearch(priceArray, searchPrice))
				.isEqualTo(Question1.getSearchPriceArrayIndex(priceArray, searchPrice));
	}

	@Test
	public void getSearchPriceArrayIndex2() {
		int searchPrice = 20;

		assertThat(Question1.getSearchPriceArrayIndex_binarySearch(priceArray, searchPrice))
				.isEqualTo(Question1.getSearchPriceArrayIndex(priceArray, searchPrice));
	}
}