class Solution {

    fun encode(strs: List<String>): String
    {
        val strBuilder = StringBuilder()
        for (str in strs)
        {
            strBuilder.append(str.length)
            strBuilder.append("#")
            strBuilder.append(str)
        }
        return strBuilder.toString()
    }

    fun decode(str: String): List<String>
    {
        val list = mutableListOf<String>()
        var i = 0
        while (i < str.length)
        {
            var indexStr = str[i].toString()
            var j = i + 1
            while (str[j] != '#')
                indexStr += str[j++]
            i = j + 1
            list.add(str.substring(i, i + indexStr.toInt()))
            i += indexStr.toInt()
        }
        return list
    }

}
