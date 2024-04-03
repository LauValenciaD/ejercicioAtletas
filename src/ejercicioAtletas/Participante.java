package ejercicioAtletas;

public class Participante {
//atributtes
	private String nombre;
	private int dorsal;
	private String tipoParticipante;
	private MarcasAnteriores marcasAnteriores;
	
	//Constructor con marcas
	public Participante(String nombre, String tipoParticipante, MarcasAnteriores marcasAnteriores) {
		super();
		this.nombre = nombre;
		this.dorsal = Dorsal.generarDorsal(); //llamar al metodo
		this.tipoParticipante = tipoParticipante;
		this.marcasAnteriores = marcasAnteriores;
	}
	//Constructor sin marcas
	public Participante(String nombre, int dorsal, String tipoParticipante) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.tipoParticipante = tipoParticipante;
		this.marcasAnteriores = null;
	}
	//methods
	 // Método para agregar una marca anterior
    public void agregarMarcaAnterior(String añoCompeticion, double marcaSegundos) {
        marcasAnteriores.agregarMarca(añoCompeticion, marcaSegundos);
    }
	
}
