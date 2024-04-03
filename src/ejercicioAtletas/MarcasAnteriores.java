package ejercicioAtletas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MarcasAnteriores {
    private Map<String, Double> marcas; // Año de la competición y marca en segundos

    // Constructor
    public MarcasAnteriores() {
        this.marcas = new HashMap<>();
    }

    // Método para agregar una marca anterior
    public void agregarMarca(String añoCompeticion, double marcaSegundos) {
        marcas.put(añoCompeticion, marcaSegundos);
    }

    // Método para obtener la marca de un año específico
    public Double obtenerMarcaPorAño(String añoCompeticion) {
        return marcas.getOrDefault(añoCompeticion, null);
    }

    // Método para imprimir las marcas anteriores
    public void imprimirMarcas() {
        System.out.println("Marcas anteriores:");
        for (Entry<String, Double> entry : marcas.entrySet()) {
            System.out.println("Año: " + entry.getKey() + ", Marca: " + entry.getValue() + " segundos");
        }
    }
}
