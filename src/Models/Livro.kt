package Models

class Livro constructor(val titulo:String, val ano: Int) {
       var autores = mutableListOf<Autor>()
       fun AdicionarAutor() {
           val autor_nome = readLine().toString()           
           val autor_2nome = readLine().toString()
           val autor_email = readLine().toString()
           autores.add(Autor(autor_nome, autor_2nome, autor_email))            
       }
       fun ToString(){
           print("")
       }
}