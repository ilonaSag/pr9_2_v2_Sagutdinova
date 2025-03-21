import Railway.*
import Railway.Passenger as NewPassenger
import Railway.Child as NewChild
import  Railway.Cashier as NewCashier
import  Railway.Ticket as NewTicket
import Railway.Train as NewTrain
fun main (){
    try {
    println("Введите имя пассажира:")
    val passengerName = readLine()!!.toString()
    println("Введите возраст пассажира:")
    val passengerAge = readLine()!!.toInt()

    // Создание объекта пассажира
    val passenger = if (passengerAge!! < 18) {
        NewChild(passengerName, passengerAge)
    } else {
        NewPassenger(passengerName, passengerAge)
    }

    // Проверка возраста
    if (!passenger.ValidAge()) {
        return
    }
        //Вывод информации о билете
    passenger.Info()

    // Ввод данных билета
    println("Введите номер поезда:")
    val trainNumber = readLine()!!.toInt()
    println("Введите станцию назначения:")
    val station = readLine() ?: ""
    println("Введите время отбытия:")
    val time = readLine()!!.toInt()
    println("Введите дату отбытия:")
    val data = readLine()!!.toInt()
    println("Введите базовую цену билета:")
    val price = readLine()!!.toDouble()

    // Создание объекта билета
    val ticket = NewTicket(passengerName, passengerAge, trainNumber, station, time, data, price)

        //Рассчет скидки для ребенка
    var discount = 0.0
    if (passenger is NewChild) {
        discount = passenger.СalculateDiscount()
        println("Скидка для ребенка: ${discount * 100}%")
    }

    // Расчет итоговой цены билета
    val finalPrice = ticket.FinalPrice(discount)
    ticket.price = finalPrice

    // Ввод данных кассира
    println("Введите имя кассира:")
    val cashierName = readLine()!!.toString()

        //Создание объекта кассира
    val cashier = NewCashier(cashierName)

    // Продажа билета
    cashier.SellTicket(passenger, ticket)

    // Изменение данных билета
    println("Хотите изменить станцию назначения? (да/нет)")
    val answer2 = readLine()!!.toString()
    if (answer2 == "да") {
        println("Введите новую станцию:")
        val newStation = readLine() ?: ""
        println("Введите новое время отбытия:")
        val newTime = readLine()?.toInt()
        println("Введите новую дату отбытия:")
        val newData = readLine()?.toInt()
        cashier.Сhange(ticket, newStation, newTime, newData)
    }
        else
    {
        println("Изменений нет")
    }

    // Вывод информации о билете
    ticket.Info()

        //Возврат билета
        println("Хотите оформить возврат? (да/нет)")
        val answer = readLine()!!.toString()
        if (answer == "да")
        {
            cashier.ReturnTicket(ticket)
            return
        }
        else
        {
            println("Возврат не оформен")
        }
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }
}
