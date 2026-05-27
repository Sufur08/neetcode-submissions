class Solution {

    fun encode(strs: List<String>): String {
        if (strs.isEmpty()) return ""
        var strBuilder = ""
        for (str in strs)
        {
            for (char in str)
                strBuilder += when (char)
                {
                    '\\' -> "\\\\"
                    ';' -> "\\;"
                    else -> char
                }
            strBuilder += ';'
        }
        return strBuilder
    }

    fun decode(str: String): List<String> {
        if (str.isEmpty()) return emptyList()
        val res = mutableListOf<String>()
        var i = 0
        var current = ""
        while (i < str.lastIndex)
            when (str[i])
            {
                '\\' -> {
                    current += str[i + 1]
                    // next must be ';' or '\'
                    i += 2
                    continue
                }
                ';' -> {
                    res += current
                    current = ""
                    i++
                }
                else -> {
                    current += str[i]
                    i++
                }
            }
        return res + current
    }

}
