package ejercicioAtletas;
import java.util.*;
import java.util.ArrayList;
public class Competicion {
	
	private List<Participante> listaParticipantes;

    public Competicion() {
        listaParticipantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante p) {
        listaParticipantes.add(p);
    }

    public void mostrarParticipantesAlfabeticamente() {
        Collections.sort(listaParticipantes, Comparator.comparing(Participante::getNombre)
                                                         .thenComparing(Participante::getDorsal));
        for (Participante participante : listaParticipantes) {
            System.out.println(participante.getNombre());
            System.out.println(participante.getDorsal());
            System.out.println(participante.getTipo());
            participante.getMarcasAnteriores().forEach((año, marca) -> {
                System.out.println(año + " " + marca);
            });
        }
    }

    public void mostrarParticipantesPorMarcas2023() {
        List<Participante> participantesOrdenados = new ArrayList<>(listaParticipantes);
        participantesOrdenados.sort(Comparator.comparing(p -> {
            OptionalInt minMarca = p.getMarcasAnteriores().entrySet().stream()
                                     .filter(entry -> entry.getKey() == 2023)
                                     .mapToInt(Map.Entry::getValue)
                                     .min();
            return minMarca.orElse(Integer.MAX_VALUE);
        }));
        for (Participante participante : participantesOrdenados) {
            System.out.println(participante.getNombre());
            System.out.println(participante.getDorsal());
            System.out.println(participante.getTipo());
            participante.getMarcasAnteriores().forEach((año, marca) -> {
                System.out.println(año + " " + marca);
            });
        }
    }

    public void mostrarParticipantesPorMarcas(int año) {
        List<Participante> participantesOrdenados = new ArrayList<>(listaParticipantes);
        participantesOrdenados.sort(Comparator.comparing(p -> {
            OptionalInt minMarca = p.getMarcasAnteriores().entrySet().stream()
                                     .filter(entry -> entry.getKey() == año)
                                     .mapToInt(Map.Entry::getValue)
                                     .min();
            return minMarca.orElse(Integer.MAX_VALUE);
        }));
        for (Participante participante : participantesOrdenados) {
            System.out.println(participante.getNombre());
            System.out.println(participante.getDorsal());
            System.out.println(participante.getTipo());
            participante.getMarcasAnteriores().forEach((añoMarcas, marca) -> {
                System.out.println(añoMarcas + " " + marca);
            });
        }
    }

    public void mostrarMejorMarca(int año) {
        List<Participante> participantesOrdenados = new ArrayList<>(listaParticipantes);
        participantesOrdenados.sort(Comparator.comparing(p -> {
            OptionalInt minMarca = p.getMarcasAnteriores().entrySet().stream()
                                     .filter(entry -> entry.getKey() == año)
                                     .mapToInt(Map.Entry::getValue)
                                     .min();
            return minMarca.orElse(Integer.MAX_VALUE);
        }));
        int marcaMasPequena = Integer.MAX_VALUE;
        for (Participante participante : participantesOrdenados) {
            for (Map.Entry<Integer, Integer> entry : participante.getMarcasAnteriores().entrySet()) {
                if (entry.getKey() == año && entry.getValue() < marcaMasPequena) {
                    marcaMasPequena = entry.getValue();
                }
            }
            for (Map.Entry<Integer, Integer> entry : participante.getMarcasAnteriores().entrySet()) {
                if (entry.getValue() == marcaMasPequena) {
                    System.out.println("Nombre: " + participante.getNombre());
                    System.out.println("Dorsal: " + participante.getDorsal());
                    System.out.println("Tipo: " + participante.getTipo());
                    System.out.println("Año: " + año + ", Marca: " + marcaMasPequena);
                }
            }
        }
    }	
}
