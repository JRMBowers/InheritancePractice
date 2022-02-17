abstract class AbstractAnimal {
    abstract val legs : Int

    open fun makeNoise(){
        print("override to make noise ")
    }
}