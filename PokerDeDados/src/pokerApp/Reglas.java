package pokerApp;

public @interface Reglas {
	
	 /*	Introduccion
		 * 	Tiempo de juego: alrededor de cinco minutos por vuelta.
			Número de jugadores: sin límite. Pero es mejor cuando se juega de a cinco o menos.
			Número de dados: cinco.
			Elementos: un cubilete.
			
			Es esencialmente un juego de cartas que en lugar de estas, emplea dados. 
			Como su equivalente en los naipes, el poker se juega por dinero, 
			pero el procedimiento para las apuestas no es el mismo.
	 */
	
	/*	Objetivo
	 * 		Hacer el "juego de Poker" de mayor valor.
	 */
	
	/*	Comienzo
	 * 		Cada jugador tira dos veces por turno. si esta satisfecho con el resultado, 
	 * 		se puede plantar después del primer tiro. Luego anota el valor de su jugada 
	 * 		y pasa los dados al de su izquierda o puede también apartar los dados que desee de su primer tiro 
			y hacer con los restantes su segundo y último tiro. Una vez que se ha apartado un dado 
			no se lo debe volver a arrojar. Después del segundo intento, el jugador anota el valor de su jugada 
			y pasa los dados al de su izquierda.

			El participante que haya hecho el juego de mayor valor gana el pozo.
	 * 
	 */
	
	/*
	 * Reglas
	 * 
	 * 	Los juegos se clasifican en orden descendente de la siguiente forma:

		1. poker real (cinco iguales)
		2. poker cuádruple (cuatro iguales)
		3. full (tres iguales y un par)
		4. escalera mayor 2-3-4-5-6
		5. escalera menor 1-2-3-4-5
		6. piernas (triples)
		7. pares dobles
		8. pares.
		
		La jugada que no contenga por lo menos un par, no tiene valor.
		
		Si dos o más jugadores hacen un juego de igual valor, gana el que tenga el puntaje mas alto .Así cuatro 4 valen mas que cuatro 3.
		
		En el poker el as es el valor mas alto y por lo tanto los números se clasifican (en orden descendente) de la siguiente manera: 1-6-5-4-3-2-.
		
		Si dos o más participantes hacen un mismo juego con dados de igual valor, jugaran nuevamente para determinar el resultado. Los valores de los dados que no hacen al juego no se consideran para desempatar
		
		Así , si un jugador saca cuatro 4 y un 6, y otro saca cuatro y un 3 , se considera empate y la segunda vuelta de juego entre ambos determinará al ganador
		
		Cuando se juega entre dos personas, por lo general quien gana tres vueltas de las cinco se queda con el pozo.
	 */
}
