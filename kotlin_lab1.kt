class Orange33(var sort:String="indi", var weight:Int=200):Comparable<Orange33>{
    override fun compareTo(other: Orange33): Int {
        return this.weight - other.weight
    }
    operator fun plus(other:Orange33):Orange33{
        return Orange33(this.sort,this.weight + other.weight)
    }

    override fun toString(): String {
        return "Orange33(sort='$sort', weight=$weight)"
    }
}

fun main(){
    println(Orange33("spanish",120) + Orange33())
}
