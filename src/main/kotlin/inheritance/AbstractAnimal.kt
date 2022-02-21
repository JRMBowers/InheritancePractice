package inheritance

abstract class AbstractAnimal {
    abstract val legs : Int

    open fun makeNoise(){
        println("override to make noise ")
    }
}