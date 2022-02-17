class Cat : AbstractAnimal() {
    override val legs = 4

    override fun makeNoise() {
        print("Meow")
        super.makeNoise()
    }
}