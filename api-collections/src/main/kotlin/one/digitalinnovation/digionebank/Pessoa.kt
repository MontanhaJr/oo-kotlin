package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Mauricio";
    var cpf:String = "123.456.789-10";
}

fun main() {
    val mauricio = Pessoa()

    println(mauricio.nome);
    println(mauricio.cpf);
}