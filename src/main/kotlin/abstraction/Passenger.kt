package abstraction

class Passenger(memberLevel : Int, memberDays : Int, name : String) : Comparable<Passenger> {
    private var memberLevel = memberLevel
    private var memberDays = memberDays
    val name = name

    override fun compareTo(passenger: Passenger): Int {
        if (memberLevel != passenger.memberLevel) return passenger.memberLevel - memberLevel
        return passenger.memberDays - memberDays
    }
}