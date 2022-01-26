class Cliente(val nome: String, cpf: String, val senha: Int): Autenticavel {

    override fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }


}