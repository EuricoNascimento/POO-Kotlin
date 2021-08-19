package digitalinovationone

class Pessoa {
    var nome: String = "Eurico"
    var cpf: String = "607.123.743-29"
    private set

    constructor()

    fun pessoaInfor() = "Nome: $nome\nCpf: $cpf"
}

fun main() {
    val eurico = Pessoa()
    println(eurico.pessoaInfor())
}