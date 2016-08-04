package com.seriouscompany.junittest;

import dalvik.annotation.TestTargetClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


/**
 * Created by johnny on 15. 10. 20.
 */
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(10, 10);
        int expected = 10 + 10;
        assertTrue(actual == expected);
    }
}
