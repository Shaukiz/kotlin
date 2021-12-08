fun String.convert(str:String):String{
    var sb=StringBuilder()
    for(temp in str){
        println(temp)
        println(temp.isLowerCase())
        println(temp.isUpperCase())
        var par=if(temp.isLowerCase() && temp.isUpperCase()) temp.toUpperCase()
        else temp.toLowerCase()
        //println(par)
        sb.append(temp)
        println(sb)
    }
    return sb.toString()
}

fun main(){
    var qwe = "".convert("qweRTY")
    println(qwe)
}
