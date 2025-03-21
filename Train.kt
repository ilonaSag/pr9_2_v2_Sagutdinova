package Railway

open class Train(
    var numer: Int,
    var endStation: String,
    var price: Double
) {
    fun ValidPrice(price: Double?):Boolean{
        if (price!! <0.0)
        {
            println("Цена не может быть меньше или равняться 0")
            return false
        }
        return true
    }
    fun ValidNumer(numer: Int?):Boolean{
        if (numer!! <0)
        {
            println("Номер поезда не может быть меньше или равняться 0")
            return false
        }
        return true
    }
}
