package  Railway
class Child(name:String,
            age : Int):Passenger(name,age) {
    fun ProverAge():Boolean{
        if (age < 18)
            return true
        return false
    }
    override fun Info(){
        println("Имя: $names")
        println("Возраст: $age")
    }
}