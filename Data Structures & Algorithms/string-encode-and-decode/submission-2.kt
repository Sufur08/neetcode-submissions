class Solution {

    fun encode(strs: List<String>): String = strs.joinToString("\u262F")

    fun decode(str: String): List<String> = str.split("\u262F")

}
