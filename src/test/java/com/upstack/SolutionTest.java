package com.upstack;

import org.junit.jupiter.api.Test;

import static com.upstack.Solution.formatString;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

   @Test
   public void testcase1() {
       String result = formatString(new int[]{2, 2, 0, 0, 0, 0, 0, 1});
       assertEquals("2 FOR 2 0 FOR 5 1", result);
   }

    @Test
    public void testcase2() {
        String result = formatString(new int[]{1,1,1,1,1,0});
        assertEquals("1 FOR 5 0", result);
    }

    @Test
    public void testcase3() {
        String result = formatString(new int[]{1,2,3,4,6,5,5,5,5,5,5,5,5,5,5});
        assertEquals("1 2 3 4 6 5 FOR 10", result);
    }

}
