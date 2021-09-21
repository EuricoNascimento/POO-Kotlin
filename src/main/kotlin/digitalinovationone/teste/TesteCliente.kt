package digitalinovationone.teste

import digitalinovationone.Cliente
import digitalinovationone.ClienteTipo

fun main() {
    val jose = Cliente("José Costa", "123454202-37", ClienteTipo.PF, "senha")

    println(jose)

    TesteAutenticacao().autenticacao(jose)
}