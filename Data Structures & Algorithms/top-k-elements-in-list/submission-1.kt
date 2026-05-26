class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (num in nums)
            map[num] = map[num]?.plus(1) ?: 1
        return map.entries.sortedByDescending { it.value }.take(k).map { it.key }.toIntArray()
    }
}
