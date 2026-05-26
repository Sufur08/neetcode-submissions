class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        
        for (i in nums.withIndex())
        {
            val j = map[i.value]
            if (j != null) return intArrayOf(j, i.index)
            else map[target - i.value] = i.index
        }
        
        throw Exception("no solution")
    }
}
