import java.util.ArrayList;

public class MainHerencia {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
	

		Entrenador sampaoli = new Entrenador(1, "Jorge", "Sampaoli", 55, "284EZ89");
		Futbolista reyArturo = new Futbolista(2, "Arturo", "Vidal", 28, 6, "Interior Derecho");
		Masajista juanito = new Masajista(3, "Juanito", "Perez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(sampaoli);
		integrantes.add(reyArturo);
		integrantes.add(juanito);

		// CONCENTRACION
		System.out.println("");
		System.out.println("CONCENTRACION");
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("");
		System.out.println("VIAJE");
		System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.viajar();
		}
	
	
		// ENTRENAMIENTO
		System.out.println("");
		System.out.println("ENTRENAMIENTO");
		System.out.println("Entrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
		
		System.out.print(sampaoli.getNombre()+" "+sampaoli.getApellidos()+" -> ");
		sampaoli.dirigirEntrenamiento();
		System.out.print(reyArturo.getNombre()+" "+reyArturo.getApellidos()+" -> ");
		reyArturo.entrenar();

		// MASAJE
		System.out.println("");
		System.out.println("MASAJE");
		System.out.println("Masaje: Solo el masajista tiene el método para dar un masaje:");
		
		System.out.print(juanito.getNombre()+" "+juanito.getApellidos()+" -> ");
		juanito.darMasaje();

		// PARTIDO DE FUTBOL
		System.out.println("");
		System.out.println("PARTIDO DE FUTBOL");
		System.out.println("Partido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
		
		System.out.print(sampaoli.getNombre()+" "+sampaoli.getApellidos()+" -> ");
		sampaoli.dirigirPartido();
		System.out.print(reyArturo.getNombre()+" "+reyArturo.getApellidos()+" -> ");
		reyArturo.jugarPartido();
	
	}
}
