fun main(){
    var qwe = "Sqrt"
    var asd = qwe.convert(qwe)
    println(asd)
}

fun String.convert(str:String=""):String{
    var sb = StringBuilder()
    for(temp in str){
        var par=if(temp.isLowerCase() &&
            temp.isUpperCase())
                temp.toUpperCase()
        else temp.toLowerCase()
        sb.append(temp)
    }
    return sb.toString()
}
