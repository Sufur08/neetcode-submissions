class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sorted = nums.sorted()
        println(sorted)
        var i = 0; var j = sorted.lastIndex;
        do {
            var sum = sorted[i] + sorted[j]
            while (sum < target) 
                sum = sorted[++i] + sorted[j]
            while (sum > target)
                sum = sorted[i] + sorted[--j]
        }
        while (sum != target)

        return listOf(nums.indexOf(sorted[i]), nums.indexOfLast { it == sorted[j] } ).sorted().toIntArray()
    }
}
