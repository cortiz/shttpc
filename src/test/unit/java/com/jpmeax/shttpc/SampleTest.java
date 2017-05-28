package com.jpmeax.shttpc;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

/**
 * Created by cortiz on 5/27/17.
 */
public class SampleTest {

    /**
     * Sample Test.
     */
    @Test
    public void isFalse() {
        Sample sample = new Sample();
        assertFalse(sample.returnFalse());
    }
}
