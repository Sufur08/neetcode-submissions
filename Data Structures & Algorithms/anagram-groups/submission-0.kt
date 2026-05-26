class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<List<Int>, MutableList<String>>()
        for (str in strs)
        {
            val signature = IntArray(26)
            str.forEach { signature[it - 'a']++ }
            val asList = signature.toList()
            map[asList]?.add(str) ?: run { map[asList] = mutableListOf(str) }
        }
        return map.values.toList()
    }
}
