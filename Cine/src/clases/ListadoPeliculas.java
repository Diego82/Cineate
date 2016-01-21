package clases;

import java.util.List;

public class ListadoPeliculas {

	static List<Pelicula> listadoPeliculas;
	int idPeli = 0;

	public ListadoPeliculas() {
		// TODO Auto-generated constructor stub
		listadoPeliculas.add(new Pelicula(idPeli++, "Star Wars. Episode VII: The Force Awakens aka",
				"Título original\n\t Wars. Episode VII: The Force Awakens aka\n"
				+ "Año\n\t2015\n"
				+ "Duración\n\t136 min.\n"
				+ "País\n\t[Estados Unidos] Estados Unidos\n"
				+ "Director\n\tJ.J. Abrams\n"
				+ "Guión\n\tJ.J. Abrams, Lawrence Kasdan (Personajes: George Lucas)\n"
				+ "Música\n\tJohn Williams\n"
				+ "Fotografía\n\tDaniel Mindel\n"
				+ "Reparto\n\tJohn Boyega, Daisy Ridley, "
				+ "Harrison Ford, Carrie Fisher, Mark Hamill, "
				+ "Oscar Isaac, Adam Driver, Gwendoline Christie, "
				+ "Lupita Nyong'o, Andy Serkis, Domhnall Gleeson, "
				+ "Max von Sydow, Anthony Daniels, Peter Mayhew,"
				+ " Maisie Richardson-Sellers, Kenny Baker, Katie Jarvis, "
				+ "Christina Chong, Simon Pegg, Miltos Yerolemou, Warwick Davis\n"
				+ "Productora\n\tLucasfilm / Bad Robot / The Walt Disney Company\n"
				+ "Género\n\tCiencia ficción. Aventuras | Aventura espacial. Star Wars. Secuela. 3-D\n"
				+ "Sinopsis\n\tLa séptima entrega de la saga Star Wars continuará 30 años después de \"El retorno del Jedi\", con Luke Skywalker intentando restablecer el orden en la galaxia mientras Leia y Han Solo trabajan con la Nueva República contra los restos del Imperio... El episodio VII fue confirmado en octubre de 2012, cuando Walt Disney Company compró LucasFilms por 4.000 millones de dólares. (FILMAFFINITY)\n"
				+ "\n\tPremiere mundial: 14 de diciembre en Los Angeles.\tEstreno en EEUU y España: 18 de diciembre de 2015.\t"
				+ "Estreno en Reino Unido, Alemania, Chile, Argentina y México: 17 de diciembre\tEstreno en Francia, Italia, Bélgica, Suecia, Dinamarca y Noruega: 16 de diciembre", "imagenes/StarWars.PNG" ));
		
		listadoPeliculas.add(new Pelicula(idPeli++, "Título original\n\tThe Hunger Games: Mockingjay - Part 2\n"
				, "Título original\n\tThe Hunger Games: Mockingjay - Part 2\n"
				+ "Año\n\t2015\n"
				+ "Duración\n\t137 min.\n"
				+ "País\n\t[Estados Unidos]  Estados Unidos\n"
				+ "Director\n\tFrancis Lawrence\n"
				+ "Guión\n\tDanny Strong (Novela: Suzanne Collins)\n"
				+ "Música\n\tJames Newton Howard\n"
				+ "Fotografía\n\tJo Willems\n"
				+ "Reparto\n\tJennifer Lawrence, Josh Hutcherson, Sam Claflin, Liam Hemsworth, Donald Sutherland, Julianne Moore, Natalie Dormer, Gwendoline Christie, Philip Seymour Hoffman, Robert Knepper, Stef Dawson, Elden Henson, Evan Ross, Mahershala Ali, Wes Chatham, Omid Abtahi\n"
				+ "Productora\n\tColor Force / Lionsgate\n"
				+ "Género\n\tCiencia ficción. Aventuras | Thriller futurista. Supervivencia. Distopía. Secuela\n"
				+ "Sinopsis\n\tLa última entrega de 'Los juegos del hambre' nos muestra a una nación en guerra, en la que Katniss se enfrenta con uñas y dientes al presidente Snow (Donald Sutherland). Con la ayuda de algunos amigos, entre ellos Gale (Liam Hemsworth), Finnick (Sam Claflin) y Peeta (Josh Hutcherson), arriesgará la vida para salir del Distrito 13 y eliminar al presidente Snow. (FILMAFFINITY)\n"
				,"/imagenes/Sinsajo.PNG"));
		
		
		
		
	}
}
