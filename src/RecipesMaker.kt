fun main(){
   do {
       
       val reponse = getMenuChoice()
       when (reponse) {
            1 -> makeRecipe()
            2 -> println(viewRecipe())
            3 -> println("Chao ")
           else -> println("No esta en ninguno de los anteriores")
       }
   }while (reponse!=3)

}

fun getMenuChoice(): Int{
    val menu: String = """:: Bienvenido a Recipe Maker :: \n
                        Selecciona la opción deseada\n
                        1. Hacer una receta \n
                        2. Ver mis recetas\n
                        3. Salir"""".trimIndent()
    println(menu)
    val response = readLine()?.toInt() ?: 0;

    return response
}

fun  makeRecipe(){
    val listadoIngredientes : List<String> = arrayListOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal",
        "Huevos","Aceite")
    println("Hacer receta \n Selecciona por categoría el ingrediente que buscas")
    println(" ${listadoIngredientes.forEachIndexed { index, s -> println("$index. $s")  }}" )
}

fun viewRecipe():String{
    return "Ver mis recetas"
}