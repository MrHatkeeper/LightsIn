package logic

data class Field(val x: Int, val y: Int, var isShining: Boolean){
    fun switchValues(){
        isShining = !isShining
    }
}