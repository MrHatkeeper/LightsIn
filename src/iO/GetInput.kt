package iO

import logic.Grid

fun getCoordinates(grid: Grid): IntArray {
    println("Jaké pole chceš otočit")
    val o = readln().split(" ")
    val output = intArrayOf(o[0].toInt(), o[1].toInt())
    if (output[0] >= 0 && output[1] >= 0 && output[0] < grid.xSize && output[1] < grid.ySize) {
        return output
    }
    println("Špatná velikost")
    return getCoordinates(grid)
}
