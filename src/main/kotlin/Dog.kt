
class Dog : Animal {
    override val legs = 4

    override fun makeNoise() {
        print("bark")
        super.makeNoise()
    }
}