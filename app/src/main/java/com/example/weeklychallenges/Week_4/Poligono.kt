package com.example.weeklychallenges.Week_4

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de
 * - calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 *
 * https://es.wikihow.com/calcular-el-%C3%A1rea-de-pol%C3%ADgonos-regulares
 */

class Poligono {
}

fun areaPolig(F: String, l: Int){
    val tangente =
        when {
            F.lowercase() == "triangulo" -> {
                val nl: Int = 3
                val p = l * nl
                val a = l /
            } F.lowercase() == "cuadrado" -> {
                val nl: Int = 4
            } F.lowercase() == "rectangulo" ->{
                val nl: Int = 4

        }
            else -> {println("Error")}
        }
}