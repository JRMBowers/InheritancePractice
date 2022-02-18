fun main(args: Array<String>) {
    val dog = Dog()
    val cat = Cat()
    val enumCat = EnumAnimal.CAT

    dog.makeNoise()
    cat.makeNoise()
    enumCat.makeNoise()
}