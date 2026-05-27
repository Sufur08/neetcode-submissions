class Solution {

    fun encode(strs: List<String>): String = if (strs.isEmpty()) "" else strs.joinToString("\u262F")

    fun decode(str: String): List<String> = if (str.isEmpty()) listOf(str) else str.split("\u262F")

}
