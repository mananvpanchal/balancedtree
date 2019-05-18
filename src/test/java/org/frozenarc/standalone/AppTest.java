package org.frozenarc.standalone;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01()
    {
        List<Integer> input = Arrays.asList(34, 73, 53, 98, 64, 23, 75, 35, 64, 45);

        App.tree(input);
    }

    @Test
    public void test02()
    {
        List<Integer> input = Arrays.asList(34, 73, 53, 98, 64, 23, 75, 35, 64);

        App.tree(input);
    }
}
