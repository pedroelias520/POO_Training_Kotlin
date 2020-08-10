package Models

class Biblioteca () {
    companion object {
        var list =  mutableListOf<Livro>()
        fun adicionarLivro() {
            val titulo = readLine()
            val ano = readLine()
            list.add(Livro(titulo,ano))
        }
        fun pesquisarPorAutor() {
            print("Digite o nome do Autor que quer pesquisar!")
            val nome_pesquisa = readLine()
            for (item in list.length) {
                val nome_pesquisa = list[item].nome
                if (nome == nome_pesquisa) {
                    print("O Autor está na list,na posição $item")
                }
            }

        }
        fun pesquisarPorTitulo() {
            
        }
    }

}