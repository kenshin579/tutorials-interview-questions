package com.google;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class BalancedParenthesisTest {

    @Test
    public void isOpenTerm() {
        assertThat(BalancedParenthesis.isOpenTerm('{')).isTrue();
        assertThat(BalancedParenthesis.isOpenTerm('(')).isTrue();
        assertThat(BalancedParenthesis.isOpenTerm('[')).isTrue();

        assertThat(BalancedParenthesis.isOpenTerm('}')).isFalse();
        assertThat(BalancedParenthesis.isOpenTerm(']')).isFalse();
        assertThat(BalancedParenthesis.isOpenTerm(')')).isFalse();
    }

    @Test
    public void isBalanced() {
        assertThat(BalancedParenthesis.isBalanced("{{[]}}")).isTrue();
        assertThat(BalancedParenthesis.isBalanced("{}[{()}]({})")).isTrue();
        assertThat(BalancedParenthesis.isBalanced("[()(()){}]")).isTrue();
    }

    @Test
    public void isNotBalanced() {
        assertThat(BalancedParenthesis.isBalanced("[]{{}")).isFalse();
        assertThat(BalancedParenthesis.isBalanced("[{{]]}]{{}")).isFalse();
        assertThat(BalancedParenthesis.isBalanced("}[[]")).isFalse();
    }
}