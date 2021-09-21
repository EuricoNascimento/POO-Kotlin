package digitalinovationone

class Cliente(
    name: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(name, cpf), Logavel{
    override fun login(): Boolean = senha == "senha"

    override fun toString(): String = """
        Nome:               $name
        CPF:                $cpf 
        Tipo de Cliente:    $clienteTipo
    """.trimIndent()
}