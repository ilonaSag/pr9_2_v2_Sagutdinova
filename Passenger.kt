package  Railway
open class Passenger (var names:String,var age : Int) {
    fun ValidAge():Boolean{
        if (age<=0)
        {
            println("Возраст не может быть меньше 0 или равняться ему")
            return false
        }
        return true
    }
    open fun Info(){
        println("Имя: $names")
        println("Возраст: $age")
    }
}