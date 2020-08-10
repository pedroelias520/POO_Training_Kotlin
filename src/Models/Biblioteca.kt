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
            print("Digite o nome do Autor que quer pesquisar! \n")
            val autor_pesquisa = readLine().toString()     
            var autor_encontrado: Boolean = false   
            var livros_encontrados = mutableListOf<String>()
            val list_size = list.size   
            for (item in list) {
                val nome_pesquisa = item.autores
                for (nomes_autores in nome_pesquisa){
                    if (autor_pesquisa.equals(nomes_autores.primeiroNome+" "+nomes_autores.ultimoNome)){
                        autor_encontrado = true                        
                        livros_encontrados.add(item.titulo)
                    }                                      
                }
            }
            if(autor_encontrado){
                print("Autor encontrado!")
                print("Livros que ele aparece : \n")
                for(i in livros_encontrados){
                    print(i)
                }
            }
            else {
                print("Ah não :/ ... o seu autor não foi encontrado!")
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