class Solution {

    fun encode(strs: List<String>): String {
        val strBuilder = StringBuilder()
        for (str in strs)
        {
            for (char in str)
                when (char)
                {
                    '\\' -> strBuilder.append("\\\\")
                    ';' -> strBuilder.append("\\;")
                    else -> strBuilder.append(char)
                }
            strBuilder.append(';')
        }
        return strBuilder.toString()
    }

    fun decode(str: String): List<String> {
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
