import java.lang.IndexOutOfBoundsException
import java.lang.NullPointerException

fun main() {

    val exercicio1: MutableList<String> = mutableListOf()
    exercicio1.add("Pato")
    exercicio1.add("Cachorro")
    exercicio1.add("Gato")

    try {
        exercicio1[3]
    } catch (e: IndexOutOfBoundsException) {
        println(e.stackTraceToString())
    }


    val exercicio2: MutableList<String>? = null
    exercicio2?.add("Pato")
    exercicio2?.add("Cachorro")
    exercicio2?.add("Gato")

    try {
        println(exercicio2)

    } catch (e: NullPointerException){
        println(e.stackTraceToString())
    }


//Exercicio 3
    try {
        //println(exercicio2[2])
    } catch (ex: NullPointerException) {
        //println(ex.stackTraceToString())
    } catch (ex: IndexOutOfBoundsException) {
        //println(ex.stackTraceToString())
    }

    val calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4, 0)
    } catch (ex: ArithmeticException) {
        println(ex.message)
    }
}








//Exercicio 3
class CalculoMatematico {

    @Throws(ArithmeticException::class)
    fun divisao(x: Int, y: Int): Int {
        return if (y == 0) {
            throw ArithmeticException("Divisão por zero")
        } else {
            x / y
        }
    }
}
