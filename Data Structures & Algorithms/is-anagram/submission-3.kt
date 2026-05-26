class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map: HashMap<Char, Int> = HashMap(listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z').map { it to 0 }.toMap())
        var i = 0
        while (i < s.length)
        {
            var c = s[i]
            map[c] = map[c]!! + 1
            c = t[i]
            map[c] = map[c]!! - 1
            i++
        }
        return map.values.all { it == 0 }
    }
}
