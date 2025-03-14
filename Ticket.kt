package  Railway
class Ticket(var name:String,
             age:Int,
var numTrain:Int,
var station:String,
var time:Int,
var data:Int,
var price:Double,):Passenger(name,age) {
 override fun Info(){
     println("Имя: $names")
     println("Возраст: $age")
     println("Станция: $station")
     println("Время отбытия: $time")
     println("Дата отбытия: $data")
     println("Итоговая цена: $price")
 }
}