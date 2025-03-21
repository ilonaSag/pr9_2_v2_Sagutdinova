package  Railway
open class Passenger (var names:String,var age : Int?) {
    //Функция для проверки возраста
    fun ValidAge():Boolean{
        if (age!!<=0)
        {
            println("Возраст не может быть меньше 0 или равняться ему")
            return false
        }
        return true
    }

    //Функция для выводы информации пассажира
    open fun Info(){
        println("Имя: $names")
        println("Возраст: $age")
    }
    fun ChangeName(newName: String) {
        names = newName
        println("Имя изменено на: $names")
    }
}
