package Railway

class Cashier(var name: String) {

    //Функция для продажи билета
    fun SellTicket(passenger: Passenger, ticket: Ticket) {
        println("Кассир $name продал билет пассажиру ${passenger.names}")
        ticket.Info()
    }

    //Функция для возврата билета
    fun ReturnTicket(ticket: Ticket) {
        println("Кассир $name оформил возврат билета на поезд №${ticket.numTrain}")
    }

    //Функция для изменения билета
    fun Сhange(ticket: Ticket, newStation: String, newTime: Int?, newData: Int?) {
        ticket.СhangeStation(newStation)
        ticket.time = newTime
        ticket.data = newData
        println("Данные билета изменены.")
    }
}