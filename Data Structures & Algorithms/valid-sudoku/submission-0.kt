class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val columns = List(9) { HashSet<Char>(9) }
        val boxes = List(9) { HashSet<Char>(9) }
        val currentRow = HashSet<Char>(9)
        for (i in 0 until 9)
        {
            val row = board[i]
            for (j in 0 until 9)
            {
                if (!(row[j] == '.' || columns[i].add(row[j]) && boxes[i - (i % 3) + j / 3].add(row[j]) && currentRow.add(row[j]))) return false
            }
            currentRow.clear()
        }
        return true
    }
}
