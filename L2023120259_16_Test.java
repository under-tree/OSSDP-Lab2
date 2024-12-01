import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * 测试用例设计总体原则
 * 1. 等价类划分：分为有效输入（包含正常数字组合）和无效输入（全为 0 的特殊情况）。
 * 2. 边界值分析：数组长度为 1、数组包含最大/最小值等边界情况。
 * 3. 特殊输入测试：重复数字、多个数字组成相同大小的结果（如 121 和 12）。
 * 4. 典型功能测试：验证普通情况下的正确输出。
 */

class SolutionTest {
    private final Solution solution = new Solution();

    /**
     * 测试目的：
     * 验证普通情况下（包含多位数和单个位数混合的数组）是否返回正确结果。
     * 测试用例：
     * nums = [3, 30, 34, 5, 9]
     */
    @Test
    void testTypicalCase() {
        int[] nums = {3, 30, 34, 5, 9};
        String result = solution.largestNumber(nums);
        assertEquals("9534330", result);
    }

    /**
     * 测试目的：
     * 验证数组中只有一个元素时，是否直接返回该元素的字符串形式。
     * 测试用例：
     * nums = [10]
     */
    @Test
    void testSingleElement() {
        int[] nums = {10};
        String result = solution.largestNumber(nums);
        assertEquals("10", result);
    }

    /**
     * 测试目的：
     * 验证数组中所有元素均为 0 时，是否返回 "0"。
     * 测试用例：
     * nums = [0, 0, 0]
     */
    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0};
        String result = solution.largestNumber(nums);
        assertEquals("0", result);
    }

    /**
     * 测试目的：
     * 验证数组长度为 1 且为 0 的特殊情况。
     * 测试用例：
     * nums = [0]
     */
    @Test
    void testSingleZero() {
        int[] nums = {0};
        String result = solution.largestNumber(nums);
        assertEquals("0", result);
    }

    /**
     * 测试目的：
     * 验证数组中包含重复数字时，是否能够正确排序。
     * 测试用例：
     * nums = [1, 11, 111]
     */
    @Test
    void testRepeatingNumbers() {
        int[] nums = {1, 11, 111};
        String result = solution.largestNumber(nums);
        assertEquals("111111", result);
    }

    /**
     * 测试目的：
     * 验证边界情况，数组包含较大的值时是否能够正常处理。
     * 测试用例：
     * nums = [0, 999999999]
     */
    @Test
    void testLargeNumber() {
        int[] nums = {0, 999999999};
        String result = solution.largestNumber(nums);
        assertEquals("9999999990", result);
    }

    /**
     * 测试目的：
     * 验证特殊情况下，数组中的数字组成相同大小的结果。
     * 测试用例：
     * nums = [12, 121]
     */
    @Test
    void testSimilarNumbers() {
        int[] nums = {12, 121};
        String result = solution.largestNumber(nums);
        assertEquals("12121", result);
    }

    /**
     * 测试目的：
     * 验证数字中包含多个不同的个位数和多位数混合情况。
     * 测试用例：
     * nums = [10, 2]
     */
    @Test
    void testMixedSingleAndMultipleDigits() {
        int[] nums = {10, 2};
        String result = solution.largestNumber(nums);
        assertEquals("210", result);
    }
}
