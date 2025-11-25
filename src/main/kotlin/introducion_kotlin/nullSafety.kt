package org.example.introducion_kotlin

data class Usuario(val id: Int, val nombre: String, val email: String?)

class RepositorioUsuarios{
    private val usuarios = listOf(
        Usuario(1, "Ana", "ana@email.com"),
        Usuario(2, "Carlos", null),
        Usuario(3, "María", "maria@email.com")
    )

    fun buscarPorId(id: Int): Usuario? {
        return usuarios.find{it.id == id}
    }

    fun buscarPorNombre(nombre: String): Usuario?{
        return usuarios.find{it.nombre.equals(nombre, ignoreCase = true)}
    }

    /*fun procesarUsuario(usuario: Usuario): String{
        return usuario?.let {u ->
            val emailInfo = u
        }

     */

    fun main(){
        val repo = RepositorioUsuarios()

        // Busqueda segura por ID
        val usuario1 = repo.buscarPorId(1)
        val usuario999 = repo.buscarPorId(999)


    }




}