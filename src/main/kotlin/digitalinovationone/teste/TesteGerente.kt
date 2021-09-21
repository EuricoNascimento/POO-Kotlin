package digitalinovationone.teste

import digitalinovationone.Gerente


fun main() {
    val maria = Gerente("Maria", "60725827066", 2550.15, "1234")

    TesteAutenticacao().autenticacao(maria)
}