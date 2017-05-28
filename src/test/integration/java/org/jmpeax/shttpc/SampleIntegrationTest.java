package org.jmpeax.shttpc;

import org.testng.annotations.Test;
import com.jpmeax.shttpc.Sample;

import static org.testng.Assert.assertTrue;

/**
 * Created by cortiz on 5/27/17.
 */
public class SampleIntegrationTest {

    /**
     * Sample Test.
     */
    @Test
    public void isFalse() {
        Sample sample = new Sample();
        assertTrue(!sample.returnFalse());
    }
}
