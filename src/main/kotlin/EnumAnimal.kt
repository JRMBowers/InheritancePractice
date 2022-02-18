enum class EnumAnimal{
    CAT,
    DOG
}

fun EnumAnimal.makeNoise(){
    when(this){
        EnumAnimal.CAT -> println("Meow")
        EnumAnimal.DOG -> print("Bark")
    }
}
