fun main() {
        //Exercicio1 (part3)
    var professor = Professor("Cesar Rodrigues ", 12345)

    val materiaKotlin = Materia("Aula de Kotlin")
    var aulaKotlin = Aula(materiaKotlin, "19:30", "21:45")

    val materiaAndroid = Materia("Aula de Andoid")
    var aulaAndroid = Aula(materiaAndroid, "21:45", "23:30")


    var alessandro = Aluno(987, "Alessandro", "Machado")
    var gabriel = Aluno(654, "Gabriel", "Vinicius")

    val curso = Curso("Digital House", listOf(aulaAndroid, aulaKotlin), listOf(alessandro, gabriel), professor)

    val turmaTop = Turma("Turma 1 de android", curso)

    turmaTop.curso.listaAluno.forEach {
        println(listOf("O nome do aluno é ${it.nome} ${it.sobrenome} e o registro academico ${it.ra}")) }

    println(turmaTop.curso.listaAulas)
    //Exercicio1 (part4)


}

//Exercicio 1 (part1)
class Materia(nome: String) {}

class Aula(materia: Materia, horaInicio: String, horaTermino: String) {}

open class Pessoa(nome: String)

class Aluno(val ra: Int, val nome: String, val sobrenome: String) : Pessoa(nome) {

    fun asssitirAula() {}

    fun fazerLicaoCasa() {}
}

open class Curso(nome: String, val listaAulas: List<Aula>, val listaAluno: List<Aluno>, professor: Professor) {

}


class Professor(nome: String, rd: Int) : Pessoa(nome) {

    fun darAulas() {}

    fun fazerChamada() {}
}

class Turma(nome: String, val curso: Curso) {}
// Exercicio 1 (part2)


//Exercicio 2 (part1)
open class Fatura( var lista: List<Item>)

class Item(var numeroFaturado: Int,
           var discricaoItem: String,
           var quantidadeComprada: Int,
           var precoUnitario: Double)




