fun main() {


    //Exercicio 1 (part3)
    val alessandru = Pessoas("Alessandro", 1234)
    val cesar = Pessoas("Cesar", 1234)
    println(alessandru)
    println(cesar)

    if (alessandru == cesar) {
        println("Sao iguais")
    } else {
        println("São diferentes")
    }
    //Exercicio 1 (part4)

    //Exercicio 2 (part3)
    val coca2l = Coca(2, 7.0)
    val coca2l1 = Coca(2, 8.50)

    if (coca2l.equals(coca2l1)) {
        println("Sao iguais")
    } else {
        println("São diferentes")
    }
    //Exercicio 2 (part4)


    // Exercicio 3 (part3)
    val listaAluno = mutableListOf<Alunos>()
    val celia = Alunos("Celia", 1001)
    val clara = Alunos("Clara", 1002)
    val lucas = Alunos("Lucas", 1003)
    val victor = Alunos("Victor", 1004)
    listaAluno.add(celia)
    listaAluno.add(clara)
    listaAluno.add(lucas)
    listaAluno.add(victor)

    val pedro = Alunos("Pedro", 1004)
    if (listaAluno.contains(pedro)) {
        println("Aluno esta na lista")
    } else {
        println("Aluno não esta na lista")

    }
    // Exercicio 3 (part4)


// Exercicio 4 (part3)
    val listaFuncionario = mutableListOf<Funcionario>()
    val alessandro = Funcionario("Alessandro", 123)
    val joao = Funcionario("João", 456)
    val igor = Funcionario("Igor", 789)
    val rodrigo = Funcionario("Rodrigo", 987)
    listaFuncionario.add(alessandro)
    listaFuncionario.add(joao)
    listaFuncionario.add(igor)
    listaFuncionario.add(rodrigo)

    val vitor = Funcionario("Vitor", 123)
    if (listaFuncionario.contains(vitor)) {
        println("Funcionario está na lista")
    } else {

        println("Funcionario não esta na lista")
    }
//Ecercicio 4 (part4)

}

//Exercicio 1 (part1)
class Pessoas(
    nome: String,
    val rg: Int
) {

//    override fun equals(other: Any?): Boolean {
//        val otherPerson = other as? Pessoas
//        return when (other) {
//            is Pessoas -> {
//                this.rg == otherPerson?.rg
//            }
//
//            else -> {
//                super.equals(other)
//            }
//        }
}

//Exercicio 1 (part2)

//Exercicio 2 (part1)
class Coca(
    val tamanho: Int,
    val preco: Double
) {

//    override fun equals(other: Any?): Boolean {
//        val otherCoca = other as? Coca
//        return when (other) {
//            is Coca -> {
//                this.tamanho == otherCoca?.tamanho
//            }
//            else -> {
//                super.equals(other)
//            }
//        }
//
//
//    }
}
//Exercicio 2 (part2)

//Exercicio 3 (part1)
class Alunos(
    vome: String,
    val numeroDeAluno: Int
) {
    override fun equals(other: Any?): Boolean {
        val otherAlunos = other as? Alunos
        return when (other) {
            is Alunos -> {
                this.numeroDeAluno == otherAlunos?.numeroDeAluno
            }
            else -> {
                super.equals(other)
            }
        }

    }
}
//Exercicio 3 (part2)

//Exercicio 4 (part1)
class Funcionario(
    nome: String,
    val numeroDeRegistro: Int
) {

    override fun equals(other: Any?): Boolean {
        val otherFuncionario = other as? Funcionario
        return when (other) {
            is Funcionario -> {
                this.numeroDeRegistro == otherFuncionario?.numeroDeRegistro
            }
            else -> {
                super.equals(other)
            }
        }


    }
}
// Exercicio 4 (part2)
