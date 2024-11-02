import java.awt.List

val contributor = listOf<String>("haris","Odi","Jawir")
val contributor2 = mapOf("arief" to 10 , "Haris" to 20)

/*menginisiasikan kotlin generic*/
interface list<T>{
    operator fun get(Index:Int):T
}
class Longlist : ArrayList<Long>() {
    override fun get(index: Int): Long {
        return this[index]
    }
}
/*
public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    */
/*...*//*

}*/

//Constraint type Parameter

