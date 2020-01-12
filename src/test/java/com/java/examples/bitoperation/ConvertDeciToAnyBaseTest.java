package com.java.examples.bitoperation;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ConvertDeciToAnyBaseTest {

	/**
	 * https://www.geeksforgeeks.org/convert-base-decimal-vice-versa/
	 *
	 * 10 -> base: 2 : 1010
	 */
	@Test
	public void convertDeciToAnyBase() {
		assertThat(ConvertDeciToAnyBase.convertToAnyBase(10, 2)).isEqualTo("1010");
	}
}