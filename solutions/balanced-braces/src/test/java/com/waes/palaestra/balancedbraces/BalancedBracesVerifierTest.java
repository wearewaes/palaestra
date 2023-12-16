package com.waes.palaestra.balancedbraces;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BalancedBracesVerifierTest {
    BalancedBracesVerifier verifier = new BalancedBracesVerifier();

    @ParameterizedTest
    @ValueSource(strings = {"()", "[]", "{}"})
    void givenSingleOpenAndCloseShouldBeBalanced(String input) {
        assertTrue(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(())", "[[]]", "{{}}"})
    void givenNestedSameOpenAndCloseShouldBeBalanced(String input) {
        assertTrue(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{[()]}", "({[]})", "([{}])"})
    void givenNestedOpenAndCloseShouldBeBalanced(String input) {
        assertTrue(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(a)", "b[]", "{}c"})
    void givenOpenAndCloseWithWeirdCharacterShouldBeBalanced(String input) {
        assertTrue(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"{}([])", "{()}[[{}]]"})
    void givenMultipleNestedOpenAndCloseShouldBeBalanced(String input) {
        assertTrue(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"[", "]", "(", ")", "{", "}"})
    void givenSingleOpenOrCloseShouldBeUnbalanced(String input) {
        assertFalse(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"[[", "]]", "((", "))", "{{", "}}"})
    void givenDoubleOpenOrCloseShouldBeUnbalanced(String input) {
        assertFalse(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"[)", "(}", "{]", "[{]}", "{(])"})
    void giveOpenAndCloseWithDifferentSymbolShouldBeUnbalanced(String input){
        assertFalse(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"[()", "{[])", "[]{)"})
    void giveSomeOpenAndCloseShouldBeUnbalanced(String input){
        assertFalse(verifier.verify(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "a", "<>"})
    void giveNoOpenAndCloseShouldBeBalanced(String input){
        assertTrue(verifier.verify(input));
    }
}