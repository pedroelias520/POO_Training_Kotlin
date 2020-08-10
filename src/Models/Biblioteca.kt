package Models

   
class Biblioteca () {  
    
        var list =  mutableListOf<Livro>() 
        fun adicionarLivro(livro: Livro) {
            list.add(livro)
        }
        fun pesquisarPorAutor() {
            print("Digite o nome do Autor que quer pesquisar! \n")
            val autor_pesquisa = readLine().toString()     
            var autor_encontrado: Boolean = false   
            var livros_encontrados = mutableListOf<String>()
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
                print("Autor encontrado! \n")
                print("Livros que ele aparece : \n")
                for(i in livros_encontrados){
                    print(i+"\n")
                }
            }
            else {
                print("Ah não :/ ... o seu autor não foi encontrado!")
            }            

        }
        fun pesquisarPorTitulo() {
            print("Digite o nome do livro a ser pesquisado")
            val livro_pesquisado = readLine().toString()
            for (item in list){
                if(livro_pesquisado == item.titulo){
                    print("Livro Encontrado! \n")
                    print("Nome: ${item.titulo} \n")
                    print("Ano: ${item.ano} \n")
                    print("Autores: \n")
                    for (i in item.autores){
                        print(i.primeiroNome+" "+i.ultimoNome+"\n")
                    }
                    print("__________________________________________________ \n")
                }else{
                    print("Ah não :/ ... Este livro nãof foi encontrado! :")
                }
            }
        }

        fun VerLivros(){
            print("Amostragem de Livro da biblioteca \n")
            print(list)
            for (i in list){
                print("Nome do livro: ${i.titulo} \n")
                print("Ano de publicação: ${i.ano} \n")
                print("Autores: \n")
                for (x in i.autores){
                    print(x.primeiroNome+" "+x.ultimoNome+"\n")
                }
                print("------------------------------------------")
            }
        }
}