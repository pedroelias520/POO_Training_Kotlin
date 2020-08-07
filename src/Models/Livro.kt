package Models

class Livro constructor(val titulo:String, val ano: Int) {
        var titulo = "default values"
        set(value){
            if (!value.isNotEmpty()){
                throw IllegalArgumentException("O titulo não pode ser nulo")
            }
            field = value
        }
}