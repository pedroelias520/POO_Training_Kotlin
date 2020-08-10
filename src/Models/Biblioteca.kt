package Models 
package com.bezkoder.kotlin.numberparser

   
class Biblioteca () {  
    
        var list =  mutableListOf<Livro>() 
        fun adicionarLivro() {
            val titulo: String = readLine().toString()
            val ano:String = readLine().toString()
            list.add(Livro(titulo,ano.toInt()))
        }
        fun pesquisarPorAutor() {
            print("Digite o nome do Autor que quer pesquisar!")
            val autor_pesquisa = readLine().toString()        
            val list_size = list.size   
            for (item in list) {
                val nome_pesquisa = item.autores
                for (nomes_autores in nome_pesquisa){
                    if (autor_pesquisa.equals(nomes_autores.primeiroNome+nomes_autores.ultimoNome)){
                        print("Autor encontrado! O autor se enconta na posicao: "+item)
                    }
                    else{
                        print("Este autor não foi encontrado \n talvez você não o tenha adicionado a lista de autores")
                    }
                }
            }

        }
        fun pesquisarPorTitulo() {
            val livro_pesquisado = readLine().toString()
            for (item in list){
                if(livro_pesquisado == item.titulo){
                    print("Livro Encontrado! Na posição :"+item)
                }
            }
        }
}