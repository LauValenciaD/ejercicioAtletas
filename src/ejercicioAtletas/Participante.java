package ejercicioAtletas;
import java.util.Map;

public class Participante {
//atributtes
	private String nombre;
	private int dorsal;
	private String tipo;
	private Map<Integer, Integer> marcasAnteriores; // Año de la competición y marca en segundos

	//Constructor con marcas
	public Participante(String nombre, int dorsal, String tipoParticipante, Map<Integer, Integer> marcas) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.tipo = tipoParticipante;
		this.marcasAnteriores = marcas;
	}
	//methods
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Map<Integer, Integer> getMarcasAnteriores() {
		return marcasAnteriores;
	}
	public void setMarcasAnteriores(Map<Integer, Integer> marcasAnteriores) {
		this.marcasAnteriores = marcasAnteriores;
	}
}
