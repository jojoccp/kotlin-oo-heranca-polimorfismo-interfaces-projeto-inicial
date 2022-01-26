fun testaAutenticacao() {
    val gerente = Gerente("Alex", "111.111.111-11", 1000.0, 1000)
    val diretora = Diretor("Ana", "222.222.222-22", 2000.0, 2000, 200.0)
    val cliente = Cliente ("Gui", "333.333.333-33", 123)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 123)


}