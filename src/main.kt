package Models
val biblio = Biblioteca()
public fun main(args: kotlin.Array<kotlin.String>): kotlin.Unit {
    var operation_flow: Boolean = true
    var operation: String

    while (operation_flow == true){
        print("Bem-vindo \n QUAL OPERAÇÃO DESEJA FAZER? \n")
        print(" 1- Cadastrar livro \n 2 - Pesquisar por Livro \n 3 - Pesquisar por Autor \n 4 - Ver livros cadastrados \n 5 - Sair do programa \n")
        operation = readLine().toString()

        when (operation){
            "1" -> AdicionarLivro()
            "2" -> biblio.pesquisarPorTitulo()
            "3" -> biblio.pesquisarPorAutor()
            "4" -> biblio.VerLivros()
            else -> operation_flow = false
        }

        

    }

}

fun AdicionarLivro() {
    print("Digite o nome do livro")
    val nome_livro = readLine().toString()
    print("Digite o ano que foi escrito")
    val ano_livro = readLine().toString()
    val livro = Livro(nome_livro, ano_livro.toInt())
    print("Deseja Adicionar um autor? \n 1 - SIM \n 2 -NÃO")
    var y_n:String = readLine().toString()
    var control_flow :Boolean = true
    while(control_flow) {
        livro.AdicionarAutor()
        print("Deseja Adicionar mais um autor? \n 1 - SIM \n 2 -NÃO \n")
        var y_n:String = readLine().toString()
        if(y_n == "1"){
            control_flow = true
        }else{
            biblio.adicionarLivro(livro)
            control_flow = false
        }
    }
    print("Livro adicionado!")
}


