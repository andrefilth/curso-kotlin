package fundamentos

fun main(args: Array<String>) {
    val opicional : String? = null
    val obrigatorio : String = opicional ?: "Valor padrão"
    print(obrigatorio)

    val opicional2 : String? = "Primeiro este"
    val obrigatorio2 : String = opicional ?: "Valor padrão"
    print(obrigatorio2)
}