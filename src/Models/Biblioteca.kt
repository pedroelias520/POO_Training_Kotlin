package Models
package com.bezkoder.kotlin.numberparser

class Biblioteca () {
    companion object {
        var list =  mutableListOf<Livro>()
        fun adicionarLivro() {
            val titulo: String = readLine().toString()
            val ano:String = readLine().toString()
            list.add(Livro(titulo,ano.toInt()))
        }
        fun pesquisarPorAutor() {
            print("Digite o nome do Autor que quer pesquisar!")
            val nome_pesquisa = readLine()        
            val list_size = list.size   
            for (item in list) {
                val nome_pesquisa = item.autores
                for (nomes_autores in nome_pesquisa){

                }
            }

        }
        fun pesquisarPorTitulo() {

        }
    }

}