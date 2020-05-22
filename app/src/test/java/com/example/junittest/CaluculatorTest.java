package com.example.junittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaluculatorTest {

    private Caluculator mCaluculator;

    @Before
    public void setUp() throws Exception {
        // インスタンス生成
        mCaluculator = new Caluculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(7, mCaluculator.sum(1,6), 0);
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(2, mCaluculator.substract(5,3), 0);
    }
}