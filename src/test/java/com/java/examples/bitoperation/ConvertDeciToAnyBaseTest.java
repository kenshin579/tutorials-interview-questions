package com.java.examples.bitoperation;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ConvertDeciToAnyBaseTest {

	/**
	 * https://www.geeksforgeeks.org/convert-base-decimal-vice-versa/
	 * <p>
	 * 10 -> base: 2 : 1010
	 */
	@Test
	public void convertDeciToAnyBase1() {
		int n = 10;
		int base = 2;
		assertThat(ConvertDeciToAnyBase.convertToAnyBase(n, base)).isEqualTo(Integer.toString(n, base));
	}

	@Test
	public void convertDeciToAnyBase2() {
		int n = 300;
		int base = 8;
		assertThat(ConvertDeciToAnyBase.convertToAnyBase(n, base)).isEqualTo(Integer.toString(n, base));
	}
}