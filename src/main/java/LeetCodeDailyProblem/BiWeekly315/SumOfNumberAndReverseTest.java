package LeetCodeDailyProblem.BiWeekly315;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SumOfNumberAndReverseTest {

    @Test
    void sumOfNumberAndReverse() {
        int n = 181;
        Assert.assertTrue(SumOfNumberAndReverse.sumOfNumberAndReverse(n));
    }

   @Test
    public void testGetReverse() {
        Assert.assertEquals(21,SumOfNumberAndReverse.reverse(12));

    }

}

