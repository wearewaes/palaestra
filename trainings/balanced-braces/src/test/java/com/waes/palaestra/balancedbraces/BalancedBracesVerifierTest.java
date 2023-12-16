package com.waes.palaestra.balancedbraces;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class BalancedBracesVerifierTest {
    BalancedBracesVerifier verifier = new BalancedBracesVerifier();

    @Test
    void givenOpenedAndClosedBracesShouldBeBalanced() {
        assertTrue(verifier.verify("()"));
    }

    @Test
    void givenOpenedBraceShouldBeUnbalanced() {
        assertFalse(verifier.verify("("));
    }

    @Test
    void giveOpenedBracketsShouldBeUnbalanced(){
        assertFalse(verifier.verify("([)"));
    }

    @Test
    void giveOpenedAndClosedBracketsShouldBeBalanced(){
        assertTrue(verifier.verify("[()]"));
    }

    @Test
    void giveEvenNumberOfDifferentCharsShouldBeUnbalanced(){
        assertFalse(verifier.verify("[()}"));
    }

    @Test
    void givenTwoOpeningsShouldBeUnbalanced() {
        assertFalse(verifier.verify("[["));
    }

    @Test
    void givenBalancedPunctuationButWithRandomStringShouldBeBalanced(){
        assertTrue(verifier.verify("{()*8}[2+[{a}]-1]"));
    }

    @Test
    void givenOpenedAndClosedWithDifferentPunctuationShouldBeUnbalanced() {
        assertFalse(verifier.verify("[)"));
    }
}