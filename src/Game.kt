import iO.printGrid
import logic.Grid
import iO.getCoordinates
import iO.printScore

class Game {
    private val grid = Grid(6, 6)

    fun game() {
        var moves = 0
        grid.createGrid()
        var winning = false
        while (!winning) {
            printGrid(grid)
            rotateValues()
            moves++


            winning = win(moves)
        }
    }

    private fun rotateValues() {
        val coo = getCoordinates(grid)
        isValidField(coo[0],coo[1])
        isValidField(coo[0]-1,coo[1])
        isValidField(coo[0]+1,coo[1])
        isValidField(coo[0],coo[1]-1)
        isValidField(coo[0],coo[1]+1)
    }

    private fun isValidField(x: Int, y: Int) {
        if (x >= 0 && y >= 0 && x < grid.xSize && y < grid.ySize) {
            grid.grid[x][y].switchValues()
        }
    }

    private fun win(moves: Int): Boolean {
        for (i in grid.grid) {
            for (j in i) {
                if (j.isShining) {
                    return false
                }
            }
        }
        printScore(moves)
        return true
    }
}