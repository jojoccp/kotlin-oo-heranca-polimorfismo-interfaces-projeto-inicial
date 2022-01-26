fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Franc",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)
}