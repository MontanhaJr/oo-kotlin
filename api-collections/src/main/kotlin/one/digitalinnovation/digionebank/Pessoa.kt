package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Mauricio"
    var cpf:String = "123.456.789-10"

    private set

    constructor()

    constructor(nome:String, cpf:String)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val mauricio = Pessoa("Montanha", "123.985.956.33")

    println(mauricio.pessoaInfo())
}