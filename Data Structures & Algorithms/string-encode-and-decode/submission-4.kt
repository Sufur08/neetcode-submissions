class Solution {

    fun encode(strs: List<String>): String = if (strs.isEmpty()) "" else strs.joinToString("\u262F", postfix = "\u262F")

    fun decode(str: String): List<String> = if (str.isEmpty()) emptyList() else str.split("\u262F").dropLast(1)

}
