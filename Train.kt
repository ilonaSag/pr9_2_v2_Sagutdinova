package Railway

open class Train(
    var numer: String,
    var endStation: String,
    var interval: String,
    var price: Double
) {

    fun СhangeInterval(newInterval: String) {
        interval = newInterval
        println("Интервал движения изменен на: $interval")
    }

    fun СhangePrice(newPrice: Double) {
        price = newPrice
        println("Цена билета изменена на: $price")
    }
}
