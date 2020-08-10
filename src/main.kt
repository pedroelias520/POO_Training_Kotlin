package Models
package com.bezkoder.kotlin.numberparser


fun main(args: Array<String>) {
    var operation_flow: Boolean = false 
    var operation: String
    val biblio = Biblioteca()
    while (operation_flow == true){
        print("Bem-vindo \n QUAL OPERAÇÃO DESEJA FAZER? \n")
        print(" 1- Cadastrar livro \n 2 - Pesquisar por Livro \n 3 - Pesquisar por Autor \n 4 - Adicionar Livro")
        operation = readLine().toString()

        when (operation.toInt()){
            1 -> biblio.adicionarLivro()
            2 -> biblio.pesquisarPorTitulo()
            3 -> biblio.pesquisarPorAutor() 
            else ->  "Obrigado por usar nosso programa - keep_society.bat"       
        }

        

    }
    fun AdicionarLivro(){
        print("Digite o nome do livro")
        val nome_livro = readLine().toString()
        print("Digite o ano que foi escrito")
        val ano_livro = readLine().toString()
        val livro = Livro(nome_livro, ano_livro.toInt())
        print("Deseja Adicionar um autor? \n 1 - SIM \n 2 -NÃO")
        var y_n:String = readLine().toString()
        while(y_n.toInt() == 1) {
            livro.AdicionarAutor()
            print("Deseja Adicionar mais um autor? \n 1 - SIM \n 2 -NÃO")
            var y_n:String = readLine().toString()                        
        }        
        print("Livro adicionado!")
    }

   

}
