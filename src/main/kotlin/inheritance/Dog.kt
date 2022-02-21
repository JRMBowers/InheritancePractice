package inheritance

class Dog : InterfaceAnimal {
    override val legs = 4

    override fun makeNoise() {
        println("bark")
        super.makeNoise()
    }
}