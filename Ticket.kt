package  Railway
class Ticket(
    var name:String,
    age:Int,
    var numTrain: Int?,
    var station:String,
    var time:Int?,
    var data:Int?,
    var price:Double?,):Passenger(name,age) {

    //Функция для вывода информации о билете
    override fun Info(){
        println("Имя: $names")
        println("Возраст: $age")
        println("Станция: $station")
        println("Время отбытия: $time")
        println("Дата отбытия: $data")
        println("Итоговая цена: $price")
    }
    fun ChangeTrainNumber(newNumber: Int) {
        numTrain = newNumber
        println("Номер поезда изменен на: $numTrain")
    }
    //Рассчет цены билета
    fun FinalPrice(discount: Double): Double {
        return price!! * (1 - discount)
    }

    //Вывод об измененной станции
    fun СhangeStation(newStation: String) {
        station = newStation
        println("Станция изменена на: $station")
    }
}
