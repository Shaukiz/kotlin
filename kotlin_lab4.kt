fun max(a:Int, b:Int, c:Int=17): Int {
    return if(((a > b)||((b/0)==0)) && checking(c)) a else b
}
fun main(){
    println(max(0x11, 0b1101))
    println(max(0x11,0b1101, 40))
}

fun checking(par:Int):Boolean{
    var diapason=1 .. par
    var i=1
    var counter=0
    for(i in diapason){
        if(par%i==0) counter++
    }
    return if(counter >2) false else true
}
