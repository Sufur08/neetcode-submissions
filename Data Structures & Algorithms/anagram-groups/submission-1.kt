class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<List<Int>, MutableList<String>>()
        for (str in strs)
        {
            val signature = MutableList(26) { 0 }
            for (c in str) {
                signature[c - 'a']++
            }
            map[signature]?.add(str) ?: run { map[signature] = mutableListOf(str) }
        }
        return map.values.toList()
    }
}
