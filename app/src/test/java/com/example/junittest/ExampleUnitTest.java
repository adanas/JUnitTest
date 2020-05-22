package com.example.junittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /*
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
*/

    private Caluculator mCaluculator;

    @Before
    public void setUp() throws Exception {
        // インスタンス生成
        mCaluculator = new Caluculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(2, mCaluculator.sum(1,6), 0);
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(3, mCaluculator.substract(5,3), 0);
    }

}