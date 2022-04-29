package iO

import logic.Grid

fun printGrid(grid: Grid){
    println("Svítí = O; Nesvítí = #\n")
    for (i in grid.grid){
        for (j in i){
            if(j.isShining){
                print("O")
            }
            else{
                print("#")
            }
        }
        println("")
    }
}


fun printScore(score: Int){
    println("Hráč vyhrává po $score tazích")
}