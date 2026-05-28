class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val cached = IntArray(nums.size)
        cached[0] = nums[0]
        var i = 1
        while (i < nums.size)
        {
            cached[i] = cached[i - 1] * nums[i++]
        }
        cached[--i] = nums[i]
        nums[i] = cached[--i]
        while (i > 0)
        {
            cached[i] = nums[i] * cached[i + 1]
            nums[i] = cached[i + 1] * cached[--i]
        }
        nums[0] = cached[1]
        return nums
    }
}
