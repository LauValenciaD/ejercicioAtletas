package ejercicioAtletas;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class Dorsal {
	private static Set <Integer> numDorsal;

	//constructor
	public Dorsal() {
		super();
		this.numDorsal = new HashSet <Integer>();
	}
	//methods generar dorsal
    public static int generarDorsal() {
        int nuevoDorsal;
        Random random = new Random();
        do {
            nuevoDorsal = random.nextInt(100) + 1; // Genera un dorsal aleatorio
        } while (numDorsal.contains(nuevoDorsal));

        numDorsal.add(nuevoDorsal);
        return nuevoDorsal;
    }
}
