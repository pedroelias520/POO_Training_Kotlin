package Models


class Livro constructor(val titulo:String, val ano: Int) {
        var autores = mutableListOf<Autor>()
       fun AdicionarAutor() {
           print("Digite o primeiro nome do autor \n" )
           val autor_nome = readLine().toString()
           print("Digite o segundo nome do autor \n")
           val autor_2nome = readLine().toString()
           print("Digite o email nome do autor \n")
           val autor_email = readLine().toString()
           autores.add(Autor(autor_nome, autor_2nome, autor_email))
           print("Autor adicionado")
       }
}