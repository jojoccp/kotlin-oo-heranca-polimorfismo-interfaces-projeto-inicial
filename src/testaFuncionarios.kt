
fun testaFuncionarios() {
    println("Bem vindo ao Bytebank")

    val alex = Analista(nome = "alex", cpf = "2345678", salario = 1000.0)

    println("nome ${alex.nome}")
    println("salario ${alex.salario}")
    println("cpf ${alex.cpf}")

    println("Bonificacao ${alex.bonificacao}")

    val fran = Gerente("Fran", "222.222.222-22", 2000.0, 1234)

    if (fran.autentica(1234)) {
        println("autenticou")
    } else {
        println("falha na autenticacao")
    }

    val gui = Diretor(nome = "Gui", "333.333.333-33", 4000.0, 12345, 200.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)

    println("total de bonificação: ${calculadora.total}")
}