package com.upstack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

   @Test
   public void testcase1() {
       String result = new Solution().formatString(new int[]{2, 2, 0, 0, 0, 0, 0, 1});
       assertEquals("2 FOR 2 0 FOR 5 1", result);
   }

    @Test
    public void testcase2() {
        String result = new Solution().formatString(new int[]{1,1,1,1,1,0});
        assertEquals("1 FOR 5 0", result);
    }

    @Test
    public void testcase3() {
        String result = new Solution().formatString(new int[]{1,2,3,4,6,5,5,5,5,5,5,5,5,5,5});
        assertEquals("1 2 3 4 6 5 FOR 10", result);
    }

    @Test
    public void testcase4() {
        String result = new Solution().formatString(new int[]{5,5,5,5,5,5,5,5,5,5});
        assertEquals("5 FOR 10", result);
    }

    @Test
    public void testcase5() {
        String result = new Solution().formatString(new int[]{5,5});
        assertEquals("5 FOR 2", result);
    }

    @Test
    public void testcase6() {
        String result = new Solution().formatString(new int[]{5});
        assertEquals("5", result);
    }

    @Test
    public void testcase7() {
        String result = new Solution().formatString(new int[]{5,4,2});
        assertEquals("5 4 2", result);
    }

    @Test
    public void testcase8() {
        String result = new Solution().formatString(new int[]{5,4});
        assertEquals("5 4", result);
    }

    @Test
    public void testcase9() {
        String result = new Solution().formatString(new int[]{});
        assertEquals("", result);
    }

    @Test
    public void testcase10() {
        String result = new Solution().formatString(new int[]{1,2,3,4,6,5,5,5,5,5,5,5,5,5,5,1,2,3,4,6});
        assertEquals("1 2 3 4 6 5 FOR 10 1 2 3 4 6", result);
    }

    @Test
    public void testcase11() {
        String expected = "";
        int[] input = new int[100000];
        for (int i=0; i < input.length; i++) {
            input[i] = (int) Math.round(Math.random() * 100);
        }
        long t1 = System.currentTimeMillis();
        for (int i=0; i < input.length; i++) {
            int count = 1;
            while (i + 1 < input.length && input[i] == input[i + 1]) {
                i++;
                count++;
            }
            expected +=  count > 1 ? " " + input[i] + " FOR " + count: " " + input[i];
        }
        long t2 = System.currentTimeMillis();
        String  result = new Solution().formatString(input);
        long t3 = System.currentTimeMillis();
        assertEquals(result, expected.trim());
        long td1 = t2-t1;
        long td2 = t3-t2;
        System.out.println("Time using normal for loop: " + td1);
        System.out.println("Time using normal divide and concrete: " + td2);
        assertFalse(td1 < td2);
    }

    @Test
    public void testcase12() {
        String expected = "";
        int[] input = new int[100000];
        for (int i=0; i < input.length; i++) {
            int num = (int) Math.round(Math.random() * 100);
            int repeat = (int) Math.round(Math.random() * 10);
            for (int j = 0; j <= repeat; j++) {
                if (i >= input.length) {
                    break;
                } else {
                    input[i] = num;
                    i++;
                }
            }
        }

        long t1 = System.currentTimeMillis();
        for (int i=0; i < input.length; i++) {
            int count = 1;
            while (i + 1 < input.length && input[i] == input[i + 1]) {
                i++;
                count++;
            }
            expected +=  count > 1 ? " " + input[i] + " FOR " + count: " " + input[i];
        }
        long t2 = System.currentTimeMillis();
        String  result = new Solution().formatString(input);
        long t3 = System.currentTimeMillis();
        assertEquals(result, expected.trim());
        long td1 = t2-t1;
        long td2 = t3-t2;
        System.out.println("Time using normal for loop: " + td1);
        System.out.println("Time using normal divide and concrete: " + td2);
        assertFalse(td1 < td2);
    }

    @Test
    public void testcase13() {
        String expected = "";
        int[] input = new int[100000];
        Arrays.fill(input, 5);
        long t1 = System.currentTimeMillis();
        for (int i=0; i < input.length; i++) {
            int count = 1;
            while (i + 1 < input.length && input[i] == input[i + 1]) {
                i++;
                count++;
            }
            expected +=  count > 1 ? " " + input[i] + " FOR " + count: " " + input[i];
        }
        long t2 = System.currentTimeMillis();
        String  result = new Solution().formatString(input);
        long t3 = System.currentTimeMillis();
        assertEquals(result, expected.trim());
        long td1 = t2-t1;
        long td2 = t3-t2;
        System.out.println("Time using normal for loop: " + td1);
        System.out.println("Time using normal divide and concrete: " + td2);
        assertFalse(td1 < td2);
    }

}
