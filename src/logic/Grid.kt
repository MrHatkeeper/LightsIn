package logic

import java.util.Random

data class Grid(val xSize: Int, val ySize: Int) {
    var grid = Array(ySize) { Array(xSize) { Field(0, 0, false) } }
    private val rand = Random()

    fun createGrid(){
        for(i in grid.indices){
            for(j in grid[i].indices){
                grid[i][j] = Field(i,j,rand.nextBoolean())
            }
        }
    }
}