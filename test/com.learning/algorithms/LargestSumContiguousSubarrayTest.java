package com.learning.algorithms;

import com.learning.Algorithms.LargestSumContiguousSubarray;
import org.junit.Assert;
import org.junit.Test;

public class LargestSumContiguousSubarrayTest {

    @Test
    public void LargestSumContiguousSubarray_PositiveInteger_ResultWithCorrectNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long expected = 55;
        long result = LargestSumContiguousSubarray.calculateMaxContiguousSum(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void LargestSumContiguousSubarray_MixedPositiveAndNegativeNumber_ResultWithCorrectNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, -7, 8, -9, 10};
        long expected = 23;
        long result = LargestSumContiguousSubarray.calculateMaxContiguousSum(array);
        Assert.assertEquals(expected, result);
    }


}
