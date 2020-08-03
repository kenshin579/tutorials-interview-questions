package com.geeksforgeeks.dp;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SubsetSumTest {

    /**
     * 반환 값 : set중에 target sum과 같은 subset이 있는지 없는지 boolean 값으로 알려줌
     */
    @Test
    public void isSubsetSum() {
        int[] set = {3, 11, 4, 10, 5, 2};

        assertThat(new SubsetSum().isSubsetSum(set, 9)).isTrue();
    }

    @Test
    public void isSubsetSum2() {
        int[] set = {3, 34, 4, 12, 5, 2};

        assertThat(new SubsetSum().isSubsetSum(set, 30)).isFalse();
    }

    @Test
    public void isSubsetSum3() {
        int[] set = {3, 4, 5, 2};

        assertThat(new SubsetSum().isSubsetSum(set, 6)).isTrue();
    }

    @Test
    public void isSubsetSum4() {
        int[] set = {3, 4, 5, 2};

        assertThat(new SubsetSum().isSubsetSum(set, 6)).isTrue();
    }
}