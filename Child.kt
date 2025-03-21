package  Railway
class Child(name:String,
            age : Int):Passenger(name,age) {
//Функция вывода информации о ребенке
    override fun Info() {
        println("Ребенок")
        super.Info()
    }
//Рассчет скидки для ребенка
    fun СalculateDiscount(): Double {
        return if (age!! < 12) 0.5 else 0.2
    }
}
