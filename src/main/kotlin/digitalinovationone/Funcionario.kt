package digitalinovationone

abstract class Funcionario (
    name: String,
    cpf: String,
    val salario: Double
) : Pessoa (name, cpf) {
    protected abstract fun calculoAuxilio(): Double
}