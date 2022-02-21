import abstraction.Passenger
import inheritance.Cat
import inheritance.Dog
import inheritance.EnumAnimal
import inheritance.makeNoise
import java.util.*

fun main(args: Array<String>) {
    val dog = Dog()
    val cat = Cat()
    val enumCat = EnumAnimal.CAT

    dog.makeNoise()
    cat.makeNoise()
    enumCat.makeNoise()
    //inheritance

    val passenger1 = Passenger(memberDays = 10, memberLevel = 3, name = "Jack")
    val passenger2 = Passenger(memberDays = 9, memberLevel = 3, name = "Dave")
    println(passenger1.compareTo(passenger2))

    val passengers = arrayOf(passenger1,passenger2)
    Arrays.sort(passengers) // these use the defined compareTo function in passengers to sort the array
    println(passengers[0].name)
    println(passengers[1].name)
    //abstraction
}